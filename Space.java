/**
 * The `Space` class represents a space on the checkers game board.
 */
public class Space {
    private int x;
    private int y;
    private Piece p;

    /**
     * Initializes a new space with the specified coordinates and piece.
     *
     * @param x The X-coordinate of the space.
     * @param y The Y-coordinate of the space.
     * @param p The piece occupying the space, or null if the space is empty.
     */
    public Space(int x, int y, Piece p) {
        this.setX(x);
        this.setY(y);
        this.setP(p);
    }

    /**
     * Gets the X-coordinate of the space.
     *
     * @return The X-coordinate of the space.
     */
    public int getX() {
        return this.x;
    }

    /**
     * Sets the X-coordinate of the space.
     *
     * @param x The X-coordinate of the space.
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Gets the Y-coordinate of the space.
     *
     * @return The Y-coordinate of the space.
     */
    public int getY() {
        return this.y;
    }

    /**
     * Sets the Y-coordinate of the space.
     *
     * @param y The Y-coordinate of the space.
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Gets the piece occupying the space, or null if the space is empty.
     *
     * @return The piece occupying the space, or null if empty.
     */
    public Piece getP() {
        return this.p;
    }

    /**
     * Sets the piece occupying the space.
     *
     * @param p The piece to occupy the space, or null if the space should be empty.
     */
    public void setP(Piece p) {
        this.p = p;
    }
}
