package StructuralDesignPatterns.AdapterDesignPattern.SMS;
/*
        adapter pattern allows incompatible interfaces to work
        togather by allowing a translator b/w them
 */
public class Main {
    public static void main(String[] args) {
        Sms sms = new TwilioSMSAdapter();
        NotificationService notificationService = new NotificationService(sms);
        notificationService.sendMessage("6304509076","hi");

    }


}
