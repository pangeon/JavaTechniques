package pl.cecherz.proglang.types;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WrappersJavaTest {

    private String expectedStringResultForInt;
    private WrapperType wrappedIntPrimitiveType;
    private Type primitiveIntTypeInJava;

    @Before
    public void init() {
        expectedStringResultForInt = "WrapperType{primitiveType=Type{name='integer', isText=false, " +
                "isNumeric=true, isIntegral=true, bytes=4}, " +
                "packagePath='java.jang.Integer', name='Integer'}";

        primitiveIntTypeInJava = new Type()
                .defineIntegralNumericType("integer", 4);

        wrappedIntPrimitiveType = new WrapperType()
                .defineWrapperClass(primitiveIntTypeInJava, "java.jang.Integer", "Integer");

    }
    @Test
    public void wrapPrimitiveJavaTypeAndCheckAssertNotNull() {
        Assert.assertNotNull(primitiveIntTypeInJava);
        Assert.assertNotNull(wrappedIntPrimitiveType);
    }
    @Test
    public void wrapPrimitiveJavaTypeAndCheckAssertEquals() {
        Assert.assertEquals(expectedStringResultForInt, wrappedIntPrimitiveType.toString());
    }
    @Test
    public void showInfoAboutTest() {
        System.out.println(primitiveIntTypeInJava + "\n");
        System.out.println(wrappedIntPrimitiveType);
    }
}
