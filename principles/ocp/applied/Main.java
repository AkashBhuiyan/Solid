package ocp.applied;

public class Main {
    public static void main(String args[]){
        NotificationClassification notificationClassification = new NotificationClassification();
        notificationClassification.setVendor("Airtel");
        MobileNotificationService mobileNotificationService = new MobileNotificationService();
        //WhatsAppNotificationService whatsAppNotificationService = new WhatsAppNotificationService();
        notificationClassification.setNotificationservice(mobileNotificationService);
        SendNotification sendNotification = new SendNotification();
        sendNotification.sendNotification(notificationClassification);
    }
}
