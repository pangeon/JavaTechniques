package pl.cecherz.proglang.types;

public class WrapperType {

    private Type primitiveType;
    private String packagePath;
    private String name;

    public WrapperType() {
    }

    public WrapperType(Type primitiveType, String packagePath, String name) {
        this.primitiveType = primitiveType;
        this.packagePath = packagePath;
        this.name = name;
    }

    public WrapperType defineWrapperClass(Type primitiveType, String packagePath, String name) {
        return new WrapperType(primitiveType, packagePath, name);
    }

    @Override
    public String toString() {
        return "WrapperType{" +
                "primitiveType=" + primitiveType +
                ", packagePath='" + packagePath + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
