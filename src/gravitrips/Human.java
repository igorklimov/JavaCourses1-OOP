package gravitrips;

import java.util.Scanner;

public class Human extends Player {
    private Scanner scan = new Scanner(System.in);
    private int column;

    private void selectedColumn(Board board) {

        column = MIN;
        while ((column <= board.getWidth()) && (column <= MIN)) {
            System.out.println("Please type a number from 1 to " + board.getWidth()
                    + " (it will represent column in which you will throw a figure)");
            try {
                column = Integer.parseInt(scan.nextLine())+MIN;
            } catch (NumberFormatException e) {
                System.out.println("input is not an int value");
            }
        }
    }

    @Override
    public void makeStep(Board board, int sign) {
        boolean loop = false;
        int[][] testBoard = board.getBoard();
        selectedColumn(board);
        while (!loop) {
            for (int i = board.getHeight()+MIN; i >= 0; --i) {
                if (testBoard[i][column] == 0) {
                    testBoard[i][column] = sign;
                    loop = true;
                    break;
                }
                else if (testBoard[0][column] != 0) {
                    selectedColumn(board);
                }
            }
        }
        board.setBoard(testBoard);
    }
}