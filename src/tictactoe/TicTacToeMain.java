//        В программе должны появиться: обьект Игрок, обьект Поле, обьект Игра.
//        Должна быть реализована мини иерархия классов Игрок -> РеальныйИгрок, Игрок -> КомпьютерныйИгрок.
//        В программе должна появиться возможность выбирать режимы игры:
//        РеальныйИгрок -> РеальныйИгрок
//        РеальныйИгрок -> КомпьютерныйИгрок
//        КомпьютерныйИгрок -> КомпьютерныйИгрок

package tictactoe;

public class TicTacToeMain {
    public static void main(String[] args) {
        int size = 3;
        int[][] game = new int[size][size];

        Board board = new Board(game, size);
        board.getBoard();

        Player comp = new ComputerPlayer();
        Player human = new HumanPlayer();

        human.makeStep(board);

//        int n = 0;
//        while (deck[n][n] == 0) {
//            for (n = 0; n < i; n++) {
//                System.out.println("Round: " + (n + 1));
//                System.out.println(" ");
//                System.out.println("This is the turn of " + comp.getTurn());
//                turn = comp.getTurn();
//                deck = comp.makeStep(deck, i);
//                result = field.checkWin(deck, result, turn);
//                field.printField(deck);
//                System.out.println(" ");
//                System.out.println("This is the turn of " + human.getTurn());
//                turn = human.getTurn();
//                deck = human.makeStep(deck, i);
//                field.printField(deck);
//                result = field.checkWin(deck, result, turn);
//                System.out.println(" ");
//                if (result) {
//                    break;
//                }
//            }
    }
}