//        Создаите иерархию классов геометрических фигур.
//        Например: круг, квадрат, треугольник, прямоугольник.
//
//        Создаите в каждом классе конструктор для задания начального состояния обьекта.
//        Например для круга надо задать радиус, для квадрата длину стороны,
//        а для треугольника длину всех трёх сторон. Сохраните эти значения
//        в свойства обьектов, они пригодятся в дальнейшем для расчёта площади фигур.
//
//        У всех наших геометрических фигур есть что то общее - это понятие площади.
//        Для каждой из фигур она должна расчитываться по разному, поэтому создайте
//        абстрактный класс (class abstract) фигура и в нём определите абстрактный
//        медтод calculateSquare() (public abstract double calculateSquare()).
//        Наследуйте каждый реальный класс в вашей программе (круг, квадрат, ...)
//        от абстрактного класса фигура и запрограммируйте в каждом классе свою
//        реализацию метода calculateSquare().
//
//        Разместите все ваши классы фигур в пакете shapes.
//
//        Создайте класс SquareCalculator с методом main. В этом методе
//        создайте список из фигур (List<Фигура>) и положите в него реальные
//        обьектры круг, квадрат, и т.д.. Для создания фигур используйте класс
//        Random для случайной генерации радиуса, длины стороны квадрата и т.д..
//        Используя список List<Фигура> посчитайте общую площадь фигур в списке
//        используя ссылку только на супер класс, и не используя операцию приведение типа.
//        Это и будет полиморфизм, когда обращаешься к обьекту через ссылку на
//        родительский класс.

package EncapsulationETC.Polymorphism;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SquareCalculator {


    public static void main(String[] args) {
        Random random = new Random();
        List<AbstractShape> list = new ArrayList<>();
        Circle circle = new Circle();
        Triangle triangle = new Triangle((random.nextInt(10) + 1), (random.nextInt(10) + 1), (random.nextInt(10) + 1));
        Rectangle rectangle = new Rectangle((random.nextInt(10) + 1), (random.nextInt(10) + 1));
        circle.setRadius((random.nextInt(10) + 1));
        circle.calculateSquare();
        triangle.calculateSquare();
        rectangle.calculateSquare();
        list.add(circle);
        list.add(triangle);
        list.add(rectangle);


        System.out.println(String.valueOf(circle.calculateSquare()));
        System.out.println(String.valueOf(triangle.calculateSquare()));
        System.out.println(String.valueOf(rectangle.calculateSquare()));

        for (int i=0; i <3; i++) {

        }
    }

}

