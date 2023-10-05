public class Move {
    private Player player;
    private Space start;
    private Space end;
    private Piece pieceMoved;
    private Piece pieceKilled;
  
    public Move(Player player, Space start, Space end)
    {
        this.player = player;
        this.start = start;
        this.end = end;
        this.pieceMoved = start.getP();
    }
}
