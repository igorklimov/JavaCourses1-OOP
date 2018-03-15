package tictactoe;

import java.util.ArrayList;
import java.util.List;

public class GameFeatures {
    private boolean win;
    private int steps = 1;

    private int getSteps() {
        return steps;
    }

    private void setSteps(int steps) {
        this.steps = steps;
    }

    private void setWin(boolean win) {
        this.win = win;
    }

    private boolean isWin() {
        return win;
    }

    private List<Player> addPlayer(Player player1, Player player2) {
        List<Player> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
        return players;
    }

    private int countSteps() {
        setSteps(steps = steps + 1);
        return getSteps();
    }

    private boolean checkWin(Board board) {
        boolean a = getWinnerVertical(board);
        boolean b = getWinnerHorizontal(board);
        boolean c = getWinnerDiagonalRightToLeft(board);
        boolean d = getWinnerDiagonalLeftToRight(board);
        boolean e = noWinner(board);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        if (a || b || c || d) {
            setWin(true);
            if (getSteps() % 2 == 0) {
                System.out.println("Player 1 won");
            } else {
                System.out.println("Player 2 won");
            }
        } else if (e) {
            setWin(true);
            System.out.println("No one won");
        }
        return isWin();
    }

    private boolean getWinnerVertical(Board board) {
        int i;
        int j;
        int[][] actualBoard = board.getBoard();
        for (i = 0; i < actualBoard.length - 2; i++) {
            for (j = 0; j < actualBoard.length; j++) {
                if ((actualBoard[i][j] == actualBoard[i + 1][j]) && (actualBoard[i][j] == actualBoard[i + 2][j]) && (actualBoard[i][j] != 0)) {
                    win = true;
                } else {
                    win = false;
                }
            }
        }
        return win;
    }

    private boolean getWinnerHorizontal(Board board) {
        int i;
        int j;
        int[][] actualBoard = board.getBoard();
        for (i = 0; i < actualBoard.length; i++) {
            for (j = 0; j < actualBoard.length - 2; j++) {
                if ((actualBoard[i][j] == actualBoard[i][j + 1]) && (actualBoard[i][j] == actualBoard[i][j + 2]) && (actualBoard[i][j] != 0)) {
                    win = true;
                } else {
                    win = false;
                }
            }
        }
        return win;
    }

    private boolean getWinnerDiagonalLeftToRight(Board board) {
        int i;
        int j;
        int[][] actualBoard = board.getBoard();
        for (i = 0; i < (actualBoard.length - 2); i++) {
            for (j = 0; j < (actualBoard.length - 2); j++) {
                if ((actualBoard[i][j] == actualBoard[i + 1][j + 1]) && (actualBoard[i][j] == actualBoard[i + 2][j + 2]) && (actualBoard[i][j] != 0)) {
                    win = true;
                } else {
                    win = false;
                }
            }
        }
        return win;
    }

    private boolean getWinnerDiagonalRightToLeft(Board board) {
        int i;
        int j;
        int[][] actualBoard = board.getBoard();
        for (i = 2; i < actualBoard.length; i++) {
            for (j = 0; j < actualBoard.length - 2; j++) {
                if ((actualBoard[i][j] == actualBoard[i - 1][j + 1]) && (actualBoard[i][j] == actualBoard[i - 2][j + 2]) && (actualBoard[i][j] != 0)) {
                    win = true;
                } else {
                    win = false;
                }
            }
        }
        return win;
    }

    private boolean noWinner(Board board) {
        if (getSteps() > board.getSize() * board.getSize()) {
            win = true;
        }
        return win;
    }

    private void loadGame(Board board, List<Player> players) {
        setWin(false);
        while (!isWin()) {
            for (int i = 0; i < 2; i++) {
                System.out.println("Move: " + getSteps());
                countSteps();
                players.get(i).makeStep(board);
                board.printBoard();
                checkWin(board);
                if (isWin()) {
                    break;
                }
            }
        }
    }

    public void startGame(int size) {
        int[][] game = new int[size][size];
        List<Player> players;
        Player comp = new ComputerPlayer();
        Player human = new HumanPlayer();
        Board board = new Board(game, size);

        board.getBoard();
        players = addPlayer(human, comp);
        loadGame(board, players);
    }
}
