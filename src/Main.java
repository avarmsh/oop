import payment.*;

public class Main {
    public static void main(String[] args) {
        PaymentStrategy creditCard = new CreditCardPayment("6104-3387-0987-1234", "Ava Aramesh");
        PaymentStrategy paypal = new PayPalPayment("golbargaramesh@gmail.com");
        PaymentStrategy bitcoin = new BitcoinPayment("dibasbitcoinwallet");

        Customer customer1 = new RegularCustomer("Ava");
        Customer customer2 = new RegularCustomer("Golbarg");
        Customer customer3 = new PremiumCustomer("Diba");


        customer1.makePayment(bitcoin, 1000.0);
        customer1.makePayment(paypal, 980.0);
        customer2.makePayment(bitcoin, 600.0);
        customer2.makePayment(creditCard, 200.0);
        customer3.makePayment(paypal, 30000.0);
        customer3.makePayment(creditCard, 100.0);


        System.out.println();
        customer1.displayCustomerInfo();
        customer1.showPaymentHistory();
        System.out.println();

        customer2.displayCustomerInfo();
        customer2.showPaymentHistory();
        System.out.println();

        customer3.displayCustomerInfo();
        customer3.showPaymentHistory();
    }
}
