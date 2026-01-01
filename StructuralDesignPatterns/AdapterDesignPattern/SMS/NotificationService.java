package StructuralDesignPatterns.AdapterDesignPattern.SMS;

public class NotificationService {
    private Sms sms;
    public NotificationService(Sms sms) {
        this.sms = sms;
    }
    public void sendMessage(String mobileNumber, String message) {
        sms.sendSMS(mobileNumber, message);
    }
}
