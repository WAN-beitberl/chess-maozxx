import java.awt.*;

import static java.awt.Color.WHITE;

public class GameManager {

    private ChessBoard chessBoard;

    public GameManager(ChessBoard chessBoard) {
        this.chessBoard = chessBoard;
    }

    class Move{
    int x1;
    int y1;
    int x2;
    int y2;

    public Move(int     x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
}
    private PLAYER_COLOR currentPlayer;

    enum STATE{
        SHACH,
        MAT,
        PAT,
        IN_GAME
    }
    enum PLAYER_COLOR{
        WHITE,
        BLACK
    }

    STATE state;



    void StartGame(){
        state = STATE.IN_GAME;
        currentPlayer = PLAYER_COLOR.WHITE;
        while(state == STATE.IN_GAME){
            PlayerMove();
            updateGameState();
        }
    }

    private void updateGameState() {
        switchPlayer();
    }

    private void switchPlayer() {
        if(currentPlayer == PLAYER_COLOR.WHITE){
            currentPlayer = PLAYER_COLOR.BLACK;
        }else{
            currentPlayer = PLAYER_COLOR.WHITE;
        }
    }

    private void PlayerMove() {
        Move nextMove = inputNextMove();
        if(!chessBoard.getPiece(nextMove.x1,nextMove.y1).checkMove(nextMove)){
            state = STATE.MAT;
        }


    }



    private Move inputNextMove() {
        return new Move(5,1,5,3);
    }

}
