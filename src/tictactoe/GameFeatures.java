package tictactoe;

import java.util.ArrayList;
import java.util.List;

public class GameFeatures {
    private boolean win;
    private int steps;
    private int sign;

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

    private void countSteps() {
        steps = steps + 1;
        setSteps(steps);
    }

    private void appendSign() {
        if ((steps % 2) == 0) {
            sign = 2;
        } else {
            sign = 1;
        }
    }

    private void loadGame(Board board, List<Player> players) {
        setWin(false);
        steps = 1;
        while (!isWin()) {
            for (int i = 0; i < 2; i++) {
                System.out.println("Move: " + getSteps());
                appendSign();
                players.get(i).makeStep(board, sign);
                countSteps();
                board.printBoard();
                checkWin(board);
                if (isWin()) {
                    break;
                }
            }
        }
    }

    public void startGame(int size, Player player1, Player player2) {
        int[][] deck = new int[size][size];
        List<Player> players;
        Board board = new Board(deck, size);
        board.getBoard();
        players = addPlayer(player1, player2);
        loadGame(board, players);
    }

    private boolean checkWin(Board board) {
        boolean a = getWinnerVertical(board);
        boolean b = getWinnerHorizontal(board);
        boolean c = getWinnerDiagonalRightToLeft(board);
        boolean d = getWinnerDiagonalLeftToRight(board);
        boolean e = noWinner(board);
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
        for (j = 0; j < actualBoard.length; j++) {
            for (i = 0; i < actualBoard.length - 2; i++) {
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
        for (j = 0; j < actualBoard.length - 2; j++) {
            for (i = 0; i < actualBoard.length; i++) {
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
}
