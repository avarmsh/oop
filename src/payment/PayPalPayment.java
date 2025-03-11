package payment;
import payment.PaymentStrategy;

public class PayPalPayment implements PaymentStrategy {
    String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using paypal.");
    }

    @Override
    public String getPaymentDetails() {
        return "PayPal Payment - Email: " + email;
    }
}
