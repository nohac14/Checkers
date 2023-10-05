import java.util.ArrayList;
import java.util.List;

/**
 * The `Game` class represents a game of checkers and manages the game state and rules.
 */
public class Game {
    private Player[] players;
    private Board board;
    private Player currentTurn;
    private Status status;
    private List<Move> movesPlayed;

    /**
     * Initializes a new game with two players.
     *
     * @param p1 The first player.
     * @param p2 The second player.
     */
    public Game(Player p1, Player p2) {
        players = new Player[2];
        movesPlayed = new ArrayList<>();
        initialize(p1, p2);
    }

    /**
     * Initializes the game with the specified players and sets up the initial board state.
     *
     * @param p1 The first player.
     * @param p2 The second player.
     */
    private void initialize(Player p1, Player p2) {
        players[0] = p1;
        players[1] = p2;

        board.resetBoard();

        if (p1.isRedSide()) {
            currentTurn = p1;
        } else {
            currentTurn = p2;
        }

        movesPlayed.clear();
        status = Status.ACTIVE;
    }

    /**
     * Checks if the game has ended.
     *
     * @return true if the game has ended, false otherwise.
     */
    public boolean isEnd() {
        return status != Status.ACTIVE;
    }

    /**
     * Gets the current status of the game.
     *
     * @return The current game status.
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Allows a player to make a move on the game board.
     *
     * @param player  The player making the move.
     * @param startX  The X-coordinate of the starting position.
     * @param startY  The Y-coordinate of the starting position.
     * @param endX    The X-coordinate of the ending position.
     * @param endY    The Y-coordinate of the ending position.
     * @return true if the move is successful, false otherwise.
     * @throws Exception If an invalid board index is provided.
     */
    public boolean playerMove(Player player, int startX, int startY, int endX, int endY) throws Exception {
        Space startBox = board.getBox(startX, startY);
        Space endBox = board.getBox(endX, endY);

        Move move = new Move(player, startBox, endBox);
        return makeMove(move, player);
    }

    /**
     * Makes a move on the game board and updates the game state.
     *
     * @param move    The move to be made.
     * @param player  The player making the move.
     * @return true if the move is successful, false otherwise.
     * @throws Exception If an invalid board index is provided.
     */
    private boolean makeMove(Move move, Player player) throws Exception {
        Piece sourcePiece = move.getStart().getP();
        if (sourcePiece == null) {
            return false;
        }

        // Ensure it's the player's turn
        if (player != currentTurn) {
            return false;
        }

        // Ensure the source piece belongs to the current player
        if (sourcePiece.isRed() != player.isRedSide()) {
            return false;
        }

        // Check if the move is valid
        if (!sourcePiece.canMove(board, move.getStart(), move.getEnd())) {
            return false;
        }

        // Check if there's a piece at the destination (capture)
        Piece destPiece = move.getEnd().getP();
        if (destPiece != null) {
            destPiece.setDead(true);
            move.setPieceKilled(destPiece);
        }

        // Store the move
        movesPlayed.add(move);

        // Move the piece from the start box to the end box
        move.getEnd().setP(move.getStart().getP());
        move.getStart().setP(null);

        // Check for game end conditions
        if (isGameEnd()) {
            if (player.isRedSide()) {
                status = Status.RED_WIN;
            } else {
                status = Status.BLACK_WIN;
            }
        } else {
            // Switch the current turn to the other player
            currentTurn = (currentTurn == players[0]) ? players[1] : players[0];
        }

        return true;
    }

    /**
     * Checks if the game has reached its end based on specific conditions.
     *
     * @return true if the game has ended, false otherwise.
     * @throws Exception If an invalid board index is provided.
     */
    private boolean isGameEnd() throws Exception {
        boolean redCanMove = false;
        boolean blackCanMove = false;

        for (Player player : players) {
            boolean canMove = false;

            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    Space startBox = board.getBox(i, j);
                    Piece piece = startBox.getP();
                    if (piece != null && piece.isRed() == player.isRedSide() && !piece.isDead()) {
                        // Check if the piece can make any valid move
                        for (int deltaX = -1; deltaX <= 1; deltaX++) {
                            for (int deltaY = -1; deltaY <= 1; deltaY++) {
                                Space endBox = board.getBox(i + deltaX, j + deltaY);
                                if (piece.canMove(board, startBox, endBox)) {
                                    canMove = true;
                                    break;
                                }
                            }
                            if (canMove) {
                                break;
                            }
                        }
                    }
                    if (canMove) {
                        break;
                    }
                }
                if (canMove) {
                    break;
                }
            }

            if (player.isRedSide()) {
                redCanMove = canMove;
            } else {
                blackCanMove = canMove;
            }
        }

        // Check game end conditions
        if (!redCanMove || !blackCanMove) {
            return true;
        }

        return false;
    }
}
