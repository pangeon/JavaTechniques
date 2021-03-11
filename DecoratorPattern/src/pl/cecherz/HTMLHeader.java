package pl.cecherz;

/* TODO: I want add many HTML tags to section head. */
public class HTMLHeader extends HTMLDocument {

    public HTMLHeader(WebContent htmlContent) {
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

    public String wrapHTMLToHead(String wrapTag, String textContent) {
        return "<head>"+ htmlContentSection.wrapToHTML(wrapTag, textContent) + "</head>";
    }

    public String wrapHTMLToHead(String wrapTag, String attribute, String attributeValue, String textContent) {
        return "<head>"+ htmlContentSection.wrapToHTML(wrapTag, attribute, attributeValue, textContent) + "</head>";
    }
}
