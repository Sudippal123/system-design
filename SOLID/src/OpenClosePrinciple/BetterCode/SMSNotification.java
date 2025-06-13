package OpenClosePrinciple.BetterCode;

public class SMSNotification implements Notification {
    @Override
    public void sendNotification() {
        System.out.println("This is SMS Notification");
    }
}
