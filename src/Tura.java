public  class Tura implements IPiece {
    boolean color;

    public Tura( boolean color)
    {
        this.color = color;
    }
    public void checkMove()
    {

    }


    @Override
    public boolean isWhite() {
        return false;
    }

    @Override
    public boolean checkMove(GameManager.Move nextMove) {
        return false;
    }
}
