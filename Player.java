/**
 * The `Player` class represents a player in a checkers game.
 */
public class Player {
    /**
     * Indicates whether the player is on the red side of the game.
     */
    public boolean isRedSide;

    /**
     * Indicates whether the player is a human player (as opposed to CPU).
     */
    public boolean humanPlayer;

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
