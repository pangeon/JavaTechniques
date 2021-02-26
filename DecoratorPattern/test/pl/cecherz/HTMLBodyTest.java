package pl.cecherz;

import jdk.swing.interop.SwingInterOpUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class HTMLBodyTest {

    @Test
    public void wrapHTMLToBody() {
        String body = new HTMLBody(new WebContent()).wrapHTMLToBody("Agnieszka", "<span>");
        System.out.println(body);
    }
}