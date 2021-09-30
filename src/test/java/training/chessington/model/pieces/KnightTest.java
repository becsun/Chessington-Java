package training.chessington.model.pieces;

import org.junit.Test;
import training.chessington.model.Board;
import training.chessington.model.Coordinates;
import training.chessington.model.Move;
import training.chessington.model.PlayerColour;

import java.util.List;

import static training.chessington.model.pieces.PieceAssert.*;
import static org.assertj.core.api.Assertions.*;

public class KnightTest {
    @Test
    public void whiteKnightCanMakeLShape() {
        // Arrange
        Board board = Board.empty();
        Piece kight = new Knight(PlayerColour.WHITE);
        Coordinates coords = new Coordinates(0, 1);
        board.placePiece(coords, kight);

        // Act
        List<Move> moves = kight.getAllowedMoves(coords, board);

        // Assert
        assertThat(moves).contains(new Move(coords, coords.plus(-2, -1)));
    }
}
