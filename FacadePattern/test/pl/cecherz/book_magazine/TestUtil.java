package pl.cecherz.book_magazine;

import org.junit.Assert;

public class TestUtil {
    public static void checkAndPrint(String passedValue, String expectedValue) {
        Assert.assertEquals(passedValue, expectedValue);
        System.out.println(passedValue);
    }
}
