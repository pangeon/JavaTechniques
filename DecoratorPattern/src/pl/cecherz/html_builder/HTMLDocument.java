package pl.cecherz.html_builder;

abstract class HTMLDocument implements WWWPageContent {

    protected WebContent htmlContentSection;

    public HTMLDocument(WebContent htmlContentSection) {
        this.htmlContentSection = htmlContentSection;
    }





}
