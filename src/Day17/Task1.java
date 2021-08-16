package Day17;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece[] chessFigures = new ChessPiece[8];
        chessFigures[0] = ChessPiece.PAWN_WHITE;
        chessFigures[1] = ChessPiece.PAWN_WHITE;
        chessFigures[2] = ChessPiece.PAWN_WHITE;
        chessFigures[3] = ChessPiece.PAWN_WHITE;
        chessFigures[4] = ChessPiece.ROOK_BLACK;
        chessFigures[5] = ChessPiece.ROOK_BLACK;
        chessFigures[6] = ChessPiece.ROOK_BLACK;
        chessFigures[7] = ChessPiece.ROOK_BLACK;

        for (ChessPiece chessFigure : chessFigures) {
            System.out.print(chessFigure.getFigure());
        }
    }
}
