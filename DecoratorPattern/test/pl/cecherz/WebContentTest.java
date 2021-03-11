package pl.cecherz;

import org.junit.Before;
import org.junit.Test;

import static pl.cecherz.TestUtil.checkAndPrint;

public class WebContentTest {

    WebContent webContent;

    @Before
    public void init() {
        webContent = new WebContent();
    }

    @Test
    public void wrapTextContentToHTML_assertEquals() {
        String tag = webContent.wrapToHTML("span", "Hello");
        checkAndPrint("<span>Hello</span>", tag);
    }
    @Test
    public void wrapTextContentToHTML_br_assertEquals() {
        String tag = webContent.wrapToHTML("br", "");
        checkAndPrint("<br>", tag);
    }

    @Test
    public void wrapTextContentToHTMLAndAddAttribute_id_assertEquals() {
        String tag = webContent.wrapToHTML("span", "id", "emphasize", "Hello");
        checkAndPrint("<span id=\"emphasize\">Hello</span>", tag);
    }

    @Test
    public void wrapTextContentToHTMLAndAddAttribute_class_assertEquals() {
        String tag = webContent.wrapToHTML("span", "class", "block-12", "Hello");
        checkAndPrint("<span class=\"block-12\">Hello</span>", tag);
    }

    @Test
    public void wrapTextContentToHTMLAndAddAttribute_meta_assertEquals() {
        String tag = webContent.wrapToHTML("meta", "charset", "UTF-8", "");
        checkAndPrint("<meta charset=\"UTF-8\">", tag);
    }

    @Test
    public void setTextContent_assertEquals() {
        String text = webContent.setTextContent("Hello");
        checkAndPrint("Hello", text);
    }

}