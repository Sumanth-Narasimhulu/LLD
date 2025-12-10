package BehaviouralDesginPatterns.StratergyDesignPattern;

public class PaymentProcessor {
    private PayementStratergy payementStratergy;
    public PaymentProcessor( PayementStratergy payementStratergy) {
        this.payementStratergy = payementStratergy;
    }
    public void executePayment() {
        payementStratergy.processPayment();
    }   
    public void setPaymentStratergy(PayementStratergy payementStratergy) {
        this.payementStratergy = payementStratergy;
    }

}
