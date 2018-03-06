//        В программе должны появиться: обьект Игрок, обьект Поле, обьект Игра.
//        Должна быть реализована мини иерархия классов Игрок -> РеальныйИгрок, Игрок -> КомпьютерныйИгрок.
//        В программе должна появиться возможность выбирать режимы игры:
//        РеальныйИгрок -> РеальныйИгрок
//        РеальныйИгрок -> КомпьютерныйИгрок
//        КомпьютерныйИгрок -> КомпьютерныйИгрок

package EncapsulationETC.TicTacToe;

public class TicTacToeMain {
    public static void main(String[] args) {
        int i = 9;
        boolean result = false;
        String turn;

        Field field = new Field();
        int[] deck = field.deck(i);

        Player comp = new ComputerPlayer();
        Player human = new HumanPlayer();

        int n = 0;
        while (deck[n] == 0) {
            for (n = 0; n < i; n++) {
                System.out.println("Round: " + (n + 1));
                System.out.println(" ");
                System.out.println("This is the turn of " + comp.getTurn());
                turn = comp.getTurn();
                deck = comp.makeStep(deck, i);
                result = field.checkWin(deck, result, turn);
                field.printField(deck);
                System.out.println(" ");
                System.out.println("This is the turn of " + human.getTurn());
                turn = human.getTurn();
                deck = human.makeStep(deck, i);
                field.printField(deck);
                result = field.checkWin(deck, result, turn);
                System.out.println(" ");
                if (result) {
                    break;
                }
            }
        }
    }
}