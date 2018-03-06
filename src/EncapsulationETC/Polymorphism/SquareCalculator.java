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
import java.util.Arrays;

public class SquareCalculator {


    public static void main(String[] args) {
        Random random = new Random();
        List<AbstractShape> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(new Circle(random.nextInt(10) + 1));
            list.add(new Triangle(random.nextInt(10) + 1, random.nextInt(10) + 1, random.nextInt(10) + 1));
            list.add(new Rectangle(random.nextInt(10) + 1, random.nextInt(10) + 1));
        }

        int m = 0;
        for (int i = 0; i < list.size(); i++) {
            m = m + list.get(i).calculateSquare();
            if ((i + 1) % 3 == 0) {
//                System.out.println(" ");
            }
        }
        System.out.println("Sum of all squares = " + m);
    }

}

