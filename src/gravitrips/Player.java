package gravitrips;

public abstract class Player {
    public final int MIN = -1;
    public abstract void makeStep(Board board, int sign);
}
