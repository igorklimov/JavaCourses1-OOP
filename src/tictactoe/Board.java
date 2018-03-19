package tictactoe;


public class Board {
    private int[][] board;
    private int size;

    public Board(int size) {
        if (size >= 2) {
            setSize(size);
        }
    }

    private void setSize(int size) {
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

    public void initializeBoard() {
        int[][] gameBoard = new int[size][size];
        setBoard(gameBoard);
    }

    public void printBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}