package task_9_Lib;

public class LibraryCatalogExample {
    public static void main(String[] args) {
        Book book1 = new Book("Amintiri din Copilarie", "Ion Creanga", 1850);
        Book book3 = new Book("Ion Creanga", "Amintiri din Copilarie", 1850);
        Book book2 = new Book("Poezii", 1850);

        LibraryCatalog libraryCatalog = new LibraryCatalog();

        libraryCatalog.addBook(book1);
        libraryCatalog.addBook(book2);
        libraryCatalog.displayCatalog();

        book1.setTitle("Aminitiri vol.1");
        System.out.println('\n' + "Book collection after change: ");
        libraryCatalog.displayCatalog();
    }
}
