package pl.cecherz.book_magazine;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pl.cecherz.book_magazine.Book;

import static pl.cecherz.book_magazine.TestUtil.*;

public class BookTest {
    private Book emptyBook;
    private Book bookWithAttributes;

    private final String emptyBookExpectedValue =
            "0 | empty | empty | empty | empty | 0 | empty | empty | 1-1-1 | 0 | 0";

    private final String bookWithAttributesExpectedValue =
            "1 | Horstmann Cay S., Cornell Gary | Łukasz Piwko | Java. Podstawy | " +
            "polish | 9 | Gliwice | Helion | 2013-11-9 | 864 | 9788328324800";

    @Before
    public void initEmptyBook() {
        emptyBook = new Book();
    }

    @Before
    public void initBookWithAttributes() {
        bookWithAttributes = new Book();

        bookWithAttributes.id(1);
        bookWithAttributes.authors("Horstmann Cay S.", "Cornell Gary");
        bookWithAttributes.translators("Łukasz Piwko");
        bookWithAttributes.title("Java. Podstawy");
        bookWithAttributes.language("polish");
        bookWithAttributes.edition(9);
        bookWithAttributes.placeOfPublication("Gliwice");
        bookWithAttributes.publishingHouse("Helion");
        bookWithAttributes.dateOfPublishing(2013, 12, 9);
        bookWithAttributes.numberOfPages(864);
        bookWithAttributes.ISBN(9788328324800L);
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
    public void safeDateToOverflowTest() {
        Book bookWithCorrectDate = new Book();
        bookWithCorrectDate.dateOfPublishing(1, 11, 1);

        Book bookWithOverflowDate = new Book();
        bookWithOverflowDate.dateOfPublishing(1, 14, 1);

        checkAndPrint(bookWithCorrectDate.toString(), bookWithOverflowDate.toString());
    }
}