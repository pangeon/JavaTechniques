package pl.cecherz.html_builder;

import org.junit.Assert;

public class TestUtil {
    public static void checkAndPrint(String HTMLHeader, String expectedValue) {
        Assert.assertEquals(HTMLHeader, expectedValue);
        System.out.println(HTMLHeader);
    }
}
