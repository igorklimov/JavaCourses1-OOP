package CollectionAndDataSctructures;

//      Программа запрашивает у пользователя произвольное количество строк.
//      Концом ввода считать пустую строку.
//      Программа должна сохранять только уникальные строки, дубликаты просто отбрасывать. Для этой цели использовать Set.
//      После окончания ввода программа должна отсортировать строки в алфавитном порядке и вывести их на консоль в отсортированном порядке.

import javax.swing.text.html.ListView;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Task1Set {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        HashSet<String> userInput = new HashSet<>();
        int Rand = random.nextInt(10) + 1;
        int i;

        for (i = 1; i < Rand; i++) {
            String input = scanner.nextLine();
            userInput.add(input);
        }

        for (String k : userInput) {
            System.out.println(k);
        }
    }
}



