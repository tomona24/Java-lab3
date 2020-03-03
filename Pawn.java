public class Pawn extends Piece {
    private boolean promoted;
    private Piece newPiece;

    public Pawn(boolean isWhite) {
        super(1, isWhite);
    }

    public void promote(Piece newPiece) {
        if (!promoted) {
            this.promoted = true;
            this.newPiece = newPiece;
        }
    }

    public Piece getNewPiece() {
        return newPiece;
    }

    public boolean isPromoted() {
        return promoted;
    }

    @Override
    public void move() {
        System.out.println("Forward 1");
    }

    @Override
    public String toString() {
        return "Pawn{value='" + getValue() +'\'' + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (((Piece) obj).getIsWhite() == getIsWhite() && ((Piece) obj).getValue() == getValue()) {
            if (((Pawn) obj).isPromoted() == this.isPromoted() && ((Pawn) obj).getNewPiece() == this.getNewPiece()) {
                return true;
            }
        }
        return false;
    }


}


