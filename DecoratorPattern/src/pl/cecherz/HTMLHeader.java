package pl.cecherz;

public class HTMLHeader extends HTMLDocument {

    public HTMLHeader(WebContent htmlContent) {
        super(htmlContent);
    }

    @Override
    public String setTextContent(String text) {
        return null;
    }

    @Override
    public String wrapToHTML(String wrapTag, String textContent) {
        return null;
    }

    public String wrapHTMLToHead(String wrapTag, String textContent) {
        return "<head>"+ htmlContent.wrapToHTML(wrapTag, textContent) + "</head>";
    }
}
