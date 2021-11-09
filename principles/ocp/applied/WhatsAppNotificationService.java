package ocp.applied;

public class WhatsAppNotificationService implements Notificationservice {

    public void sendOTP(String medium) {
        System.out.println("Send Whatsapp OTP by " + medium);
    }
}
