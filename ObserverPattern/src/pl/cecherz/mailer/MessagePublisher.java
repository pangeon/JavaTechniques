package pl.cecherz.mailer;

import java.util.ArrayList;
import java.util.List;

public class MessagePublisher implements Subject {
    private final List<Observer> observerList = new ArrayList<>();

    @Override
    public void attach(Observer newObserver) {
        observerList.add(newObserver);
    }

    @Override
    public void detach(Observer unnecessaryObserver) {
        observerList.remove(unnecessaryObserver);
    }

    @Override
    public void notifyAboutUpdate(Message contentOfMessage) {
        for(Observer observerItem : observerList) {
            observerItem.update(contentOfMessage);
        }
    }
}
