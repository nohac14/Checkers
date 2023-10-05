public class Space {
    private int x;
    private int y;
    private Piece p;

    public Space(int x, int y, Piece p) {
        this.setX(x);
        this.setY(y);
        this.setP(p);
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }
    
    public void setY(int y) {
        this.y = y;
    }

    public Piece getP() {
        return this.p;
    }

    public void setP(Piece p) {
        this.p = p;
    }
}