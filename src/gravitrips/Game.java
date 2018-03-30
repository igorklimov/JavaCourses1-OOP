package gravitrips;

public class Game {
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private int steps;
    private int sign;

    private void step() {
        steps = steps + 1;

    }

    public void startGame(int height, int width, Player player1, Player player2) {
        Board board = new Board(height, width);
        board.initializeBoard();
        board.getBoard();
        declarePlayers(player1, player2);
        game(board);
    }

    private void game(Board board) {
        board.setEndGame(false);
        steps = 1;
        while (!board.isEndGame()) {
            System.out.println("Move: " + steps);
            switchPlayer();
            currentPlayer.makeStep(board, sign);
            board.printBoard();
            board.checkWin(steps);
            step();
        }

    }

    private void declarePlayers(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    private void switchPlayer() {
        if ((steps % 2) == 0) {
            sign = 2;
            currentPlayer = player2;
        } else {
            currentPlayer = player1;
            sign = 1;
        }
    }
}