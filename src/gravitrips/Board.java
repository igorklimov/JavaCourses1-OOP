package gravitrips;

public class Board {
    private int[][] board;
    private int height;
    private int width;

    public Board(int height, int width) {
        if (height >= 2 && width >= 2) {
            setHeight(height);
            setWidth(width);
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setBoard(int[][] board) {
        this.board = board;
    }

    public int[][] getBoard() {
        return board;
    }

    public void initializeBoard() {
        int[][] gameBoard = new int[height][width];
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
