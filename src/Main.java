import task.Author;
import task.Book;
public class Main {
    public static void main(String[] args) {
        Author author = new Author("Иванов", "Иван");
        Book book = new Book("Простое представление объектов", author, 1995);
        Book book2 = new Book("Простое представление объектов", author, 1995);
        System.out.println(book.getName()+ " "+ book.getAuthor().getSurname() + " "+ book.getAuthor().getSurname()+" " + book.getPublicationYear());
        System.out.println(book);

        System.out.println(book.hashCode() == book2.hashCode());
        System.out.println(book.equals(book2));


    }
}