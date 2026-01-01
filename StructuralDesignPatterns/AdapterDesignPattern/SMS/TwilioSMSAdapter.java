package StructuralDesignPatterns.AdapterDesignPattern.SMS;

public class TwilioSMSAdapter implements Sms {
    private TwilioSMS twilioSMS = new TwilioSMS();

    @Override
    public void sendSMS(String mobileNumber, String message) {
        twilioSMS.pushMessage(mobileNumber, message);
    }
}
