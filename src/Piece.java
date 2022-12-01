public abstract class Piece implements IPiece {
    boolean isWhite;

    public Piece( boolean color)
    {
        this.isWhite = color;
    }

    @Override
    public boolean isWhite() {
        return isWhite;
    }
}
