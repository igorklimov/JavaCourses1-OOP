package Introduction.BulbTask;

import java.util.Scanner;

public class Switcher {

    LightBulb bulb = new LightBulb();
    String processedBulbStatus = bulb.getBulbStatus();

    public static String onOff(String processedBulbStatus) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to switch the light the light? If Yes, type 'Yes', if No type 'No' ");
        String insert = scanner.nextLine().toLowerCase();
        if (insert.equals("yes")) {
            System.out.println("The light is on");
            return processedBulbStatus = "on";
        } else {
            System.out.println("The light is off");
            return processedBulbStatus = "off";
        }
    }

    public Switcher() {
        this.processedBulbStatus = processedBulbStatus;
    }

    public String getProcessedBulbStatus() {
        return processedBulbStatus;
    }

}
