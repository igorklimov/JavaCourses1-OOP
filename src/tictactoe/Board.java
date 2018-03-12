package tictactoe;


public class Board {
    private int[][] board;
    private int size;
    boolean win;

    public void setWin(boolean win) {
        this.win = win;
    }

    public boolean isWin() {
        return win;
    }

    public Board(int[][] board, int size) {
        setBoard(board);
        setSize(size);
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setBoard(int[][] board) {
        this.board = board;
    }

    public int[][] getBoard() {
        return board;
    }

    public void printBoard() {
        for (int i = 0; i < getBoard().length; i++) {
            for (int j = 0; j < getBoard()[i].length; j++) {
                System.out.print(getBoard()[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public boolean checkWin() {
        int i;
        int j;
        for (i = 0; i < (getSize() - 2); i++) {
            for (j = 0; j < (getSize() - 2); j++) {
                if ((board[i][j] == board[i + 1][j]) && (board[i][j] == board[i + 2][j]) && (board[i][j] != 0)) {
                    setWin(true);
                    System.out.println("Winner");
                    break;
                } else if ((board[i][j] == board[i][j + 1]) && (board[i][j] == board[i][j + 2]) && (board[i][j] != 0)) {
                    setWin(true);
                    System.out.println("Winner");
                    break;

                } else if ((board[i][j] == board[i+1][j + 1]) && (board[i][j] == board[i+2][j + 2]) && (board[i][j] != 0)) {
                    setWin(true);
                    System.out.println("Winner");
                    break;
                } else {
                    setWin(false);
                }
            }
        }
        return isWin();
    }

    public void switchPlayer() {
    };

}