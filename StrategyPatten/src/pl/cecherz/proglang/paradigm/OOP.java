package pl.cecherz.proglang.paradigm;

public class OOP {
    public OOP(){};
    private final String name = "Object-Oriented Programming";
    private final String description =
        """
        Object-oriented programming (OOP) is a programming paradigm based on the concept of "objects", 
        which can contain data and code: data in the form of fields (often known as attributes or properties), 
        and code, in the form of procedures (often known as methods).
        """;
    public String getInfoAbout() {
        return name + "\n" + description;
    }
}
