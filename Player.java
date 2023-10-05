public abstract class Player {
    public boolean isRedSide;
    public boolean humanPlayer;
  
    public boolean isWhiteSide()
    {
        return this.isRedSide;
    }
    public boolean isHumanPlayer()
    {
        return this.humanPlayer;
    }
}
