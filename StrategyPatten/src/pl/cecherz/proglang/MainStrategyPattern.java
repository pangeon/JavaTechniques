package pl.cecherz.proglang;

import pl.cecherz.proglang.paradigm.OOP;
import pl.cecherz.proglang.paradigm.OOPParadigmStrategy;
import pl.cecherz.proglang.types.DynamicTypesStrategy;
import pl.cecherz.proglang.types.StaticTypesStrategy;
import pl.cecherz.proglang.types.Type;
import pl.cecherz.proglang.usage.Applications;
import pl.cecherz.proglang.usage.UsageWebProgrammingLanguage;

import java.util.Arrays;

class MainStrategyPattern {
    public static void main(String[] args) {
        ProgrammingLang lang = new ProgrammingLang();

        lang.typesStrategy = new StaticTypesStrategy();
        lang.paradigmStrategy = new OOPParadigmStrategy();
        lang.usage = new UsageWebProgrammingLanguage();

        lang.defineAllTypesInLang(getTypesInJava());
        lang.setMainParadigm(defineAsOOP());
        lang.setApplications(defineTechnologyUsages());

        lang.typesStrategy = new DynamicTypesStrategy();
    }
    private static Applications defineTechnologyUsages() {
        Applications applications = new Applications();
        applications.addUsage("Web");
        applications.addUsage("Mobile");
        applications.addUsage("Desktop");

        print(applications.getApplicationAreas());

        return applications;
    }
    private static OOP defineAsOOP() {
        OOP paradigm = new OOP();
        print(paradigm.getInfoAbout());
        return paradigm;
    }
    private static Type[] getTypesInJava() {
        Type[] types = new Type[8];

        types[0] = new Type().defineBinaryType("boolean");
        types[1] = new Type().defineTextType("char", 2);

        types[2] = new Type().defineIntegralNumericType("byte", 1);
        types[3] = new Type().defineIntegralNumericType("short", 2);
        types[4] = new Type().defineIntegralNumericType("integer", 4);
        types[5] = new Type().defineIntegralNumericType("long", 8);

        types[6] = new Type().defineFloatingNumericType("float", 4);
        types[7] = new Type().defineFloatingNumericType("double", 8);
        printArray(types);
        return types;
    }
    private static void print(Object o) {
        System.out.println(o);
    }
    private static void printArray(Object[] o) {
        System.out.println(Arrays.toString(o));
    }
}
