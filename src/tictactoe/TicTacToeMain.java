package tictactoe;

import java.util.List;

public class TicTacToeMain {
    public static void main(String[] args) {
        int size = 3;
        int[][] game = new int[size][size];

        GameFeatures gameFeatures = new GameFeatures();
        Board board = new Board(game, size);
        board.getBoard();

        Player comp = new ComputerPlayer();
        Player human = new HumanPlayer();

        List<Player> players;
        players = gameFeatures.addPlayer(human, comp);

        gameFeatures.setWin(false);

        while (!gameFeatures.isWin()) {
            for (int i = 0; i < 2; i++) {
                players.get(i).makeStep(board);
                gameFeatures.checkWin(board);
                board.printBoard();
            }
        }
    }
}