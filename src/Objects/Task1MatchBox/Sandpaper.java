package Objects.Task1MatchBox;

public class Sandpaper {
    public int sandpaperWear = 100;

    public void setSandpaperWear(int sandpaperWear) {
        this.sandpaperWear = sandpaperWear;
    }

    public int getSandpaperWear() {
        return sandpaperWear;
    }

    public int sandpaperWearCounter(boolean lightStatus) {
        if (!lightStatus) {
            return sandpaperWear;
        } else {
            setSandpaperWear(sandpaperWear - 1);
            System.out.println("Sandpaper wear is " + sandpaperWear);
            return sandpaperWear;
        }
    }
}
