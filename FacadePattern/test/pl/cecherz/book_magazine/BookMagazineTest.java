package pl.cecherz.book_magazine;

import org.junit.Before;
import org.junit.Test;

import static pl.cecherz.book_magazine.TestUtil.*;

public class BookMagazineTest {

    private BookMagazine magazine;
    private Book item1;
    private Book item2;
    private Book item3;
    private Book item4;

    String expectedItem1 = "1 | empty | empty | empty | empty | 0 | empty | empty | 1-1-1 | 0 | 0";
    String expectedItem2 = "2 | empty | empty | empty | empty | 0 | empty | empty | 1-1-1 | 0 | 0";
    String expectedItem3 = "3 | empty | empty | empty | empty | 0 | empty | empty | 1-1-1 | 0 | 0";
    String expectedItem4 = "4 | empty | empty | empty | empty | 0 | empty | empty | 1-1-1 | 0 | 0";

    @Before
    public void init() {
        magazine = new BookMagazine();
        item1 = new Book();
        item2 = new Book();
        item3 = new Book();
        item4 = new Book();

        item1.id(1);
        item2.id(2);
        item3.id(3);
        item4.id(4);

    }
    @Test
    public void createEmptyCollectionBooksItemsSuccess_addBook() {
        magazine.addBook(item1);
        magazine.addBook(item2);
        magazine.addBook(item3);
        magazine.addBook(item4);

        checkAndPrint(magazine.getBook(0).toString(), expectedItem1);
        checkAndPrint(magazine.getBook(1).toString(), expectedItem2);
        checkAndPrint(magazine.getBook(2).toString(), expectedItem3);
        checkAndPrint(magazine.getBook(3).toString(), expectedItem4);
    }

    @Test
    public void createEmptyCollectionBooksItemsSuccess_addAllBooks() {
        magazine.addAllBooks(item1, item2, item3, item4);

        checkAndPrint(magazine.getBook(0).toString(), expectedItem1);
        checkAndPrint(magazine.getBook(1).toString(), expectedItem2);
        checkAndPrint(magazine.getBook(2).toString(), expectedItem3);
        checkAndPrint(magazine.getBook(3).toString(), expectedItem4);
    }
    @Test
    public void removeEmptyItemsInCollectionBooks() {
        magazine.addAllBooks(item1, item2, item3, item4);

        magazine.removeBook(item1);
        magazine.removeBook(item2);
        magazine.removeBook(item4);

        checkAndPrint(magazine.getBook(0).toString(), expectedItem3);
    }
    @Test
    public void setEmptyItemsInCollectionBooks() {
        magazine.addAllBooks(item1, item2, item3, item4);
        magazine.setBook(2, new Book());

        checkFalseAndPrint(magazine.getBook(2).toString(), expectedItem3);

        String expectedItem3 = "0 | empty | empty | empty | empty | 0 | empty | empty | 1-1-1 | 0 | 0";
        checkAndPrint(magazine.getBook(2).toString(), expectedItem3);
    }
}