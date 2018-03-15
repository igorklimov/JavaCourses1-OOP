package tictactoe;

public class TicTacToeMain {
    public static void main(String[] args) {
        GameFeatures gameFeatures = new GameFeatures();
        Player comp = new ComputerPlayer();
        Player human = new HumanPlayer();
        gameFeatures.startGame(3, comp, human);
    }
}