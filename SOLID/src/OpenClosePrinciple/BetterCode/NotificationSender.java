package OpenClosePrinciple.BetterCode;

import java.util.List;

public class NotificationSender {
    public void sendNotification(List<Notification> notificationList){
        for(Notification eachNotification : notificationList){
            eachNotification.sendNotification();
        }
    }
}
