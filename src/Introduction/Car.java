//        Создайте класс Car, который должен описывать машину.
//        У машины должны быть описаны следующие свойства:
//        цвет, марка, год
//
//        Для каждого из этих свойств должен быть создан метод
//        для его получения и задания нового значения (get and set methods).
//
//        Добавьте конструктор класса, который устанавливал бы значения свойств класса в начальные значения.
//
//        Для демонстрации работы с классом Car создайте программу
//        в которой создайте:
//        1 экземпляр при помощи конструктора по умолчанию и добавьте свойства при помощи созданных методов.
//        1 экземпляр при помощи нового конструктора который устанавливает значения свойств класса в начальные значения.
//
//        Переопределите метод toString() в классе Car таким образом,
//        что бы в выдаваемой строке содержалась информация о всех свойствах класса.
//
//        Выведите информацию о созданных машинах на экран.


package Introduction;

public class Car {

    private String color = "white";
    private String brand = "bmw";
    private int year = 2000;

//    private Car(String color, String brand, int year) {
//        this.setBrand(brand);
//        this.setColor(color);
//        this.setYear(year);
//    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getYear() {
        String Year = String.valueOf(year);
        return Year;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return getBrand() + " " + getColor() + " " + getYear();
    }

    public static void main(String[] args) {
        Car newCar = new Car();
        newCar.setColor("red");
        newCar.setBrand("audi");
        newCar.setYear(2017);

        String goodCarColor = newCar.getColor();
        String goodCarBrand = newCar.getBrand();
        String goodCarYear = newCar.getYear();

        System.out.println(goodCarBrand + " " + goodCarColor + " " + goodCarYear);

        Car oldCar = new Car();

        System.out.println(oldCar.toString());

    }

}
