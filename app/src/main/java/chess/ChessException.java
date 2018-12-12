package chess;

<<<<<<< HEAD
import boardgame.BoardException;

public class ChessException extends BoardException {
    private static final long serialVersionUID = 1L;

    public ChessException(String msg) {
        super(msg);
    }
}
=======
public class ChessException extends RuntimeException{

    public ChessException(String msg){
        super(msg);
    }
}
>>>>>>> 9ffaaa1266e4160955e96309a050271564b7753d
