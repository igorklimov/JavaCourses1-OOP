package Objects.Task1MatchBox;

public class Interactor {
    public static void main(String[] args) {
        MatchBox matchBox = new MatchBox();
        Sandpaper sandpaper = new Sandpaper();
        Match match = new Match();

        matchBox.numberOfMatches = 104;

        matchBox.isOpenClosed(true);
        while ((matchBox.numberOfMatches > 0) && (sandpaper.sandpaperWear > 0)) {
            matchBox.takeMatch(matchBox.numberOfMatches);
            match.igniteMatch(sandpaper, match);
            System.out.println(" ");
        }
    }
}
