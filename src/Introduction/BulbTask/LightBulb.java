package Introduction.BulbTask;

//        Создайте классы для описания лампочки и переключателя(LightBulb/Switcher).
//        У лампочки должны быть такие свойства как: включена/выключена, фирма произовидеть,
//        количество возможных включений(по умолчанию лампочку можно включить не более 5 раз).
//        Лампочка должна уметь включаться и выключаться.
//
//        Должна быть возможность подключить лампочку к переключателю, включать/выключать лампочку при помощи переключателя.
//
//        Создайте класс LightMain, в нем создайте main метод. Продемонстрируйте в данном методе работу
//        переключателя и лампочки с ее перегоранием.


//        Должна быть лампочка.
//        Должен быть выключатель.
//        Лампочка имеет состояние (включена или выключена)
//        Лампочку можно включать или выключать при помощи выключателя.
//        Один выключатель можно использовать с разными лампочками, но продаются они отдельно
//        (не надо создавать лампочку внутри класса свитчер).
//        мысли с точки зрения объектов, а не того, что будет в консоли написано
//        у тебя есть объект свитчер
//        есть объект лампочка
//        если они не взаимодействуют, то не важно, что ты написал "лампочка включена"
//
//        надо чтобы у объекта лампочка состояние поменялось.

public class LightBulb {

    // initial characteristics
    public static Boolean state = false; // on or off
    public static Boolean inOut = false;
    String manufacturer;
    public static int maxOnNumber = 5;
    public static int numberOfOn = 0;

    public void setState(boolean state) {
        this.state = state;
    }

    public void setInOut(boolean inOut) {
        this.inOut = inOut;
    }

    public void setNumberOfOn(int numberOfOn) {
        this.numberOfOn = numberOfOn;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setMaxOnNumber(int maxOnNumber) {
        this.maxOnNumber = maxOnNumber;
    }

    public int getNumberOfOn() {
        return numberOfOn;
    }

    public Boolean getState() {
        return state;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getMaxOnNumber() {
        return maxOnNumber;
    }

    public boolean getInOut() {
        return inOut;
    }

}