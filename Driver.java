public class Driver {
    public static void main(String[] args) {
    //     // Create players
    //     Player player1 = new Player(true, true); // Red, Human
    //     Player player2 = new Player(false, false); // Black, AI

    //     // Create a game board
    //     Board board = new Board();

    //     // Create a new game
    //     Game game = new Game(player1, player2);

    //     // Display the initial game status
    //     System.out.println("Initial Game Status: " + game.getStatus());

    //     // Display the initial state of the board
    //     System.out.println("Initial Game Board:");
    //     displayBoard(board);

    //     // Simulate some moves
    //     try {
    //         game.playerMove(player1, 2, 1, 3, 2);
    //         game.playerMove(player2, 5, 2, 4, 3);
    //         game.playerMove(player1, 3, 2, 5, 4); // Invalid move
    //         game.playerMove(player1, 2, 3, 3, 4); // Valid move
    //         game.playerMove(player2, 4, 3, 2, 5); // Valid move
    //     } catch (Exception e) {
    //         System.out.println("Error: " + e.getMessage());
    //     }

    //     // Display the final game status
    //     System.out.println("Final Game Status: " + game.getStatus());

    //     // Display the final state of the board
    //     System.out.println("Final Game Board:");
    //     displayBoard(board);
    // }

    // // Helper method to display the game board
    // private static void displayBoard(Board board) {
    //     for (int i = 1 ; i < 9 ; i++) {
    //         System.out.print(i + " ");
    //     }

    //     for (int i = 0; i < 8; i++) {
    //         for (int j = 0; j < 8; j++) {
    //             Space space = board.boxes[i][j];
    //             Piece piece = space.getP();
    //             if (piece == null) {
    //                 System.out.print("E "); // Empty space
    //             } else if (piece.isRed()) {
    //                 System.out.print("R "); // Red piece
    //             } else {
    //                 System.out.print("B "); // Black piece
    //             }
    //         }
    //         System.out.println(); // Move to the next row
    //     }
    }
}
