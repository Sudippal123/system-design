package OpenClosePrinciple.ProblematicCode;

import java.util.List;

public class NotificationSender {
    public void sendNotification(List<NotificationType> notificationTypeList){
        for(NotificationType eachType : notificationTypeList){
            if(eachType == NotificationType.SMS){
                eachType.sendSMSNotification();
            } else if(eachType == NotificationType.EMAIL){
                eachType.sendEmailNotification();
            } else if(eachType == NotificationType.WHATSAPP){
                eachType.sendWhatsAppNotification();
            }
        }
    }
}
