/**
 * The `Status` enum represents the different states of a checkers game.
 */
public enum Status {
    /**
     * The game is active and ongoing.
     */
    ACTIVE,

    /**
     * The black player has won the game.
     */
    BLACK_WIN,

    /**
     * The red player has won the game.
     */
    RED_WIN,

    /**
     * One of the players has forfeited the game.
     */
    FORFEIT,

    /**
     * The game has ended in a stalemate (a draw with no winner).
     */
    STALEMATE,

    /**
     * The game has been quit or prematurely ended.
     */
    QUIT
}
