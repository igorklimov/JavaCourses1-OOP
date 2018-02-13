package Introduction.BulbTask;

public class Switcher {

    boolean switcherState = false;
    boolean bulbInserted = false;
    boolean electricitySupply = false;

    public void setSwitcherState(boolean switcherState) {
        this.switcherState = switcherState;
    }

    public void setBulbInserted(boolean bulbInserted) {
        this.bulbInserted = bulbInserted;
    }

    public void setElectricitySupply(boolean electricitySupply) {
        this.electricitySupply = electricitySupply;
    }

    public boolean getSwitcherState() {
        return switcherState;
    }

    public boolean getBulbInserted() {
        return bulbInserted;
    }

    public boolean getElectricitySupply() {
        return electricitySupply;
    }

    public static boolean onOff(boolean switcherState, boolean bulbInserted, boolean electricitySupply) {
        if ((bulbInserted == true) && (switcherState == true)) {
            electricitySupply = true;
            return electricitySupply;
        } else {
            electricitySupply = false;
            return electricitySupply;
        }
    }

    public static boolean lightOnOff(boolean electricity, boolean switcherState, boolean state) {
        if ((electricity == true) && (switcherState == true)) {
            state = true;
            return state;
        }
        else {
            return false;
        }
    }
}
