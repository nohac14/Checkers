/**
 * The `Move` class represents a move made by a player in a game of checkers.
 */
public class Move {
    private Player player;
    private Space start;
    private Space end;
    private Piece pieceMoved;
    private Piece pieceKilled;

    /**
     * Initializes a new move with the player making the move and the starting and ending spaces.
     *
     * @param player     The player making the move.
     * @param start      The starting space of the move.
     * @param end        The ending space of the move.
     */
    public Move(Player player, Space start, Space end) {
        this.player = player;
        this.start = start;
        this.end = end;
        this.pieceMoved = start.getP();
    }

    /**
     * Gets the player who made the move.
     *
     * @return The player who made the move.
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * Sets the player who made the move.
     *
     * @param player The player who made the move.
     */
    public void setPlayer(Player player) {
        this.player = player;
    }

    /**
     * Gets the starting space of the move.
     *
     * @return The starting space of the move.
     */
    public Space getStart() {
        return start;
    }

    /**
     * Sets the starting space of the move.
     *
     * @param start The starting space of the move.
     */
    public void setStart(Space start) {
        this.start = start;
    }

    /**
     * Gets the ending space of the move.
     *
     * @return The ending space of the move.
     */
    public Space getEnd() {
        return end;
    }

    /**
     * Sets the ending space of the move.
     *
     * @param end The ending space of the move.
     */
    public void setEnd(Space end) {
        this.end = end;
    }

    /**
     * Gets the piece that was moved during the move.
     *
     * @return The piece that was moved.
     */
    public Piece getPieceMoved() {
        return pieceMoved;
    }

    /**
     * Sets the piece that was moved during the move.
     *
     * @param pieceMoved The piece that was moved.
     */
    public void setPieceMoved(Piece pieceMoved) {
        this.pieceMoved = pieceMoved;
    }

    /**
     * Gets the piece that was killed (captured) during the move, if any.
     *
     * @return The piece that was killed, or null if no piece was killed.
     */
    public Piece getPieceKilled() {
        return pieceKilled;
    }

    /**
     * Sets the piece that was killed (captured) during the move.
     *
     * @param pieceKilled The piece that was killed, or null if no piece was killed.
     */
    public void setPieceKilled(Piece pieceKilled) {
        this.pieceKilled = pieceKilled;
    }
}
