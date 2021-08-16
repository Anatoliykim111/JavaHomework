package Day17;

public class ChessBoard {
    private ChessPiece[][] chessFigures;

    public ChessBoard(ChessPiece[][] chessFigures){
       this.chessFigures = chessFigures;
    }
    public void print(){
        for (int i = 0; i < chessFigures.length; i++){
            for (int j = 0; j < chessFigures[i].length; j++){
                System.out.print(chessFigures[i][j].getFigure());
            }
            System.out.println();
        }
    }
}
