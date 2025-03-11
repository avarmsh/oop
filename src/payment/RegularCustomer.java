package payment;

public class RegularCustomer extends Customer {
    public RegularCustomer(String name) {
        super(name);
    }

    @Override
    public void displayCustomerInfo() {
        System.out.println("Customer's Name: " + name + " (Regular)");
    }
}
