package pl.cecherz.html_builder;

/* TODO: I want add many HTML tags to section body. */
public class HTMLBody extends HTMLDocument {

    public HTMLBody(WebContent htmlContent) {
        super(htmlContent);
    }

    /* TODO: I want delete unnecessary methods . */
    @Override
    public String setTextContent(String text) {
        return null;
    }

    @Override
    public String wrapToHTML(String wrapTag, String textContent) {
        return null;
    }

    @Override
    public String wrapToHTML(String wrapTag, String attribute, String attributeValue, String textContent) {
        return null;
    }

    @Override
    public String connectHeadAndBodySection(String headSection, String bodySection) {
        return null;
    }

    public String wrapHTMLToBody(String wrapTag, String textContent) {
        return "<body>"+ htmlContentSection.wrapToHTML(wrapTag, textContent) + "</body>";
    }
}
