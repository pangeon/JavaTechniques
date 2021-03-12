package pl.cecherz.book_magazine;

import java.util.Calendar;

public class Book {

    private static final String DEFAULT_STRING_VALUE = "empty";
    private static final Integer DEFAULT_NUMBER_VALUE = 0;

    private Integer id = DEFAULT_NUMBER_VALUE;
    private String authors = DEFAULT_STRING_VALUE;
    private String translators = DEFAULT_STRING_VALUE;
    private String title = DEFAULT_STRING_VALUE;
    private String language = DEFAULT_STRING_VALUE;
    private Integer edition = DEFAULT_NUMBER_VALUE;
    private String placeOfPublication = DEFAULT_STRING_VALUE;
    private String publishingHouse = DEFAULT_STRING_VALUE;
    private Calendar dateOfPublishing = setDefaultDate();
    private Integer numberOfPages = DEFAULT_NUMBER_VALUE;
    private Long ISBN = 0L;

    public Book() {}

    public void id(Integer id) {
        this.id = id;
    }

    public void authors(String... authors) {
        this.authors = "";
        for (String author : authors) {
            if (authors[authors.length - 1].equals(author)) this.authors += author;
            else this.authors += author + ", ";
        }
    }
    public void translators(String... translators) {
        this.translators = "";
        for (String translator : translators) {
            if (translators[translators.length - 1].equals(translator)) this.translators += translator;
            else this.translators += translator + ", ";
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
        if(monthOfPublishing > 11) monthOfPublishing = 11;

        dateOfPublishing.set(yearOfPublishing, monthOfPublishing, dayOfPublishing);

        this.dateOfPublishing = dateOfPublishing;
    }
    private Calendar setDefaultDate() {
        Calendar defaultDate = Calendar.getInstance();
        defaultDate.set(0, 1, 1);
        return defaultDate;
    }

    public void numberOfPages(Integer numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void ISBN(Long ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return
                id + " | " +
                authors + " | " +
                translators + " | " +
                title + " | " +
                language + " | " +
                edition + " | " +
                placeOfPublication + " | " +
                publishingHouse + " | " +
                dateOfPublishing.get(Calendar.YEAR) + "-" +
                dateOfPublishing.get(Calendar.MONTH) + "-" +
                dateOfPublishing.get(Calendar.DAY_OF_MONTH) + " | " +
                numberOfPages + " | " +
                ISBN;
    }
}
