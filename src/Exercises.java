import java.time.LocalDate;
import java.util.*;
import java.util.Map;

public class Exercises {

    record Author(String firstName,
                  String lastName,
                  int numberOfBooksWritten) {}

    record Book(String title,
                Author author,
                int pages,
                LocalDate issueDate,
                double price) {}

    public static void main(String[] args) {
        // Authors
        Author adams = new Author("Douglas", "Adams", 7);
        Author marquez = new Author("Gabriel", "García Márquez", 6);
        Author saramago = new Author("José", "Saramago", 20);
        Author faulkner = new Author("William", "Faulkner", 19);
        Author tolkien = new Author("J.R.R.", "Tolkien", 15);

        // Books
        Book hitchhikersGuide = new Book("Hitchhiker's Guide to the Galaxy", adams, 224, LocalDate.of(1979, 10, 12), 15.99);
        Book yearsOfSolitude = new Book("One Hundred Years of Solitude", marquez, 417, LocalDate.of(1967, 5, 30), 12.99);
        Book cain = new Book("Cain", saramago, 272, LocalDate.of(2009, 9, 1), 14.99);
        Book lightInAugust = new Book("Light in August", faulkner, 480, LocalDate.of(1932, 6, 6), 11.99);
        Book lordOfTheRings = new Book("The Lord of the Rings", tolkien, 1178, LocalDate.of(1954, 7, 29), 19.99);

        List<Author> authors = List.of(adams, marquez, saramago, faulkner, tolkien);
        List<Book> books = List.of(hitchhikersGuide, yearsOfSolitude, cain, lightInAugust, lordOfTheRings);

        assert List.of(cain).equals(beginner1(books));
        assert 2571 == beginner2(books);
        assert Boolean.TRUE.equals(beginner3(authors));

        assert List.of(tolkien, saramago, faulkner).equals(intermediate1(authors));
        assert 15.24 == intermediate2(books, LocalDate.of(2000, 1, 1));
        assert Boolean.TRUE.equals(intermediate3(books));

        assert Set.of(adams.lastName, marquez.lastName, saramago.lastName, faulkner.lastName, tolkien.lastName).equals(advanced1(books).keySet());
        assert Boolean.FALSE.equals(advanced2(books));
        assert Set.of(adams.lastName, marquez.lastName, saramago.lastName, faulkner.lastName).equals(advanced3(books, authors).keySet());
    }

    /**
     * @return all books published after 2000
     */
    private static List<Book> beginner1(List<Book> books) {
        return null; // TODO: implement
    }

    /**
     * @return total number of pages of all books combined
     */
    private static int beginner2(List<Book> books) {
        return 0; // TODO: implement
    }

    /**
     * @return true if there is at least one author who has written 10 books, false otherwise
     */
    private static boolean beginner3(List<Author> authors) {
        return false; // TODO: implement
    }

    /**
     * @return top 3 authors who have written more than 10 books
     * in a reverse alphabetic order (sorted by last name)
     */
    private static List<Author> intermediate1(List<Author> authors) {
        return null; // TODO: implement
    }

    /**
     * @return average price of books issued before the date
     */
    private static double intermediate2(List<Book> books, LocalDate issueDate) {
        return 0; // TODO: implement
    }

    /**
     * @return true if the author of the book with the largest number of pages
     * has written more than 10 books, false otherwise
     */
    private static boolean intermediate3(List<Book> books) {
        return false; // TODO: implement
    }

    /**
     * @return a map where the key is the author's last name
     * and the value is a list of books written by that author
     */
    private static Map<String, List<Book>> advanced1(List<Book> books) {
        return null; // TODO: implement
    }

    /**
     * @return true if the last name of the authors of the 3 latest books starts with "T", false otherwise
     */
    private static boolean advanced2(List<Book> books) {
        return false; // TODO: implement
    }

    /**
     * @return a map where the key is the author's last name whose book has less than 500 pages
     * and the value is the total number of books written by that author
     */
    private static Map<String, Integer> advanced3(List<Book> books, List<Author> authors) {
        return null; // TODO: implement
    }
}
