package elearning.base.sharedboardmanagement.application;

import elearning.base.infrastructure.persistence.PersistenceContext;
import elearning.base.sharedboardmanagement.domain.*;
import elearning.base.sharedboardmanagement.domain.exceptions.InvalidPostItLocationException;
import elearning.base.sharedboardmanagement.domain.exceptions.NoImageException;
import elearning.base.sharedboardmanagement.domain.exceptions.NoPermissionExeception;
import elearning.base.sharedboardmanagement.domain.exceptions.PostItInvalidRowColumnException;
import elearning.base.usermanagment.auth.AuthRegisters;
import elearning.base.usermanagment.auth.AuthorizationService;
import elearning.base.usermanagment.domain.User;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Base64;
import java.util.List;


public class PostItService {

    private final AuthorizationService authorizationService = AuthRegisters.authorizationService();

    public List<SharedBoard> listUserBoards(User user){
        return PersistenceContext.repositories().sharedBoard().findByUser(user).get();
    }

    public boolean createPostIt(SharedBoard board, int row, int column, PostItType type, String content) {

        try{

            validateUserPermission(board,authorizationService.session().get());
            validateBoardRowAndColumn(board,row,column);

            if(type.type().equals(PostItTypes.TYPE_IMAGE)){
                validateImagePath(content);

                String directoryPath = "shared.board.server/src/main/java/elearning/sharedboard/http/server/www/images";
                String fileName = Paths.get(content).getFileName().toString();
                String newPath = directoryPath + "/" + board.identity().title() + "_" + row + "_" + column + "_" + fileName;

                Path sourcePath  = Path.of(content);
                Path destinationPath  = Path.of(newPath);

                Files.copy(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);

                BufferedImage image = ImageIO.read(new File(destinationPath.toString()));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ImageIO.write(image, "jpg", byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                content =  Base64.getEncoder().encodeToString(byteArray);


                //content = destinationPath.toString();
            }


            BoardRow boardRow = board.rows().get(row);
            BoardColumn boardColumn = board.columns().get(column);

            PostItBuilder postItBuilder = new PostItBuilder();
            postItBuilder.defineRow(boardRow).defineColumn(boardColumn).defineType(type).defineContent(content);
            PostIt postIt = postItBuilder.build();

            board.addPostIt(postIt);


            User me = authorizationService.session().get();
            board.logs().add(new BoardLog(me,new BoardChangeTimestamp(Timestamp.valueOf(LocalDateTime.now())),null,postIt));

            PersistenceContext.repositories().sharedBoard().save(board);

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            return false;
        }

        return true;
    }

    private void validateUserPermission(SharedBoard board, User user) {

        if(!(board.hasWritingPermission(user) || user.equals(board.owner()))){
            throw new NoPermissionExeception();
        }

    }

    private void validateBoardRowAndColumn(SharedBoard board, int row, int column) {

        if(row >= 0 && row < board.rows().size() && column >= 0 && column < board.columns().size()){

            for (PostIt p: board.postIts()){
                if(p.boardRow().index().index() == row && p.boardColumn().index().index() == column){
                    throw new InvalidPostItLocationException();
                }
            }
        }else {
            throw new PostItInvalidRowColumnException();
        }
    }

    private void validateImagePath(String content) {
        File file = new File(content);
        if (file.exists() && !file.isDirectory()) {
            if (!content.matches(".*\\.(jpg|jpeg|png)$")) {
                throw new NoImageException();
            }
        }
    }


    public SharedBoard changePositionPostIt(SharedBoard board, PostIt postIt, int row, int column) {
        validateUserPermission(board, authorizationService.session().get());
        validateBoardRowAndColumn(board, row, column);

        PostIt oldPostIt = new PostIt(postIt.type(), postIt.content(), postIt.boardRow(), postIt.boardColumn());

        postIt.changePosition(board.rows().get(row), board.columns().get(column));

        board.logs().add(new BoardLog(authorizationService.session().get(), new BoardChangeTimestamp(Timestamp.valueOf(LocalDateTime.now())), oldPostIt, postIt));
        return PersistenceContext.repositories().sharedBoard().save(board);
    }

    public SharedBoard changeTextPostIt(SharedBoard board, PostIt postIt, String text) {
        validateUserPermission(board, authorizationService.session().get());

        PostIt oldPostIt = new PostIt(postIt.type(), postIt.content(), postIt.boardRow(), postIt.boardColumn());

        postIt.changeText(text);

        board.logs().add(new BoardLog(authorizationService.session().get(), new BoardChangeTimestamp(Timestamp.valueOf(LocalDateTime.now())), oldPostIt, postIt));
        return PersistenceContext.repositories().sharedBoard().save(board);
    }

    public SharedBoard changeImagePostIt(SharedBoard board, PostIt postIt, String image) {
        validateUserPermission(board, authorizationService.session().get());
        validateImagePath(image);

        PostIt oldPostIt = new PostIt(postIt.type(), postIt.content(), postIt.boardRow(), postIt.boardColumn());

        try {
            validateImagePath(image);

            String directoryPath = "shared.board.server/src/main/java/elearning/sharedboard/http/server/www/images";
            String fileName = Paths.get(image).getFileName().toString();
            String newPath = directoryPath + "/" + board.identity().title() + "_" + postIt.boardRow().index().index() + "_" + postIt.boardColumn().index().index() + "_" + fileName;

            Path sourcePath  = Path.of(image);
            Path destinationPath  = Path.of(newPath);

            Files.copy(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);

            image = destinationPath.toString();
        } catch (Exception e){
            System.out.println("ERROR: " + e.getMessage());
            return null;
        }

        postIt.changeImage(image);

        board.logs().add(new BoardLog(authorizationService.session().get(), new BoardChangeTimestamp(Timestamp.valueOf(LocalDateTime.now())), oldPostIt, postIt));
        return PersistenceContext.repositories().sharedBoard().save(board);
    }
}
