package gravitrips;

import java.util.Random;

public class Computer extends Player {
    private Random rand = new Random();


    private int getRandomColumn(Board board) {
        return rand.nextInt(board.getWidth())+1;
    }

    @Override
    public void makeStep(Board board, int sign) {
        boolean loop = false;
        int[][] testBoard = board.getBoard();
        int random = getRandomColumn(board);
        while (!loop) {
            for (int i = board.getHeight()+MIN; i >= 0; i--) {
                if (testBoard[i][random+MIN] == 0) {
                    testBoard[i][random+MIN] = sign;
                    loop = true;
                    break;
                }
                else if (testBoard[0][random+MIN] != 0) {
                    random = getRandomColumn(board);
                }
            }
        }
        board.setBoard(testBoard);
    }
}