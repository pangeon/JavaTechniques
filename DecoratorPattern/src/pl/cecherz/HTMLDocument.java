package pl.cecherz;

abstract class HTMLDocument implements WWWPageContent {

    protected WebContent htmlContent;

    public HTMLDocument(WebContent htmlContent) {
        this.htmlContent = htmlContent;
    }
}
