package task_16b_Map_List_Library;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class LibraryManager {

    private List<String> bookTitles;
    private Map<String, String> bookAuthors;

    public LibraryManager() {
        bookTitles = new ArrayList<>();
        bookAuthors = new HashMap<>();

    }

    public void addBook(String title, String author) {
        bookTitles.add(title);
        bookAuthors.put(title, author);
        System.out.println(title + " by " + author + "has been added");
    }

    public void removeBook(String title) {
        if (bookTitles.contains(title)) {
            bookTitles.remove(title);
            bookAuthors.remove(title);
            System.out.println(title + " has been removed ");
        } else {
            System.out.println(title + " has not been found");
        }
    }

    public void displayInventory() {
        System.out.println("Library inventory: ");
        for (Map.Entry<String,String> entry : bookAuthors.entrySet()) {
            System.out.println(entry.getKey()+" by "+ entry.getValue());
       }
    }

    public void findAuthor(String title) {
        if (bookTitles.contains(title)) {
            System.out.println("Author of " + title + " is " + bookAuthors.get(title));
        }
    }

    public static void main(String[] args) {
        LibraryManager library = new LibraryManager();
        library.addBook("The Great Gatsby", "F. Scott Fitzgerald");
        library.addBook("To Kill a Mockingbird", "Harper Lee");
        library.addBook("1984", "George Orwell");
        library.displayInventory();
        library.removeBook("1984");
        library.displayInventory();
        library.findAuthor("The Great Gatsby");
    }
}


