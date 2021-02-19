package pl.cecherz.cave;

public class Action {
    public static void main(String[] args) {
        System.out.println("Enter text into console: ");
        Echo sourceOfResponses = new Echo();

        sourceOfResponses.addResponder(text -> {
            System.out.println("You write: " + text);
        });
        sourceOfResponses.addResponder(text -> {
            System.out.println("You write: " + text);
        });

        sourceOfResponses.checkWhatTextYouWrite();
    }
}
