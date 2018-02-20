package CollectionAndDataSctructures;

//      Программа запрашивает у пользователя произвольное количество строк.
//      Концом ввода считать пустую строку.
//      Программа должна сохранять уникальные строки + подсчитывать сколько раз их ввёл пользователь, дубликаты отбрасывать. Для этой цели использовать Map.
//      После окончания ввода программа должна отсортировать строки (более чаще встречающиеся строки должны быть в начале,
//      а встретившиеся всего один раз в конце) и вывести результат на консоль.

import java.util.HashMap;
import java.util.Scanner;
import java.util.HashSet;

public class Task2Map {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> userInput = new HashMap<>();
        HashSet<Integer> x = new HashSet<>();
        String input = "test";

        while (!input.isEmpty()) {
            input = scanner.nextLine();
            userInput.put(input, "number");
        }
        userInput.remove("", "number");
        System.out.println(userInput.size() + String.valueOf(userInput));
    }

}
