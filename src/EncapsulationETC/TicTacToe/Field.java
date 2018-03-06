package EncapsulationETC.TicTacToe;


public class Field {
    private int f = 0;
    Player computer = new ComputerPlayer();
    Player human = new HumanPlayer();

    public int[] deck(int i) {
        int[] deck = new int[i];
        while (f < deck.length) {
            deck[f] = 0;
            f++;
        }
        return deck;
    }

    public void printField(int[] deck) {
        for (f = 1; f < deck.length + 1; f++) {
            System.out.print(deck[f - 1] + " ");
            if (f % 3 == 0) {
                System.out.println("");
            }

        }
    }

    public boolean checkWin(int[] deck, boolean result, String turn) {
        while (!result) {
            if (deck[0] == deck[3] && deck[0] == deck[6] && deck[0] != 0) {
                System.out.println(turn + " won");
                result = true;
            } else if (deck[1] == deck[4] && deck[1] == deck[7] && deck[1] != 0) {
                System.out.println(turn + " won");
                result = true;
            } else if (deck[2] == deck[5] && deck[2] == deck[8] && deck[2] != 0) {
                System.out.println(turn + " won");
                result = true;
            } else if (deck[0] == deck[1] && deck[0] == deck[2] && deck[0] != 0) {
                System.out.println(turn + " won");
                result = true;
            } else if (deck[3] == deck[4] && deck[3] == deck[5] && deck[3] != 0) {
                System.out.println(turn + " won");
                result = true;
            } else if (deck[6] == deck[7] && deck[6] == deck[8] && deck[6] != 0) {
                System.out.println(turn + " won");
                result = true;
            } else if (deck[0] == deck[4] && deck[0] == deck[8] && deck[0] != 0) {
                System.out.println(turn + " won");
                result = true;
            } else if (deck[2] == deck[4] && deck[2] == deck[6] && deck[2] != 0) {
                System.out.println(turn + " won");
                result = true;
            } else break;
        }
        return result;
    }

}