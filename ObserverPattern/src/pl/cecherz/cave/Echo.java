package pl.cecherz.cave;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Echo implements Responder {
    @Override
    public void answer(String event) {}

    private final List<Responder> responderList = new ArrayList<>();

    public void addResponder(Responder responder) {
        responderList.add(responder);
    }
    public void checkWhatTextYouWrite() {
        Scanner reader = new Scanner(System.in);
        while (reader.hasNext()) {
            String readingLine = reader.nextLine();
            notifyResponders(readingLine);
        }
    }
    private void notifyResponders(String response) {
        for (Responder responder : responderList) {
            responder.answer(response);
        }
    }
}
