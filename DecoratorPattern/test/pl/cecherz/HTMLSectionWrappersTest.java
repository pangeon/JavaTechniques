package pl.cecherz;

import org.junit.Test;

import static pl.cecherz.TestUtil.checkAndPrint;

public class HTMLSectionWrappersTest {

    @Test
    public void wrapHTMLContentToHeadSection_title_assertEquals() {
        String HTMLHeader = new HTMLHeader(new WebContent())
                .wrapHTMLToHead("title", "webpage name");
        checkAndPrint(HTMLHeader, "<head><title>webpage name</title></head>");
    }

    @Test
    public void wrapHTMLContentToHeadSection_meta_assertEquals() {
        String HTMLHeader = new HTMLHeader(new WebContent())
                .wrapHTMLToHead("meta", "charset", "UTF-8", "");
        checkAndPrint(HTMLHeader, "<head><meta charset=\"UTF-8\"></meta></head>");
    }

    @Test
    public void wrapHTMLContentToBodySection_assertEquals() {
        String HTMBody = new HTMLBody(new WebContent()).wrapHTMLToBody("span", "span section");
        checkAndPrint(HTMBody, "<body><span>span section</span></body>");
    }




}