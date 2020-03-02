public abstract class Piece {
    private int value;
    private boolean isWhite;

    public Piece(int value, boolean isWhite) {
        this.value = value;
        this.isWhite = isWhite;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setIsWhite(boolean white) {
        isWhite = white;
    }

    public boolean getIsWhite() {
        return isWhite;
    }

    public abstract void move();

    @Override
    public boolean equals(Object obj) {
        if (((Piece) obj).getIsWhite() == getIsWhite() && ((Piece) obj).getValue() == getValue()) {
            return true;
        }
        return false;
    }
}
