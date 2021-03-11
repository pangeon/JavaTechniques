package pl.cecherz.book_magazine;

import java.util.Calendar;


public class Book {
    private Integer id;
    private String authors = "";
    private String title;
    private String language;
    private Integer edition;
    private String placeOfPublication;
    private String publishingHouse;
    private Calendar dateOfPublishing;
    private Integer numberOfPages;
    private Long ISBN;

    public Book() {}

    public void id(Integer id) {
        this.id = id;
    }

    public void authors(String... authors) {
        for (String author : authors) {
            this.authors += author + ", ";
        }
    }

    public void title(String title) {
        this.title = title;
    }

    public void language(String language) {
        this.language = language;
    }

    public void edition(Integer edition) {
        this.edition = edition;
    }

    public void placeOfPublication(String placeOfPublication) {
        this.placeOfPublication = placeOfPublication;
    }

    public void publishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public void dateOfPublishing(Integer yearOfPublishing, Integer monthOfPublishing, Integer dayOfPublishing) {
        Calendar dateOfPublishing = Calendar.getInstance();
        dateOfPublishing.set(yearOfPublishing, monthOfPublishing, dayOfPublishing);

        this.dateOfPublishing = dateOfPublishing;
    }

    public void numberOfPages(Integer numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void ISBN(Long ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", authors=" + authors +
                ", title='" + title + '\'' +
                ", language='" + language + '\'' +
                ", edition=" + edition +
                ", placeOfPublication='" + placeOfPublication + '\'' +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", dateOfPublishing=" + dateOfPublishing +
                ", numberOfPages=" + numberOfPages +
                ", ISBN=" + ISBN +
                '}';
    }
}
