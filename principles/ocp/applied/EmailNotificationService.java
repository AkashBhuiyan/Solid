package ocp.applied;

public class EmailNotificationService implements Notificationservice {
    public void sendOTP(String medium) {
        System.out.println("Send Email OTP by " + medium);

    }

}
