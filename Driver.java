import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {

        Piece pawnB = new Pawn(false, false, null);
        Piece bishopB = new Bishop(false);
        Piece kingB = new King(false);
        Piece knightB = new Knight(false);
        Piece QueenB = new Queen(false);
        Piece RookB = new Rook(false);

        Piece pawnW = new Pawn(true, false, null);
        Piece bishopW = new Bishop(true);
        Piece kingW = new King(true);
        Piece knightW = new Knight(true);
        Piece QueenW = new Queen(true);
        Piece RookW = new Rook(true);

        ArrayList<Piece> pieces = new ArrayList<>();

        pieces.add(pawnB);
        pieces.add(bishopB);
        pieces.add(kingB);
        pieces.add(knightB);
        pieces.add(QueenB);
        pieces.add(RookB);
        pieces.add(pawnW);
        pieces.add(bishopW);
        pieces.add(kingW);
        pieces.add(knightW);
        pieces.add(QueenW);
        pieces.add(RookW);

        for (Piece item : pieces) {
            System.out.println(item.toString());
        }

        Piece p1 = new Pawn(true, true, new Queen(true));
        Piece p2 = new Pawn(true, false, null);
        Piece p3 = new Pawn(false, false, null);
        Piece p4 = new Pawn(false, true, new Queen(false));
        Piece p5 = new Pawn(true, true, new Knight(true));


        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p4));
        System.out.println(p1.equals(p5));
        System.out.println(p2.equals(p3));
        System.out.println(p4.equals(p5));
    }
}
