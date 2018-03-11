package tictactoe;

import java.util.Scanner;

public class HumanPlayer extends Player {
    private Scanner scan = new Scanner(System.in);
    private int humanInputHorizontal;
    private int humanInputVertical;


    @Override
    public void setTurn(String turn) {
        super.setTurn(turn);
    }

    @Override
    public String getTurn() {
        return super.getTurn();
    }

    public void setHumanInputHorizontal(int humanInputHorizontal) {
        this.humanInputHorizontal = humanInputHorizontal;
    }

    public void setHumanInputVertical(int humanInputVertical) {
        this.humanInputVertical = humanInputVertical;
    }

    public int getHumanInputHorizontal(Board board) {
        System.out.println("Please type a number from 1 to " + board.getSize() + " (it will represent horisontal axis)");
        humanInputHorizontal = Integer.parseInt(scan.nextLine()) - 1;
        return humanInputHorizontal;
    }

    public int getHumanInputVertical(Board board) {
        System.out.println("Please type a number from 1 to " + board.getSize() + " (it will represent vertical axis)");
        humanInputVertical = Integer.parseInt(scan.nextLine()) - 1;
        return humanInputVertical;
    }

    @Override
    public int[][] makeStep(Board board) {
        getHumanInputHorizontal(board);
        getHumanInputVertical(board);

        board.getBoard();


        /* testBoard[humanInputHorizontal][humanInputVertical] = 9;*/
//        board.setBoard(testBoard);
        //            if (field[humanInputHorizontal][humanInputVertical] == 0) {
//            }
//            else {
//                System.out.println("This field is already taken");
//        while (field[humanInputHorizontal][humanInputVertical]  == 0)
//            board[humanInputHorizontal][humanInputVertical] = 9;
//        return board;
        return board.getBoard();
    }

    @Override
    public boolean switchPlayer() {
        return false;
    }

    //    @Override
//    public int[] makeStep(int deck[][], int i) {
//        System.out.println("Please type a number from 1 to " + i + " (it will represent the cell where you need to put X)");
//        humanInput = Integer.parseInt(scan.nextLine()) - 1;
//        while (deck[humanInput] != 9) {
//            if (deck[humanInput] == 0) {
//                deck[humanInput] = 9;
//                setTurn("Human");
//            } else {
//                System.out.println("This field is already taken");
//                System.out.println("Please type a number from 1 to " + i + " (it will represent the cell where you need to put X)");
//                humanInput = Integer.parseInt(scan.nextLine()) - 1;
//            }
//        }
//        return deck;
//    }

}
