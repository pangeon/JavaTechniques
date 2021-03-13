package pl.cecherz.book_magazine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookMagazine {

    private final List<Book> bookStore = new ArrayList<>();

    public List<Book> getBookList() {
        return bookStore;
    }

    public Book getBook(int index) {
        return bookStore.get(index);
    }

    public void addBook(Book bookItem) {
        bookStore.add(bookItem);
    }

    public void addAllBooks(Book... books) {
        Collections.addAll(bookStore, books);
    }

    public void removeBook(Book bookItem) {
        bookStore.remove(bookItem);
    }

    public void setBook(Integer indexItem, Book bookItem) {
        bookStore.set(indexItem, bookItem);
    }

    public void printBookList() {
        printBookDescriptionHeader();
        for (Book book : bookStore) {
            System.out.println(book);
        }
    }

    private void printBookDescriptionHeader() {
        String bookDescriptionHeader =
                "id :: authors :: trans :: title :: lang :: edition :: " +
                "plcPub :: pubPrtHouse :: pubDate :: numPages :: ISBN\n" +
                "---------------------------------------------------------" +
                "-------------------------------------------------";
        System.out.println(bookDescriptionHeader);
    }

    @Override
    public String toString() {
        return bookStore.toString();
    }
}
