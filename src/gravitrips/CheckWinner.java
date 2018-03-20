package gravitrips;

public class CheckWinner {
    private boolean win;

    public void setWin(boolean win) {
        this.win = win;
    }

    public boolean isWin() {
        return win;
    }

    public void checkWin(Board board, Engine engine) {
        if (checkHorizontal(board) || checkVertical(board) || checkDiagonalRightToLeft(board) || checkDiagonalLeftToRight(board)) {
            setWin(true);
            if (engine.getSteps() % 2 == 0) {
                System.out.println("Player 1 won");
            } else {
                System.out.println("Player 2 won");
            }
        } else if (draw(board, engine)) {
            setWin(true);
            System.out.println("No one won");
        }
    }

    private boolean checkValues(int value1, int value2, int value3, int value4) {
        return ((value1 != 0) && (value1 == value2) && (value2 == value3) && (value3 == value4));
    }

    private int difference(Board board) {
        if (board.getHeight() >= board.getWidth()) {
            System.out.println(board.getHeight() - board.getWidth());
            return board.getHeight() - board.getWidth();
        } else {
            return board.getWidth() - board.getHeight();
        }
    }

    private boolean checkVertical(Board board) {
        for (int j = 0; j < board.getHeight(); j++) {
            for (int i = 0; i < (board.getWidth() - 4); i++) {
                if (win = checkValues(board.getBoard()[i][j], board.getBoard()[i + 1][j], board.getBoard()[i + 2][j], board.getBoard()[i + 3][j])) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean checkHorizontal(Board board) {
        for (int j = 0; j < board.getHeight() - 3; j++) {
            for (int i = 0; i < board.getWidth(); i++) {
                if (win = checkValues(board.getBoard()[i][j], board.getBoard()[i][j + 1], board.getBoard()[i][j + 2], board.getBoard()[i][j + 3])) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean checkDiagonalLeftToRight(Board board) {
        for (int i = 0; i < (board.getWidth() - 3); i++) {
            for (int j = 0; j < (board.getHeight() - 3); j++) {
                if (win = checkValues(board.getBoard()[i][j], board.getBoard()[i + 1][j + 1], board.getBoard()[i + 2][j + 2], board.getBoard()[i + 3][j + 3])) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean checkDiagonalRightToLeft(Board board) {
        for (int i = 3; i < board.getWidth(); i++) {
            for (int j = 0; j < board.getHeight() - 3; j++) {
                if (win = checkValues(board.getBoard()[i][j], board.getBoard()[i - 1][j + 1], board.getBoard()[i - 2][j + 2], board.getBoard()[i - 3][j + 3])) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean draw(Board board, Engine engine) {
        return engine.getSteps() > board.getHeight() * board.getWidth();
    }
}
