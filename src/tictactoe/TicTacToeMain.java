package tictactoe;

public class TicTacToeMain {
    public static void main(String[] args) {
        int size = 3;
        int[][] game = new int[size][size];

        Board board = new Board(game, size);
        board.getBoard();

        Player comp = new ComputerPlayer();
        Player human = new HumanPlayer();

        boolean win = false;

        while (!win) {
            human.makeStep(board);
            board.printBoard();
            comp.makeStep(board);
            board.printBoard();
            board.checkWin();
        }
    }
}