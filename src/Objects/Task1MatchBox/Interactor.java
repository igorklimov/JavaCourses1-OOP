package Objects.Task1MatchBox;

public class Interactor {
    public static void main (String [] args) {
        MatchBox matchBox = new MatchBox();


        matchBox.isOpenClosed(true);
        matchBox.takeMatch(20);
        matchBox.igniteMatch();
    }
}
