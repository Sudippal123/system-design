package OpenClosePrinciple.BetterCode;

public class WhatsAppNotification implements Notification{
    @Override
    public void sendNotification() {
        System.out.println("This is WhatsApp Notification");
    }
}
