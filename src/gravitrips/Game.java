package gravitrips;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Player> players = new ArrayList<>();

    public void startGame(int height, int width, Player player1, Player player2) {
        Engine engine = new Engine();
        Board board = new Board(height, width);
        board.initializeBoard();
        board.getBoard();
        declarePlayers(player1, player2);
        game(board, players, engine);
    }

    private void game(Board board, List<Player> players, Engine engine) {
        board.setWin(false);
        engine.setSteps(1);
        while (!board.isWin()) {
            for (int i = 0; i < 2; i++) {
                System.out.println("Move: " + engine.getSteps());
                engine.switchPlayer();
                players.get(i).makeStep(board, engine.getSign());
                engine.step();
                board.printBoard();
                board.checkWin(engine);
                if (board.isWin()) {
                    break;
                }
            }
        }
    }

    private List<Player> declarePlayers(Player player1, Player player2) {
        players.add(player1);
        players.add(player2);
        return players;
    }
}
