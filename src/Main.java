import task.Author;
import task.Book;
public class Main {
    public static void main(String[] args) {
        Book book = new Book("title", new Author("Ivan", "Ivanov"), 1995);
        Book book1 = new Book("title", new Author("Ivan1", "Ivanov1"), 1996);
        Book book2 = new Book("title", new Author("Ivan2", "Ivanov2"), 1997);

        book.setPublicationYear(1998);
        System.out.println(book);
        System.out.println(book1);
        System.out.println(book2);

    }
}