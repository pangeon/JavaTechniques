import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import pl.cecherz.book_magazine.BookMagazineTest;
import pl.cecherz.book_magazine.BookTest;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        BookTest.class,
        BookMagazineTest.class
})
public class TestRunner {

}
