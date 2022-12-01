public  class Piyon extends Piece implements IPiece{
    boolean color;

    public Piyon(boolean color)
    {
      super(color);
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
