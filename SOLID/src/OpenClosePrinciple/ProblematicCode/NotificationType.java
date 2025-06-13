package OpenClosePrinciple.ProblematicCode;

public enum NotificationType {
    SMS,

    EMAIL,

    WHATSAPP;

    public void sendSMSNotification(){
        System.out.println("This is SMS Notification");
    }

    public void sendEmailNotification(){
        System.out.println("This is Email Notification");
    }

    public void sendWhatsAppNotification(){
        System.out.println("This is WhatsApp Notification");
    }
}
