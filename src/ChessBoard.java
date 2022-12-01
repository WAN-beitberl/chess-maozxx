public class ChessBoard {

    public IPiece getPiece(int x1, int y1) {
        return arr[x1][y1].getPiece();
    }

    interface ISquare{
        IPiece getPiece();
        void setPiece(IPiece piece);
    }

    class Square implements ISquare{

        private IPiece piece;

        @Override
        public IPiece getPiece() {
            return piece;
        }

        @Override
        public void setPiece(IPiece piece) {
            this.piece=piece;
        }
    }

    ISquare[][] arr = new ISquare[8][8];

    void initGame(){
        arr[0][0].setPiece(new Tura(true));
        for (int i = 0; i <7; i++) {
            arr[i][1].setPiece( new Piyon(true));
        }
    }
}
