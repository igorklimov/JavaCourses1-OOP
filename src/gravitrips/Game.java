package gravitrips;

import java.util.ArrayList;
import java.util.List;

public class Game {
    public void startGame(int height, int width, Player player1, Player player2) {
        List<Player> players;
        Engine engine = new Engine();
        Board board = new Board(height, width);
        CheckWinner winner = new CheckWinner();
        board.initializeBoard();
        board.getBoard();
        players = setPlayer(player1, player2);
        game(board, players, winner, engine);
    }

    private void game(Board board, List<Player> players, CheckWinner winner, Engine engine) {
        winner.setWin(false);
        engine.setSteps(1);
        while (!winner.isWin()) {
            for (int i = 0; i < 2; i++) {
                System.out.println("Move: " + engine.getSteps());
                engine.appendSign();
                players.get(i).makeStep(board, engine.getSign());
                engine.countSteps();
                board.printBoard();
                winner.checkWin(board, engine);
                if (winner.isWin()) {
                    break;
                }
            }
        }
    }

    private List<Player> setPlayer(Player player1, Player player2) {
        List<Player> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
        return players;
    }
}
