package tictactoe;


public abstract class Player {
    public int f = 0;
    public String turn;

    public void setTurn(String turn) {
        this.turn = turn;
    }

    public String getTurn() {
        return turn;
    }



    public abstract int[][] makeStep(Board board);

    public abstract boolean switchPlayer();

}