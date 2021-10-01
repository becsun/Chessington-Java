package training.chessington.model.pieces;

import training.chessington.model.Board;
import training.chessington.model.Coordinates;
import training.chessington.model.Move;
import training.chessington.model.PlayerColour;

import java.util.ArrayList;

public class Knight extends AbstractPiece {
    public Knight(PlayerColour colour) {
        super(PieceType.KNIGHT, colour);
    }

    @Override
    public ArrayList<Move> getAllowedMoves(Coordinates from, Board board) {
        ArrayList<Move> potentialMoves = new ArrayList<>();
        ArrayList<Move> movesAllowed = new ArrayList<>();


        potentialMoves.add(new Move(from, from.plus(-2, -1)));
        potentialMoves.add(new Move(from, from.plus(-2, 1)));
        potentialMoves.add(new Move(from, from.plus(2, -1)));
        potentialMoves.add(new Move(from, from.plus(2, 1)));
        potentialMoves.add(new Move(from, from.plus(1, -2)));
        potentialMoves.add(new Move(from, from.plus(-1, 2)));
        potentialMoves.add(new Move(from, from.plus(1, 2)));
        potentialMoves.add(new Move(from, from.plus(-1, -2)));

        potentialMoves.stream().forEach( move -> {
            if ( board.isValid(move,this.colour) ){
                 movesAllowed.add(move);
            }
        });


        return movesAllowed;
    }
}

