package pl.cecherz.mailer;

public class Runner {
    public static void main(String[] args) {
        MessageSubscriberOne subscriberJohn = new MessageSubscriberOne();
        MessageSubscriberTwo subscriberMaria = new MessageSubscriberTwo();
        MessageSubscriberThree subscriberSue = new MessageSubscriberThree();

        MessagePublisher newsletter = new MessagePublisher();

        newsletter.attach(subscriberJohn);
        newsletter.attach(subscriberMaria);

        newsletter.notifyAboutUpdate(
            new Message("Add subscribers: John and Maria.")
        );

        newsletter.detach(subscriberJohn);
        newsletter.attach(subscriberSue);

        newsletter.notifyAboutUpdate(
            new Message("Remove subscriber Maria and add subscriber Sue.")
        );
    }
}
