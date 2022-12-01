public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        ChessBoard chessBoard = new ChessBoard();
        chessBoard.initGame();

        GameManager gameManager = new GameManager(chessBoard);
        gameManager.StartGame();

    }
}
