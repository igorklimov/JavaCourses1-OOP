package Introduction.BulbTask;

public class Switcher {

    private static boolean switcherState = false;

    public void setSwitcherState(boolean switcherState) {
        this.switcherState = switcherState;
    }

    public boolean getSwitcherState() {
        return switcherState;
    }

    public static boolean insertBulb(LightBulb bulb) {
        if (!bulb.inOut) {
            bulb.setInOut(true);
            System.out.println("Bulb inserted");
            return bulb.inOut;
        } else {
            bulb.setInOut(false);
            System.out.println("Bulb is not inserted");
            return bulb.inOut;
        }
    }

    public static boolean moveSwitch(Switcher switcher) {
        if (!switcherState) {
            switcher.setSwitcherState(true);
            System.out.println("Switch is on");
            return switcherState;
        } else {
            switcher.setSwitcherState(false);
            System.out.println("Switch is off");
            return switcherState;
        }
    }

    public static boolean onOff(LightBulb bulb) {
        if ((bulb.inOut) && (switcherState)) {
            bulb.setState(true);
            System.out.println("Bulb is on");
            LightBulb.numberOfOn = (LightBulb.numberOfOn + 1);
            bulb.setNumberOfOn(LightBulb.numberOfOn);
            System.out.println("Bulb number Of On = " + LightBulb.numberOfOn);
            return LightBulb.state;
        } else {
            bulb.setState(false);
            System.out.println("Bulb is off");
            return LightBulb.state;
        }
    }

}