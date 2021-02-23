package pl.cecherz.proglang.paradigm;

import org.junit.Before;
import org.junit.Test;

public class ParadigmOOPTest {
    private OOP programmingParadigm;

    @Before
    public void init() {
        programmingParadigm = new OOP();
    }
    @Test
    public void showInfoAboutProgrammingParadigm() {
        System.out.println(programmingParadigm.getInfoAbout());
    }
}