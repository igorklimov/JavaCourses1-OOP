//        Создайте классы для описания лампочки и переключателя(LightBulb/Switcher).
//        У лампочки должны быть такие свойства как: включена/выключена, фирма произовидеть,
//        количество возможных включений(по умолчанию лампочку можно включить не более 5 раз).
//        Лампочка должна уметь включаться и выключаться.
//
//        Должна быть возможность подключить лампочку к переключателю, включать/выключать лампочку при помощи переключателя.
//
//        Создайте класс LightMain, в нем создайте main метод. Продемонстрируйте в данном методе работу переключателя и лампочки с ее перегоранием.

package Introduction.BulbTask;

public class LightBulb {
    public static String bulbStatus = "off";
    private static int maxSwitches = 5;
    public int numberOfSwitches = 0;
    public static int on = 0;

    public LightBulb() {
        this.bulbStatus = bulbStatus;
        this.numberOfSwitches = numberOfSwitches;
    }

    public String getBulbStatus() {
        return bulbStatus;
    }

    public int getNumberOfSwitches() {
        return numberOfSwitches;
    }

    // check if user wants to insert the bulb
    public static void insertBulb(String insert) {
        if (!insert.equals("yes")) {
            System.out.println("Live without light, dude");
        } else {
        }
    }

    // check the number of "on" statuses
    public static int numberOfOn(String bulbStatus) {
        if (bulbStatus.equals("on")) {
            on = on + 1;
            System.out.println(on);
        }
        return on;
    }

    // check if number of "on" is not higher than maxSwitches;
    public static void checkForCriticalMax(int on) {
        while (on != maxSwitches) {
            Switcher switcher = new Switcher();
            bulbStatus = switcher.getProcessedBulbStatus();
            System.out.println(bulbStatus);
            numberOfOn(bulbStatus);
        }
        System.out.println("Over");
    }

}
