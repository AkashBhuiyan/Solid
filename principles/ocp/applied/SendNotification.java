package ocp.applied;

public class SendNotification {
    public void sendNotification(NotificationClassification notificationClassification){
        notificationClassification.getNotificationservice().sendOTP(notificationClassification.getVendor());
    }
}
