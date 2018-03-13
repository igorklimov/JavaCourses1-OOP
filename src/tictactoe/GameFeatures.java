package tictactoe;

import java.util.ArrayList;
import java.util.List;

public class GameFeatures {
    private boolean win;

    public void setWin(boolean win) {
        this.win = win;
    }

    public boolean isWin() {
        return win;
    }

    public List<Player> addPlayer(Player player1, Player player2) {
        List<Player> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
        return players;
    }

    public boolean checkWin(Board board) {
        boolean a = false;
        boolean b = false;
        boolean c = false;
        boolean d = false;
        while (!a && !b && !c && !d) {
            a = getWinnerVertical(board);
            b = getWinnerHorizontal(board);
            c = getWinnerDiagonalRightToLeft(board);
            d = getWinnerDiagonalLeftToRight(board);
        }
        return true;
    }

    private boolean getWinnerVertical(Board board) {
        int i;
        int j;
        int[][] actualBoard = board.getBoard();
        for (i = 0; i < (board.getSize() - 2); i++) {
            for (j = 0; j < (board.getSize()); j++) {
                if ((actualBoard[i][j] == actualBoard[i + 1][j]) && (actualBoard[i][j] == actualBoard[i + 2][j]) && (actualBoard[i][j] != 0)) {
                    setWin(true);
                    System.out.println("Winner");
                    break;
                } else {
                    setWin(false);
                }
            }
        }
        System.out.println(isWin());
        return isWin();
    }

    private boolean getWinnerHorizontal(Board board) {
        int i;
        int j;
        int[][] actualBoard = board.getBoard();
        for (i = 0; i < (board.getSize()); i++) {
            for (j = 0; j < (board.getSize() - 2); j++) {
                if ((actualBoard[i][j] == actualBoard[i][j + 1]) && (actualBoard[i][j] == actualBoard[i][j + 2]) && (actualBoard[i][j] != 0)) {
                    setWin(true);
                    System.out.println("Winner");
                    break;
                } else {
                    setWin(false);
                }
            }
        }
        System.out.println(isWin());
        return isWin();
    }

    private boolean getWinnerDiagonalLeftToRight(Board board) {
        int i;
        int j;
        int[][] actualBoard = board.getBoard();
        for (i = 0; i < (board.getSize() - 2); i++) {
            for (j = 0; j < (board.getSize() - 2); j++) {
                if ((actualBoard[i][j] == actualBoard[i + 1][j + 1]) && (actualBoard[i][j] == actualBoard[i + 2][j + 2]) && (actualBoard[i][j] != 0)) {
                    setWin(true);
                    System.out.println("Winner");
                    break;
                } else {
                    setWin(false);
                }
            }
        }
        System.out.println(isWin());
        return isWin();
    }

    private boolean getWinnerDiagonalRightToLeft(Board board) {
        int i;
        int j;
        int[][] actualBoard = board.getBoard();
        for (i = 2; i < board.getSize(); i++) {
            for (j = 0; j < board.getSize() - 2; j++) {
                if ((actualBoard[i][j] == actualBoard[i - 1][j + 1]) && (actualBoard[i][j] == actualBoard[i - 2][j + 2]) && (actualBoard[i][j] != 0)) {
                    setWin(true);
                    System.out.println("Winner");
                    break;
                } else {
                    setWin(false);
                }
            }
        }
        System.out.println(isWin());
        return isWin();
    }
}
