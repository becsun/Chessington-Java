package training.chessington.model.pieces;

import org.apache.logging.log4j.core.pattern.AbstractStyleNameConverter;
import training.chessington.model.Board;
import training.chessington.model.Coordinates;
import training.chessington.model.Move;
import training.chessington.model.PlayerColour;

import java.util.ArrayList;

public class Pawn extends AbstractPiece {

    public Pawn(PlayerColour colour) {
        super(Piece.PieceType.PAWN, colour);
    }

    @Override
    public ArrayList<Move> getAllowedMoves(Coordinates from, Board board) {
        ArrayList<Move> allowedMoves = new ArrayList<>();
        switch (colour) {
            case WHITE:
                allowedMoves.add(new Move(from, from.plus(-1, 0)));
                if (!board.get(from).getHasMoved()) {
                    allowedMoves.add(new Move(from, from.plus(-2, 0)));
                    break;
                }
            case BLACK:
                allowedMoves.add(new Move(from, from.plus(1, 0)));
                if (!board.get(from).getHasMoved() ) {
                        allowedMoves.add(new Move(from, from.plus(2, 0)));
                    }
                    break;
                }
        return allowedMoves;
    }
}
