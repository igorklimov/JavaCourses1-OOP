package tictactoe;


public class Board {
    private int[][] board;
    private int size;

    public Board(int[][] board, int size) {
        setBoard(board);
        setSize(size);
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setBoard(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int[][] getBoard() {
        return board;
    }

    //    public boolean checkWin(int[] deck, boolean result, String turn) {
//        while (!result) {
//            if (deck[0] == deck[3] && deck[0] == deck[6] && deck[0] != 0) {
//                System.out.println(turn + " won");
//                result = true;
//            } else if (deck[1] == deck[4] && deck[1] == deck[7] && deck[1] != 0) {
//                System.out.println(turn + " won");
//                result = true;
//            } else if (deck[2] == deck[5] && deck[2] == deck[8] && deck[2] != 0) {
//                System.out.println(turn + " won");
//                result = true;
//            } else if (deck[0] == deck[1] && deck[0] == deck[2] && deck[0] != 0) {
//                System.out.println(turn + " won");
//                result = true;
//            } else if (deck[3] == deck[4] && deck[3] == deck[5] && deck[3] != 0) {
//                System.out.println(turn + " won");
//                result = true;
//            } else if (deck[6] == deck[7] && deck[6] == deck[8] && deck[6] != 0) {
//                System.out.println(turn + " won");
//                result = true;
//            } else if (deck[0] == deck[4] && deck[0] == deck[8] && deck[0] != 0) {
//                System.out.println(turn + " won");
//                result = true;
//            } else if (deck[2] == deck[4] && deck[2] == deck[6] && deck[2] != 0) {
//                System.out.println(turn + " won");
//                result = true;
//            } else break;
//        }
//        return result;
//    }

}