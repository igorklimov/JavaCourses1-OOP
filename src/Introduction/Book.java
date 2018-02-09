//        Создайте класс Book, который должен описывать книгу.
//                У книги должны быть описаны следующие свойства:
//        автор, год выпуска, название и количество страний.
//                Для каждого из этих свойств должен быть создан метод
//        для его получения и задания нового значения (get and set methods).
//
//        Для демонстрации работы с классом Book создайте программу
//        в которой создайте по крайней мере 3 экземпляра класса Book
//        с разными свойствами.
//        ______________________________
//        Добавьте в класс Book из Task 2 конструктор класса,
//        который устанавливал бы значения свойств класса в начальные значения.
//        Измените программу, которая демонстрирует работу с классом Book соответствующим образом.
//        ______________________________
//        переопределите метод toString() в классе Book таким образом,
//        что бы в выдаваемой строке содержалась информация о всех свойствах класса (авторе, годе выпуска, ...).
//        В демонстрационной программе продемонстрируйте работу метода toString() выводя его результат на консоль.


package Introduction;

public class Book {

    String genre;
    String author;
    int pages;
    int yearOfFirstPublication;

    public Book(String genre, String author, int pages, int yearOfFirstPublication) {
        this.genre = genre;
        this.author = author;
        this.pages = pages;
        this.yearOfFirstPublication = yearOfFirstPublication;
    }

    public String toString() {
        return this.genre + " " + this.pages + " " + this.yearOfFirstPublication + " " + this.author;
    }

//
//    Book thePictureOfDorianGray = new Book();
//    thePictureOfDorianGray.author ="Oscar Wilde";
//    thePictureOfDorianGray.genre ="Novel";
//    thePictureOfDorianGray.pages =254;
//    thePictureOfDorianGray.yearOfFirstPublication =1890;
//
//    Book theLordOfTheRing = new Book();
//
//    getTheLordOfTheRing() {
//        author = "J. R. R. Tolkien";
//        genre = "Fantasy";
//        pages = 1178;
//        yearOfFirstPublication = 1954;
//    }

    public static void main(String[] args) {

        Book powerOfNow = new Book("Fiction", "Oscar Wilde", 254, 1890);
        System.out.println(powerOfNow.toString());
    }

}