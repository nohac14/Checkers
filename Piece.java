public class Piece {
    private boolean isDead = false;
    private boolean isRed = false;
    private boolean isKing = false;

    public Piece(boolean isDead, boolean isRed, boolean isKing) {
        this.setDead(isDead);
        this.setWhite(isRed);
        this.setKing(isKing);
    }

    public boolean isDead() {
        return this.isDead;
    }

    public void setDead(boolean isDead) {
        this.isDead = isDead;
    }

    public boolean isRed() {
        return this.isRed;
    }

    public void setWhite(boolean isRed) {
        this.isRed = isRed;
    }

    public boolean isKing() {
        return this.isKing;
    }

    public void setKing(boolean isKing) {
        this.isKing = isKing;
    }

    // public abstract boolean canMove(Board board, Space start, Space end);
}