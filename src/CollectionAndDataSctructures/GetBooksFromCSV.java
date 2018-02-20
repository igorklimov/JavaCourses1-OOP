package CollectionAndDataSctructures;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GetBooksFromCSV {


    public static void main(String[] args) {
        List<String> books = getBooks();
        Book[] bookObj = new Book[2];
        for (String book : books) {
            for (int i = 0; i < 2; i++) {
                bookObj[i] = new Book();
                String[] split = book.split(";");
                bookObj[i].setAuthor(String.valueOf(split[i]));
            }
        }
        System.out.println(String.valueOf(bookObj[1].getAuthor()));
    }

    static List<String> getBooks() {
        List<String> words = new ArrayList<>();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("/Users/igorsklimovs/IdeaProjects/Java1-OOP/src/CollectionAndDataSctructures/testCSV.csv"));
            String line = null;
            while ((line = reader.readLine()) != null) {
                words.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return words;
    }
}
