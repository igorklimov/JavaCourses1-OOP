//        Создайте класс Human, который должен описывать человека.
//        У человека должны быть описаны следующие свойства:
//        имя, фамилия, возраст.
//
//        Для каждого из этих свойств должен быть создан метод
//        для его получения и задания нового значения (get and set methods).
//
//        Добавьте метод который будет выводить на экран приветствие в зависимости от свойств человека. (Hello! My name is NAME SURNAME, I'm AGE years old.)
//
//        Добавьте конструктор класса, который устанавливал бы значения свойств класса в начальные значения.
//
//        Для демонстрации работы с классом Human создайте программу
//        в которой создайте:
//        1 экземпляр при помощи конструктора по умолчанию и добавьте свойства при помощи созданных методов.
//        1 экземпляр при помощи нового конструктора который устанавливает значения свойств класса в начальные значения.
//
//        Переопределите метод toString() в классе Human таким образом,
//        что бы в выдаваемой строке содержалась информация о всех свойствах класса.
//
//        Выведите информацию о созданных людях на экран.

package Introduction;

public class Human {
    public String name;
    public String surname;
    public int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "Hello! My name is " + getName() + " " + getSurname() + ", I'm " + getAge() + " years old.";
    }

    public static void main (String [] args) {
        Human Igor = new Human();
        Igor.setName("Igor");
        Igor.setSurname("Klimov");
        Igor.setAge(25);

        System.out.println(Igor.toString());
    }
}
