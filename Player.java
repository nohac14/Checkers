/**
 * The `Player` class represents a player in a checkers game.
 */
public class Player {
    /**
     * Indicates whether the player is on the red side of the game.
     */
    private boolean isRedSide;

    /**
     * Indicates whether the player is a human player (as opposed to CPU).
     */
    private boolean humanPlayer;

    /**
     * Initializes a new piece with the specified properties.
     *
     * @param isRedSide  Indicates whether the player is on the red side.
     * @param isHumanPlayer   Indicates whether the player is human.
     */
    public Player(boolean isRedSide, boolean isHumanPlayer) {
        this.isRedSide = isRedSide;
        this.humanPlayer = isHumanPlayer;
    }

    /**
     * Checks if the player is on the red side of the game.
     *
     * @return true if the player is on the red side, false otherwise.
     */
    public boolean isRedSide() {
        return this.isRedSide;
    }

    /**
     * Checks if the player is a human player.
     *
     * @return true if the player is a human player, false otherwise.
     */
    public boolean isHumanPlayer() {
        return this.humanPlayer;
    }
}
