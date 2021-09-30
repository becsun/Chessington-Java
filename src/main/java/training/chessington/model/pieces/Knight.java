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
        ArrayList<Move> allowedMoves = new ArrayList<>();
        switch (colour) {
            case WHITE:
                //if there is no white piece
                //if they move
                if(from.getCol()-1==0){
                    allowedMoves.add(new Move(from, from.plus(-2, +1)));
                    allowedMoves.add(new Move(from, from.plus(-2, 1)));
                }
                if(from.getCol() == 7 && from.getRow() <=5){
                    allowedMoves.add(new Move(from, from.plus(2, -1)));
                    allowedMoves.add(new Move(from, from.plus(+1, -2)));
                    allowedMoves.add(new Move(from, from.plus(-1, -2)));
                    allowedMoves.add(new Move(from, from.plus(-2, -1)));
                }
                if(from.getCol()+1==7 && from.getRow()<=5){
                    allowedMoves.add(new Move(from, from.plus(-2, -1)));
                    allowedMoves.add(new Move(from, from.plus(+2, +1)));
                    allowedMoves.add(new Move(from, from.plus(-1, 2)));

                }
                if(from.getRow() == 7 && from.getCol()<=5){
                    allowedMoves.add(new Move(from, from.plus(-2, -1)));

                }
                if(from.getRow()<=5 && from.getCol()>= 2 && from.getCol()<=5){
                    allowedMoves.add(new Move(from, from.plus(-2, -1)));
                    allowedMoves.add(new Move(from, from.plus(-1, 2)));
                    allowedMoves.add(new Move(from, from.plus(-1, -2)));
                    allowedMoves.add(new Move(from, from.plus(-1, -2)));
                    allowedMoves.add(new Move(from, from.plus(2, 1)));
                    allowedMoves.add(new Move(from, from.plus(2, -1)));
                    allowedMoves.add(new Move(from, from.plus(-2, 1)));
                    allowedMoves.add(new Move(from, from.plus(1, -2)));
                    allowedMoves.add(new Move(from, from.plus(1, 2)));
                }

                if (from.getCol() == 0 && from.getRow() <= 5 && from.getRow() >= 2 ) {
                    allowedMoves.add(new Move(from, from.plus(-2, +1)));
                    allowedMoves.add(new Move(from, from.plus(2, +1)));
                    allowedMoves.add(new Move(from, from.plus(-1, 2)));
                    allowedMoves.add(new Move(from, from.plus(1, 2)));
                }

                if(from.getCol() >=1 && from.getCol()<= 6 ) {
                        allowedMoves.add(new Move(from, from.plus(-2, -1)));
                        allowedMoves.add(new Move(from, from.plus(-2, 1)));
                }
        }

                return allowedMoves;
        }
}
