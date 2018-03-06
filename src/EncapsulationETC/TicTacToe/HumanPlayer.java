package EncapsulationETC.TicTacToe;

import java.util.Scanner;

public class HumanPlayer extends Player {
    Scanner scan = new Scanner(System.in);
    int humanInput = 0;

    @Override
    public void setTurn(String turn) {
        super.setTurn(turn);
    }

    @Override
    public String getTurn() {
        return super.getTurn();
    }

    @Override
    public int[] makeStep(int deck[], int i) {
        System.out.println("Please type a number from 1 to " + i + " (it will represent the cell where you need to put X)");
        humanInput = Integer.parseInt(scan.nextLine()) - 1;
        while (deck[humanInput] != 9) {
            if (deck[humanInput] == 0) {
                deck[humanInput] = 9;
                setTurn("Human");
            } else {
                System.out.println("This field is already taken");
                System.out.println("Please type a number from 1 to " + i + " (it will represent the cell where you need to put X)");
                humanInput = Integer.parseInt(scan.nextLine()) - 1;
            }
        }
        return deck;
    }

}
