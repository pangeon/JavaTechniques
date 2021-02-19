package pl.cecherz.mailer;

interface Subject {
    void attach(Observer o);
    void detach(Observer o);
    void notifyAboutUpdate(Message m);
}
