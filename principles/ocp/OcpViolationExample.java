package ocp;

public class OcpViolationExample {
    public void sendOTP(String medium){
        if(medium.equals("email")){
            System.out.println(medium);
        }
        if(medium.equals("mobile")){
            System.out.println(medium);
        }
    }
}
