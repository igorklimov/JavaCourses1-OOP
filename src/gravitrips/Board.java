package gravitrips;

public class Board {
    private int[][] board;
    private int height;
    private int width;
    private boolean endGame;

    public Board(int height, int width) {
        setHeight(height);
        setWidth(width);
    }

    public int getHeight() {
        return height;
    }

    private void setHeight(int height) {
        if (height >= 4) {
            this.height = height;
        } else {
            this.height = 4;
        }
    }

    public int getWidth() {
        return width;
    }

    private void setWidth(int width) {
        if (width >= 4) {
            this.width = width;
        } else {
            this.width = 4;
        }
    }

    public void setBoard(int[][] board) {
        this.board = board;
    }

    public int[][] getBoard() {
        return board;
    }

    public void setEndGame(boolean endGame) {
        this.endGame = endGame;
    }

    public boolean isEndGame() {
        return endGame;
    }

    public void initializeBoard() {
        board = new int[height][width];
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


    public void checkWin(int steps) {
        if (checkVertical() || checkHorizontal() || checkDiagonalRightToLeft() || checkDiagonalLeftToRight()) {
            setEndGame(true);
            if (steps % 2 == 0) {
                System.out.println("Player 2 won");
            } else {
                System.out.println("Player 1 won");
            }
        } else if (steps >= getHeight() * getWidth()) {
            setEndGame(true);
            System.out.println("Draw");
        }
    }

    private boolean checkValues(int value1, int value2, int value3, int value4) {
        return ((value1 != 0) && (value1 == value2) && (value2 == value3) && (value3 == value4));
    }

    private boolean checkVertical() {
        for (int j = 0; j < width; j++) {
            for (int i = 0; i < (height - 3); i++) {
                if (checkValues(board[i][j], board[i + 1][j], board[i + 2][j], board[i + 3][j])) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean checkHorizontal() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width - 3; j++) {
                if (checkValues(board[i][j], board[i][j + 1], board[i][j + 2], board[i][j + 3])) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean checkDiagonalLeftToRight() {
        for (int i = 0; i < (height - 3); i++) {
            for (int j = 0; j < (width - 3); j++) {
                if (checkValues(board[i][j], board[i + 1][j + 1], board[i + 2][j + 2], board[i + 3][j + 3])) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean checkDiagonalRightToLeft() {
        for (int i = 3; i < height; i++) {
            for (int j = 0; j < width - 3; j++) {
                if (checkValues(board[i][j], board[i - 1][j + 1], board[i - 2][j + 2], board[i - 3][j + 3])) {
                    return true;
                }
            }
        }
        return false;
    }
}