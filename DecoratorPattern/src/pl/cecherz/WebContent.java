package pl.cecherz;

public class WebContent implements WWWPageContent {

    String textContent;

    @Override
    public String setTextContent(String text) {
        this.textContent = text;
        return textContent;
    }

    @Override
    public String wrapToHTML(String wrapTag, String textContent) {
        String endWrapTag = wrapTag.charAt(0) + "/" + wrapTag.substring(1);
        return wrapTag + setTextContent(textContent) + endWrapTag;
    }
}
