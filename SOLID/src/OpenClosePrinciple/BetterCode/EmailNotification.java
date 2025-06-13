package OpenClosePrinciple.BetterCode;

public class EmailNotification implements Notification{
    @Override
    public void sendNotification() {
        System.out.println("This is Email Notification");
    }
}
