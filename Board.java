public class Board {
    Space[][] boxes;
  
    public Board()
    {
        this.resetBoard();
    }
  
    public Space getBox(int x, int y) throws Exception
    {
  
        if (x < 0 || x > 7 || y < 0 || y > 7) {
            throw new Exception("Index out of bound");
        }
  
        return boxes[x][y];
    }
  
    public void resetBoard()
    {
        // initialize boxes without any piece
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                boxes[i][j] = new Space(i, j, null);
            }
        }
        
        // initialize red pieces
        for (int i = 0 ; i < 3 ; i++) {
            for (int j = 0 ; j < 8 ; j+=2) {
                boxes[i][j] = new Space(i, j, new Piece(false, true, false));
            }
        }
        // boxes[0][0] = new Space(0, 0, new Rook(true));
        // boxes[0][1] = new Space(0, 1, new Knight(true));
        // boxes[0][2] = new Space(0, 2, new Bishop(true));
        // //...
        // boxes[1][0] = new Space(1, 0, new Pawn(true));
        // boxes[1][1] = new Space(1, 1, new Pawn(true));
        // //...
  
        // initialize black pieces
        for (int i = 6 ; i < 8 ; i++) {
            for (int j = 0 ; j < 8 ; j+=2) {
                boxes[i][j] = new Space(i, j, new Piece(false, true, false));
            }
        }
        // boxes[7][0] = new Space(7, 0, new Rook(false));
        // boxes[7][1] = new Space(7, 1, new Knight(false));
        // boxes[7][2] = new Space(7, 2, new Bishop(false));
        // //...
        // boxes[6][0] = new Space(6, 0, new Pawn(false));
        // boxes[6][1] = new Space(6, 1, new Pawn(false));
        // //...
    }
}
