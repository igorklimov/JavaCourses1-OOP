package Introduction.BulbTask;

import java.util.Scanner;

public class LightMain {

    public static void main (String []  args) {

        String insert;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to insert a bulb? If Yes, type 'Yes', if No type 'No' ");
        insert = scanner.nextLine().toLowerCase();
        LightBulb.insertBulb(insert);

        Switcher switcher = new Switcher();
        String bulbStatus = switcher.getProcessedBulbStatus();

        int on = LightBulb.numberOfOn(bulbStatus);

        while (on != 5) {
            LightBulb.checkForCriticalMax(on);
            Switcher.onOff(bulbStatus);
        }



//        String insert;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Do you want to insert a bulb? If Yes, type 'Yes', if No type 'No' ");
//        insert = scanner.nextLine().toLowerCase();
//        LightBulb.insertBulb(insert);
//        System.out.println("Do you want to switch the light the light? If Yes, type 'Yes', if No type 'No' ");
//        insert = scanner.nextLine().toLowerCase();
//        LightBulb.OnOffBulb(insert);

    }
}
