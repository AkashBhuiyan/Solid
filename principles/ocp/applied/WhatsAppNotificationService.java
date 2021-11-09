package ocp.applied;

public class WhatsAppNotificationService implements Notificationservice {

    public void sendOTP(String medium) {
        System.out.println("Send OTP by " + medium);
    }
}
