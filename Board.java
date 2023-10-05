/**
 * The `Board` class represents the game board for a checkers game.
 */
public class Board {
    Space[][] boxes;

    /**
     * Initializes a new game board and resets it to the starting state.
     */
    public Board() {
        this.boxes = new Space[8][8];
        this.resetBoard();
    }

    /**
     * Gets the space (box) at the specified coordinates on the game board.
     *
     * @param x The X-coordinate of the space.
     * @param y The Y-coordinate of the space.
     * @return The space at the specified coordinates.
     * @throws Exception If the provided coordinates are out of bounds.
     */
    public Space getBox(int x, int y) throws Exception {
        if (x < 0 || x > 7 || y < 0 || y > 7) {
            throw new Exception("Index out of bound");
        }
        return boxes[x][y];
    }

    /**
     * Resets the game board to the starting state, initializing boxes without any pieces.
     * It also initializes the red and black pieces on the board.
     */
    public void resetBoard() {
        // Initialize boxes without any piece
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j += 2) {
                boxes[i][j] = new Space(i, j, null);
            }
        }

        // Initialize red pieces
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 8; j += 2) {
                boxes[i][j] = new Space(i, j, new Piece(false, true, false));
            }
        }

        // Initialize black pieces
        for (int i = 6; i < 8; i++) {
            for (int j = 0; j < 8; j += 2) {
                boxes[i][j] = new Space(i, j, new Piece(false, false, false));
            }
        }
    }
}
