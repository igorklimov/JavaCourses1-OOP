package EncapsulationETC.TicTacToe;

import java.util.Random;

public class ComputerPlayer extends Player {
    Random rand = new Random();

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
        int newRandom = 0;

        newRandom = rand.nextInt(i - 1) + 1;
        if (deck[newRandom] == 0) {
            while (deck[newRandom] != 2) {
                newRandom = rand.nextInt(i - 1) + 1;
                if (deck[newRandom] == 0) {
                    deck[newRandom] = 2;
                    setTurn("Computer");
                }
                System.out.println(newRandom + 1);
            }
        } else {
            newRandom = rand.nextInt(i - 1) + 1;
        }
        System.out.println(deck[newRandom]);
        return deck;
    }
}
