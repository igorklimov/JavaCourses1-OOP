package tictactoe;

import java.util.Scanner;

public class HumanPlayer extends Player {
    private Scanner scan = new Scanner(System.in);
    private int inputHorizontal;
    private int inputVertical;

    private void resultOfHorizontalInput(Board board) {
        inputHorizontal = -1;
        while ((inputHorizontal <= board.getSize()) && (inputHorizontal <= -1)) {
            System.out.println("Please type a number from 1 to " + board.getSize() + " (it will represent horisontal axis)");
            try {
                inputHorizontal = Integer.parseInt(scan.nextLine()) - 1;
            } catch (NumberFormatException e) {
                System.out.println("input is not an int value");
            }
        }
    }

    private void resultOfVerticalInput(Board board) {
        inputVertical = -1;
        while ((inputVertical <= board.getSize()) && inputVertical <= -1) {
            System.out.println("Please type a number from 1 to " + board.getSize() + " (it will represent vertical axis)");
            try {
                inputVertical = Integer.parseInt(scan.nextLine()) - 1;
            } catch (NumberFormatException e) {
                System.out.println("input is not an int value");
            }
        }
    }

    @Override
    public void makeStep(Board board, int sign) {
        boolean loop = false;
        int[][] testBoard = board.getBoard();
        while (!loop) {
            resultOfHorizontalInput(board);
            resultOfVerticalInput(board);
            if (testBoard[inputHorizontal][inputVertical] == 0) {
                testBoard[inputHorizontal][inputVertical] = sign;
                loop = true;
            } else {
                System.out.println("This field is taken");
                loop = false;
            }
        }

        board.setBoard(testBoard);
    }
}
