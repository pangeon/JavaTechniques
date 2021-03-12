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
        for (Book book : bookStore) {
            System.out.println(book);
        }
    }

    @Override
    public String toString() {
        return bookStore.toString();
    }
}
