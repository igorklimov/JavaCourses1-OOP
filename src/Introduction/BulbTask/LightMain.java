package Introduction.BulbTask;

import java.util.Scanner;

public class LightMain {


    // insert bulb into switcher
    public static void main(String[] args) {


        LightBulb bulb = new LightBulb();
        Switcher switcher = new Switcher();

        while (bulb.numberOfOn != bulb.getMaxOnNumber()) {
            boolean userChoiceInOrOut = insert();
            bulb.setInOut(userChoiceInOrOut);

            boolean userChoiceOnOrOff = insert();
            switcher.setSwitcherState(userChoiceOnOrOff);

            Switcher.insertBulb(bulb);
            Switcher.moveSwitch(switcher);
            Switcher.onOff(bulb);
            System.out.println(" ");
        }
    }

    public static boolean insert() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yes or No?");
        String input = scanner.nextLine().toLowerCase();
        if (input.equals("yes")) {
            System.out.println("answer is yes");
            return true;
        } else {
            System.out.println("answer is no");
            return false;
        }
    }

}
