package pl.cecherz;

public class HTMLBody extends HTMLDocument {

    public HTMLBody(WebContent htmlContent) {
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
    public String wrapHTMLToBody(String wrapTag, String textContent) {
        return "<body>"+ htmlContent.wrapToHTML(wrapTag, textContent) + "</body>";
    }
}
