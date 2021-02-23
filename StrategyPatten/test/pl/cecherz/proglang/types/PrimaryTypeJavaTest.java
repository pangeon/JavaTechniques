package pl.cecherz.proglang.types;

import org.junit.Before;
import org.junit.Test;
import pl.cecherz.proglang.ProgrammingLang;

import java.util.Arrays;

public class PrimaryTypeJavaTest {

    private ProgrammingLang lang;
    private Type[] types;

    @Before
    public void init() {
        lang = new ProgrammingLang();
        lang.typesStrategy = new StaticTypesStrategy();
    }

    @Test
    public void givenTypesTableWhenDefineTextTypeThenPrintAll() {
        types = new Type[1];

        types[0] = new Type().defineTextType("char", 1);
        lang.typesStrategy.defineAllPrimitiveTypesInLang(types);

        System.out.println(Arrays.toString(types));
    }

    @Test
    public void givenTypesTableWhenDefineIntegralNumericTypeThenPrintAll() {
        types = new Type[4];

        types[0] = new Type().defineIntegralNumericType("byte", 1);
        types[1] = new Type().defineIntegralNumericType("short", 2);
        types[2] = new Type().defineIntegralNumericType("integer", 4);
        types[3] = new Type().defineIntegralNumericType("long", 8);
        lang.typesStrategy.defineAllPrimitiveTypesInLang(types);

        System.out.println(Arrays.toString(types));
    }

    @Test
    public void givenTypesTableWhenDefineFloatingNumericTypeThenPrintAll() {
        types = new Type[2];

        types[0] = new Type().defineFloatingNumericType("float", 4);
        types[1] = new Type().defineFloatingNumericType("double", 8);
        lang.typesStrategy.defineAllPrimitiveTypesInLang(types);

        System.out.println(Arrays.toString(types));
    }

    @Test
    public void givenTypesTableWhenDefineBinaryTypeThenPrintAll() {
        types = new Type[1];

        types[0] = new Type().defineBinaryType("boolean");
        lang.typesStrategy.defineAllPrimitiveTypesInLang(types);

        System.out.println(Arrays.toString(types));
    }
}