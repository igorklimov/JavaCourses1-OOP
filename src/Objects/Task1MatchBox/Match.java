package Objects.Task1MatchBox;

public class Match {
    public boolean lightStatus = false;

    public void setLightStatus(boolean lightStatus) {
        this.lightStatus = lightStatus;
    }

    public boolean getLightStatus() {
        return lightStatus;
    }

    public boolean igniteMatch(Sandpaper sandpaper) {
        if (sandpaper.sandpaperWear > 0) {
            setLightStatus(true);
            sandpaper.sandpaperWearCounter(sandpaper.sandpaperWear, lightStatus);
            return lightStatus;
        }
        else
        {
            System.out.println("Error");
            return false;
        }
    }
}
