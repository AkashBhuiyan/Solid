package ocp.applied;

public class MobileNotificationService implements Notificationservice {
    public void sendOTP(String medium) {
        System.out.println("Send Mobile OTP by " + medium);
    }
}
