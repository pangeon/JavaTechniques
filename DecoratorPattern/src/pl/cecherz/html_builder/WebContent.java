package pl.cecherz.html_builder;

public class WebContent implements WWWPageContent {

    String textContent;

    @Override
    public String setTextContent(String text) {
        this.textContent = text;
        return textContent;
    }

    @Override
    public String wrapToHTML(String wrapTag, String textContent) {
        String startWrapTag;
        String endWrapTag;

        if (textContent.equals("")) {
            startWrapTag = "<" + wrapTag;
            endWrapTag = ">";
        } else {
            startWrapTag = "<" + wrapTag + ">";
            endWrapTag = "</" + wrapTag + ">";
        }
        return startWrapTag + setTextContent(textContent) + endWrapTag;
    }

    @Override
    public String wrapToHTML(String wrapTag, String attribute, String attributeValue, String textContent) {

        String startWrapTag;
        String endWrapTag;
        String tagProperties = attribute + "=\"" + attributeValue + "\"";

        if (textContent.equals("")) {
            startWrapTag = "<" + wrapTag + " " + tagProperties;
            endWrapTag = ">";
        } else {
            startWrapTag = "<" + wrapTag + " " + tagProperties + ">";
            endWrapTag = "</" + wrapTag + ">";
        }
        return startWrapTag + setTextContent(textContent) + endWrapTag;
    }

    @Override
    public String connectHeadAndBodySection(String headSection, String bodySection) {
        String doctype = "<!DOCTYPE html>";
        String startWrapTag = "<html>";
        String endWrapTag = "</html>";

        return doctype + startWrapTag + headSection + bodySection + endWrapTag;
    }
}
