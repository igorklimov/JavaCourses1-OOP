package Introduction.BulbTask;

public class LightMain {



    // insert bulb into switcher
    public static void main(String [] args) {
        LightBulb bulb = new LightBulb();
        Switcher switcher = new Switcher();

        bulb.setState(true);
        switcher.setSwitcherState(false);
        switcher.setBulbInserted(false);


        boolean bulbInserted = switcher.getBulbInserted();
        boolean switcherState = switcher.getSwitcherState();
        boolean state = bulb.getState();
        boolean electricity = switcher.getElectricitySupply();


        System.out.println(String.valueOf(bulbInserted));
        Switcher.onOff(switcherState, bulbInserted, electricity);
        System.out.println(String.valueOf(electricity));
        Switcher.lightOnOff(electricity,switcherState,state);
        System.out.println(String.valueOf(state));

    }
}
