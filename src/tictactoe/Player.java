package tictactoe;


public abstract class Player {
    public String mark;
    public abstract void makeStep(Board board, int sign);

}