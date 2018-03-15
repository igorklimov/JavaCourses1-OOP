package tictactoe;

import java.util.Random;

public class ComputerPlayer extends Player {
    private Random rand = new Random();
    private int randomNumber;

    private int getRandomNumber(Board board) {
        randomNumber = rand.nextInt(board.getSize());
        return randomNumber;
    }

    @Override
    public void makeStep(Board board) {
        boolean loop = false;
        int[][] testBoard = board.getBoard();
        while (!loop) {
            int rand1 = getRandomNumber(board);
            int rand2 = getRandomNumber(board);
            if (testBoard[rand1][rand2] == 0) {
                testBoard[rand1][rand2] = 2;
                loop = true;
            } else {
                loop = false;
            }
        }
        board.setBoard(testBoard);
    }
}
