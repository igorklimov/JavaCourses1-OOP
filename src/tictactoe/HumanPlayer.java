package tictactoe;

import java.util.Scanner;

public class HumanPlayer extends Player {
    private Scanner scan = new Scanner(System.in);
    private int humanInputHorizontal;
    private int humanInputVertical;

    public void setHumanInputVertical(int humanInputVertical) {
        this.humanInputVertical = humanInputVertical;
    }

    public void setHumanInputHorizontal(int humanInputHorizontal) {
        this.humanInputHorizontal = humanInputHorizontal;
    }

    private int getHumanInputHorizontal(Board board) {
        humanInputHorizontal = -1;
        while ((humanInputHorizontal <= board.getSize()) && (humanInputHorizontal <= -1)) {
            System.out.println("Please type a number from 1 to " + board.getSize() + " (it will represent horisontal axis)");
            try {
                humanInputHorizontal = Integer.parseInt(scan.nextLine()) - 1;
            } catch (NumberFormatException e) {
                System.out.println("input is not an int value");
            }
        }

        return humanInputHorizontal;
    }

    private int getHumanInputVertical(Board board) {
        humanInputVertical = -1;
        while (humanInputVertical <= board.getSize() && humanInputVertical <= -1) {
            System.out.println("Please type a number from 1 to " + board.getSize() + " (it will represent vertical axis)");
            try {
                humanInputVertical = Integer.parseInt(scan.nextLine()) - 1;
            } catch (NumberFormatException e) {
                System.out.println("input is not an int value");
            }
        }
        return humanInputVertical;
    }

    @Override
    public void makeStep(Board board) {

        boolean loop = false;
        int[][] testBoard = board.getBoard();
        while (!loop) {
            getHumanInputHorizontal(board);
            getHumanInputVertical(board);
            if (testBoard[humanInputHorizontal][humanInputVertical] == 0) {
                testBoard[humanInputHorizontal][humanInputVertical] = 1;
                loop = true;
            } else {
                System.out.println("This field is taken");
                loop = false;
            }
        }

        board.setBoard(testBoard);
    }
}
