package BehaviouralDesginPatterns.StratergyDesignPattern;

public class Main {
    public static void main(String[] args) {
        PayementStratergy creditCardPayment = new CreditCardPayment();
        PayementStratergy phonePayment = new PhonePayment();
        PayementStratergy crypPayement = new CryptoPayment();
        PaymentProcessor processor = new PaymentProcessor( creditCardPayment );
        processor.executePayment();
        processor.setPaymentStratergy(phonePayment);
        processor.executePayment();

        processor.setPaymentStratergy(crypPayement);
        processor.executePayment();
        
    }
}
