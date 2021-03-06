package tictactoe;

import java.util.Random;

public class ComputerPlayer extends Player {
    private Random rand = new Random();

    private int getRandomNumber(Board board) {
        return rand.nextInt(board.getSize());
    }

    @Override
    public void makeStep(Board board, int sign) {
        boolean loop = false;
        int[][] testBoard = board.getBoard();
        while (!loop) {
            int rand1 = getRandomNumber(board);
            int rand2 = getRandomNumber(board);
            if (testBoard[rand1][rand2] == 0) {
                testBoard[rand1][rand2] = sign;
                loop = true;
            } else {
                loop = false;
            }
        }
        board.setBoard(testBoard);
    }
}
