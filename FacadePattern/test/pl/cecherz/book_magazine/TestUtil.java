package pl.cecherz.book_magazine;

import org.junit.Assert;

public class TestUtil {
    public static void checkAndPrint(String passedValue, String expectedValue) {
        Assert.assertEquals(passedValue, expectedValue);
        System.out.println(passedValue);
    }
    public static void checkFalseAndPrint(String passedValue, String expectedValue) {
        Assert.assertNotEquals(passedValue, expectedValue);
        System.out.println(passedValue);
    }
    public static String multiString(String stringToMultiplication, int counter) {
        int i = 0;
        String concatString = "";
        while (i < counter) {
            concatString += stringToMultiplication;
            i++;
        }
        return concatString;
    }
}
