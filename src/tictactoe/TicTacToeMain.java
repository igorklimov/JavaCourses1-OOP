package tictactoe;

public class TicTacToeMain {
    public static void main(String[] args) {
        Engine engine = new Engine();
        Player comp = new ComputerPlayer();
        Player human = new HumanPlayer();
        engine.startGame(5, comp, comp);
    }
}