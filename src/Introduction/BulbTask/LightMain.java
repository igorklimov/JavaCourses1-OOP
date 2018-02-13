package Introduction.BulbTask;

public class LightMain {


    // insert bulb into switcher
    public static void main(String[] args) {
        LightBulb bulb = new LightBulb();
        Switcher switcher = new Switcher();

        bulb.setInOut(true);
        switcher.setSwitcherState(false);

        Switcher.insertBulb(bulb);
        Switcher.moveSwitch(switcher);
        Switcher.onOff(bulb);
    }
}
