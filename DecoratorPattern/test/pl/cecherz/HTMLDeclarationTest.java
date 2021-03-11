package pl.cecherz;

import org.junit.Before;
import org.junit.Test;

public class HTMLDeclarationTest {

    private String sampleWebPage;

    @Before
    public void init() {
        sampleWebPage = "<!DOCTYPE html>" +
                        "<html>" +
                            "<head>" +
                                "<title>webpage name</title>" +
                            "</head>" +
                            "<body>" +
                                "<span>span section</span>" +
                            "</body>" +
                        "</html>";
    }

    @Test
    public void checkSampleWebPageCreation_assertEquals() {
        String header = new HTMLHeader(new WebContent())
                .wrapHTMLToHead("title", "webpage name");
        String body = new HTMLBody(new WebContent())
                .wrapHTMLToBody("span", "span section");

        String htmlDocument = new HTMLDeclaration(new WebContent())
                .connectHeadAndBodySection(header, body);
        TestUtil.checkAndPrint(sampleWebPage, htmlDocument);
    }
}
