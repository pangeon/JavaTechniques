package pl.cecherz.book_magazine;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class BookMagazineTest {
    private List<String> authors;
    private String title;
    private Integer edition;
    private String placeOfPublication;
    private String publishingHouse;
    private Calendar yearOfPublishing;
    private Integer numberOfPages;
    private Long ISBN;

    @Before
    public void init() {
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
    }

    @Test
    public void test() {
        BookMagazine magazine = new BookMagazine();
        Book javaBook = new Book();

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


        magazine.addBook(javaBook);
        magazine.printBookList();

    }
    @Test
    public void test2() {
        BookMagazine magazine = new BookMagazine();
        Book javaBook = new Book();

    }

}