package gravitrips;

import java.util.Random;

public class Computer extends Player {
    private Random rand = new Random();


    private int getRandomColumn(Board board) {
        int x = rand.nextInt(board.getWidth())+1;
        System.out.println("Random number is " + x);
        return  x;
    }

    @Override
    public void makeStep(Board board, int sign) {
        boolean loop = false;
        int[][] testBoard = board.getBoard();
        int random = getRandomColumn(board);
        while (!loop) {
            for (int i = board.getHeight()-1; i >= 0; i--) {
                if (testBoard[i][random-1] == 0) {
                    testBoard[i][random-1] = sign;
                    loop = true;
                    break;
                }
                else if (testBoard[0][random-1] != 0) {
                    random = getRandomColumn(board);
                }
            }
        }
        board.setBoard(testBoard);
    }
}
