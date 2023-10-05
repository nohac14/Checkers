/**
 * The `Piece` class represents a piece on the checkers board.
 */
public class Piece {
    private boolean isDead = false;
    private boolean isRed = false;
    private boolean isKing = false;

    /**
     * Initializes a new piece with the specified properties.
     *
     * @param isDead  Indicates whether the piece is dead (captured).
     * @param isRed   Indicates whether the piece is on the red side of the game.
     * @param isKing  Indicates whether the piece is a king.
     */
    public Piece(boolean isDead, boolean isRed, boolean isKing) {
        this.setDead(isDead);
        this.setRed(isRed);
        this.setKing(isKing);
    }

    /**
     * Checks if the piece is dead (captured).
     *
     * @return true if the piece is dead, false otherwise.
     */
    public boolean isDead() {
        return this.isDead;
    }

    /**
     * Sets whether the piece is dead (captured).
     *
     * @param isDead true to mark the piece as dead, false otherwise.
     */
    public void setDead(boolean isDead) {
        this.isDead = isDead;
    }

    /**
     * Checks if the piece is on the red side of the game.
     *
     * @return true if the piece is on the red side, false otherwise.
     */
    public boolean isRed() {
        return this.isRed;
    }

    /**
     * Sets whether the piece is on the red side of the game.
     *
     * @param isRed true to place the piece on the red side, false otherwise.
     */
    public void setRed(boolean isRed) {
        this.isRed = isRed;
    }

    /**
     * Checks if the piece is a king.
     *
     * @return true if the piece is a king, false otherwise.
     */
    public boolean isKing() {
        return this.isKing;
    }

    /**
     * Sets whether the piece is a king.
     *
     * @param isKing true to make the piece a king, false otherwise.
     */
    public void setKing(boolean isKing) {
        this.isKing = isKing;
    }

    /**
     * Checks if the piece can move from the start space to the end space on the board.
     *
     * @param board The game board.
     * @param start The starting space of the move.
     * @param end   The ending space of the move.
     * @return true if the move is valid, false otherwise.
     */
    public boolean canMove(Board board, Space start, Space end) {
        // Check if the piece can move to a spot that doesn't have a piece of the same color
        if (end.getP().isRed() == this.isRed()) { 
            return false; 
        } 
  
        int x = Math.abs(start.getX() - end.getX());
        int y = Math.abs(start.getY() - end.getY());
    
        // Checker can only move one space diagonally
        return x == 1 && y == 1;
    }
}
