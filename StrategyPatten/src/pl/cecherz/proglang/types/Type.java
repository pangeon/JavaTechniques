package pl.cecherz.proglang.types;

public class Type {
    private String name;
    private boolean isText;
    private boolean isNumeric;
    private boolean isIntegral;
    private int bytes;
    private int bites;

    public Type() {};

    private Type(String name) {
        this.name = name;
        this.bites = 2;
    }
    private Type(String name, boolean isText, int bytes) {
        this.name = name;
        this.isText = isText;
        this.bytes = bytes;
    }
    private Type(String name, boolean isNumeric, boolean isIntegral, int bytes) {
        this.name = name;
        this.isNumeric = isNumeric;
        this.isIntegral = isIntegral;
        this.bytes = bytes;
    }

    public Type defineTextType(String name, int bytes) {
        return new Type(name, true, bytes);
    }

    public Type defineIntegralNumericType(String name, int bytes) {
        return new Type(name, true, true, bytes);
    }

    public Type defineFloatingNumericType(String name, int bytes) {
        return new Type(name, true, false, bytes);
    }
    public Type defineBinaryType(String name) {
        return new Type(name);
    }

    @Override
    public String toString() {
        return "Type{" +
                "name='" + name + '\'' +
                ", isText=" + isText +
                ", isNumeric=" + isNumeric +
                ", isIntegral=" + isIntegral +
                ", bytes=" + bytes +
                '}';
    }
}
