package payment;
import java.util.ArrayList;

public abstract class Customer {
    String name;
    ArrayList<String> paymentHistory;

    public Customer(String name) {
        this.name = name;
        this.paymentHistory = new ArrayList<>();
    }

    public abstract void displayCustomerInfo();

    public void makePayment(PaymentStrategy paymentStrategy, double amount) {
        paymentStrategy.pay(amount);
        String paymentDetails = paymentStrategy.getPaymentDetails();
        paymentHistory.add("Paid " + amount + " - " + paymentDetails);
    }

    public void showPaymentHistory() {
        System.out.println("Payment History for " + name + ":");
        for (String record : paymentHistory) {
            System.out.println(record);
        }
    }
}
