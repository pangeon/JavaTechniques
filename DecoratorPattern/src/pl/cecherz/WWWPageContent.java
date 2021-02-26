package pl.cecherz;

interface WWWPageContent {
    String setTextContent(String text);
    String wrapToHTML(String wrapTag, String textContent);
}
