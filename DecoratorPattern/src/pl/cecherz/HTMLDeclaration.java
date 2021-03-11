package pl.cecherz;

public class HTMLDeclaration extends HTMLDocument {
    public HTMLDeclaration(WebContent htmlContent) {
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

    @Override
    public String wrapToHTML(String wrapTag, String attribute, String attributeValue, String textContent) {
        return null;
    }

    @Override
    public String connectHeadAndBodySection(String headSection, String bodySection) {
        return htmlContentSection.connectHeadAndBodySection(headSection, bodySection);
    }
}
