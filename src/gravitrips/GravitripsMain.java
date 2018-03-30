package gravitrips;

public class GravitripsMain {
    public static void main(String[] args) {
        Game game = new Game();
        Player computer = new Computer();
        Player human = new Human();
        game.startGame(4, 4, computer, computer);
    }
}
