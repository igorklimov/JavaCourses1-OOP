//        Разработать интерфейс для обьекта спичечный коробок.
//
//        При дизайне интерфейса встаньте на сторону клиента,
//        того кто будет использовать обьект спичечный коробок.
//        Что нужно данному клиенту?
//        Что он может сделать со спичечным коробком?
//
//        - открыть/закрыть
//        - достать спичку/положить спичку
//        - посчитать количество спичек
//        - зажеч спичку
//
//        Реализуйте интерфейс спичечного коробка в виде кода
//        и создайте его реализацию: класс простой спичечный коробок.
//
//        Учтите, что посчитать количество спичек или взять/положить спичку
//        можно только при открытом коробке! Значит в реализации нужно учитывать в каком состоянии находится обьект спичечный коробок.
//        Если коробок спичек находится в неправильном состоянии то методы должны выкидывать ошибку (специфичный exception).
//
//        Спичку представте тоже в виде обьекта с состоянием горит не горит.
//
//        Учтите, что об один коробок можно зажечь только ограниченное количество спичек - потом наждачная бумага сотрётся. Состояние
//        наждачной бумаги коробка является его свойством - 100%. При зажигании спички оно уменьшается на 1 процент.
//        Зажечь спичку об коробок у которого состояние наждачной бумаги = 0 нельзя.
//
//        PS: у коробка должен быть метод зажечь спичку, который принимает в виде параметра обьект спичку. Внутри реализует
//        проверку состояния наждачной бумаги и зажигает или нет спичку.


package Objects.Task1MatchBox;

public class MatchBox {
    public int numberOfMatches;
    public boolean openClosed = false;

    // sets
    public void setNumberOfMatches(int numberOfMatches) {
        this.numberOfMatches = numberOfMatches;
    }

    public void setOpenClosed(boolean openClosed) {
        this.openClosed = openClosed;
    }

    // gets

    public int getNumberOfMatches() {
        return numberOfMatches;
    }

    public boolean getOpenClosed() {
        return openClosed;
    }

    // methods

    public boolean isOpenClosed(boolean openClosed) {
        if (openClosed) {
            setOpenClosed(true);
            System.out.println(openClosed);
            return openClosed;
        }
        else {
            setOpenClosed(false);
            return openClosed;
        }
    }

    public int takeMatch(int numberOfMatches) {
        if ((getNumberOfMatches() > 0) && openClosed) {
            leftMatches(numberOfMatches);
            System.out.println(numberOfMatches);
            return numberOfMatches;
        }
        else {
            System.out.println("error");
//            Exception error = new Exception();
//            error =
//            return
            return 0;
        }
    }

    public int leftMatches(int numberOfMatches) {
        setNumberOfMatches(numberOfMatches-1);
        return numberOfMatches;
    }

}
