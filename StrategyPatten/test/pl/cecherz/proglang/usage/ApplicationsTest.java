package pl.cecherz.proglang.usage;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class ApplicationsTest {
    private Applications applications;
    private ArrayList<String> usages;

    @Before
    public void init() {
        applications = new Applications();
        applications.addUsage("Private");
        applications.addUsage("Mobile");
        applications.addUsage("Enterprise");

        usages = new ArrayList<>();
        usages.add("Private");
        usages.add("Mobile");
        usages.add("Enterprise");
    }

    @Test
    public void addUsagesToListAndCheckAssertNotNull() {
        Assert.assertNotNull(applications);
    }

    @Test
    public void addUsagesToListAndCheckAssertEquals() {
        Assert.assertEquals(usages, applications.getApplicationAreas());
    }

    @Test
    public void printInfoAboutList() {
        System.out.println("Expected: " + applications.getApplicationAreas());
        System.out.println("Actual:   " + usages);
    }
}