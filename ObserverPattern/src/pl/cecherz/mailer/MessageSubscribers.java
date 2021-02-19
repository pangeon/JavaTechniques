package pl.cecherz.mailer;

class MessageSubscriberOne implements Observer {
    @Override
    public void update(Message m) {
        System.out.println("MessageSubscriberOne :: " + m.contentOfMessage());
    }
}
class MessageSubscriberTwo implements Observer {
    @Override
    public void update(Message m) {
        System.out.println("MessageSubscriberTwo :: " + m.contentOfMessage());
    }
}
class MessageSubscriberThree implements Observer {
    @Override
    public void update(Message m) {
        System.out.println("MessageSubscriberThree :: " + m.contentOfMessage());
    }
}
