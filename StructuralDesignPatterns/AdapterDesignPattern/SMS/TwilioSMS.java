package StructuralDesignPatterns.AdapterDesignPattern.SMS;

public class TwilioSMS {
    public void pushMessage(String mobileNumber, String message) {
        System.out.println("Sending SMS from "+ mobileNumber+" and data is "+message);
    }
}
