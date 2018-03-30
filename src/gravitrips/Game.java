package gravitrips;

public class Game {
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private int sign;



    public void startGame(int height, int width, Player player1, Player player2) {
        Board board = new Board(height, width);
        board.initializeBoard();
        board.getBoard();
        declarePlayers(player1, player2);
        game(board);
    }

    private void game(Board board) {
        while (!board.checkWin()) {
            System.out.println("Move: " + board.getSteps());
            switchPlayer(board);
            currentPlayer.makeStep(board, sign);
            board.printBoard();
        }

    }

    private void declarePlayers(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    private void switchPlayer(Board board) {
        if ((board.getSteps() % 2) == 0) {
            sign = 2;
            currentPlayer = player2;
        } else {
            currentPlayer = player1;
            sign = 1;
        }
    }
}