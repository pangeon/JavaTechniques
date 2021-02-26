package pl.cecherz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WebContentTest {

    WebContent webContent;

    @Before
    public void init() {
        webContent = new WebContent();
    }

    @Test
    public void wrapTextContentToHTML_assertEquals() {
        String tag = webContent.wrapToHTML("<span>", "Hello");
        Assert.assertEquals("<span>Hello</span>", tag);
        System.out.println(tag);
    }
    @Test
    public void setTextContent_assertEquals() {
        String text = webContent.setTextContent("Hello");
        Assert.assertEquals("Hello", text);
        System.out.println(text);
    }

}