package pl.cecherz.proglang;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import pl.cecherz.proglang.paradigm.ParadigmOOPTest;
import pl.cecherz.proglang.types.PrimaryTypeJavaTest;
import pl.cecherz.proglang.usage.ApplicationsTest;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        ParadigmOOPTest.class,
        PrimaryTypeJavaTest.class,
        ApplicationsTest.class
})
public class TestRunner {

}
