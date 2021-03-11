package pl.cecherz.html_builder;

interface WWWPageContent {
    String setTextContent(String text);
    String wrapToHTML(String wrapTag, String textContent);
    String wrapToHTML(String wrapTag, String attribute, String attributeValue, String textContent);
    String connectHeadAndBodySection(String headSection, String bodySection);
}
