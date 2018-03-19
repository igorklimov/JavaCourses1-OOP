package tictactoe;

import java.util.ArrayList;
import java.util.List;

public class Engine {
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

    private List<Player> setPlayer(Player player1, Player player2) {
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

    public void startGame(int size, Player player1, Player player2) {
        List<Player> players;
        Board board = new Board(size);
        board.initializeBoard();
        board.getBoard();
        players = setPlayer(player1, player2);
        loadGame(board, players);
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
                if (win) {
                    break;
                }
            }
        }
    }

    private void checkWin(Board board) {
        if (checkHorizontal(board) || checkVertical(board) || checkDiagonalRightToLeft(board) || checkDiagonalLeftToRight(board)) {
            setWin(true);
            if (getSteps() % 2 == 0) {
                System.out.println("Player 1 won");
            } else {
                System.out.println("Player 2 won");
            }
        } else if (draw(board)) {
            setWin(true);
            System.out.println("No one won");
        }
    }

    private boolean checkValues(int value1, int value2, int value3) {
        return ((value1 != 0) && (value1 == value2) && (value2 == value3));
    }

    private boolean checkVertical(Board board) {
        for (int j = 0; j < board.getBoard().length; j++) {
            for (int i = 0; i < (board.getBoard()[j].length - 2); i++) {
                if (win = checkValues(board.getBoard()[i][j], board.getBoard()[i + 1][j], board.getBoard()[i + 2][j])) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean checkHorizontal(Board board) {
        for (int j = 0; j < board.getBoard().length - 2; j++) {
            for (int i = 0; i < board.getBoard().length; i++) {
                if (win = checkValues(board.getBoard()[i][j], board.getBoard()[i][j + 1], board.getBoard()[i][j + 2])) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean checkDiagonalLeftToRight(Board board) {
        for (int i = 0; i < (board.getBoard().length - 2); i++) {
            for (int j = 0; j < (board.getBoard().length - 2); j++) {
                if (win = checkValues(board.getBoard()[i][j], board.getBoard()[i + 1][j + 1], board.getBoard()[i + 2][j + 2])) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean checkDiagonalRightToLeft(Board board) {
        for (int i = 2; i < board.getBoard().length; i++) {
            for (int j = 0; j < board.getBoard().length - 2; j++) {
                if (win = checkValues(board.getBoard()[i][j], board.getBoard()[i - 1][j + 1], board.getBoard()[i - 2][j + 2])) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean draw(Board board) {
        if (getSteps() > board.getSize() * board.getSize()) {
            return true;
        }
        return false;
    }
}