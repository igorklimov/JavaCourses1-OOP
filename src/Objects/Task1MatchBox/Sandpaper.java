package Objects.Task1MatchBox;

public class Sandpaper {
    public int sandpaperWear = 100;

    public void setSandpaperWear(int sandpaperWear) {
        this.sandpaperWear = sandpaperWear;
    }

    public int getSandpaperWear() {
        return sandpaperWear;
    }

    public int sandpaperWearCounter(int sandpaperWear, Match match) {
        if (!match.getLightStatus()) {
            return sandpaperWear;
        } else {
            setSandpaperWear(sandpaperWear - 1);
            return sandpaperWear;
        }
    }
}
