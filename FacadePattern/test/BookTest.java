import org.junit.Before;
import org.junit.Test;
import pl.cecherz.book_magazine.Book;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import static pl.cecherz.book_magazine.TestUtil.*;

public class BookTest {
    private Book emptyBook = new Book();

    private Book bookWithAttributes;

    private Book bookWithFullDescription;

    private List<String> authors;
    private String title;
    private Integer edition;
    private String placeOfPublication;
    private String publishingHouse;
    private Calendar yearOfPublishing;
    private Integer numberOfPages;
    private Long ISBN;

    private final String emptyBookExpectedValue =
            "null | null | null | null | null | null | null | null";

    private final String bookWithAttributesExpectedValue =
            "[Horstmann Cay S., Cornell Gary] | Java. Podstawy | " +
            "null | null | null | null | null | null";

    private final String bookWithFullDescriptionExpectedValue =
            "[Horstmann Cay S., Cornell Gary] | Java. Podstawy | 9 | Gliwice | Helion | " +
            "2013-11-2 | 864 | 9788328324800";

    @Before
    public void init() {
        emptyBook = new Book();
        bookWithAttributes = new Book();

        authors = new ArrayList<>();
        authors.add("Horstmann Cay S.");
        authors.add("Cornell Gary");
        title = "Java. Podstawy";

        edition = 9;
        placeOfPublication = "Gliwice";
        publishingHouse = "Helion";
        yearOfPublishing = Calendar.getInstance();
        yearOfPublishing.set(2013, Calendar.DECEMBER, 2);
        numberOfPages = 864;
        ISBN = 9788328324800L;

        //bookWithAttributes.setAuthors(authors);
        //bookWithAttributes.setTitle(title);

    }

    @Test
    public void emptyBookCreationSuccess() {
        checkAndPrint(emptyBook.toString(), emptyBookExpectedValue);
    }

    @Test
    public void bookWithAttributesCreationSuccess() {
        checkAndPrint(bookWithAttributes.toString(), bookWithAttributesExpectedValue);
    }

    @Test
    public void bookWithFullDescriptionCreationSuccess() {
        checkAndPrint(bookWithFullDescription.toString(), bookWithFullDescriptionExpectedValue);
    }
    @Test
    public void test() {
        Book book = new Book();
        book.id(5);
        book.authors("Adam", "Artur");
        book.dateOfPublishing(1997, 4, 18);
        System.out.println(book);
    }
}