package payment;
import payment.PaymentStrategy;

public class BitcoinPayment implements PaymentStrategy {
    String walletAddress;

    public BitcoinPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using bitcoin.");
    }

    @Override
    public String getPaymentDetails() {
        return "Bitcoin Payment - Wallet: " + walletAddress;
    }
}
