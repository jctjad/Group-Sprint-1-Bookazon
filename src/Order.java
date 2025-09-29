import java.util.ArrayList;

public class Order {
    private OrderDate date = new OrderDate();
    private User userName;
    private String orderStatus;
    private Address shippingAddress = new Address("Shipping");
    private Address billingAddress = new Address("Billing");
    private ArrayList<CartItem> items;
    private double orderPrice;

    public Order(Cart cart, User userName) {
        this.items = cart.getItems();
        this.userName = userName;
        this.orderPrice = calculatePrice(userName.getSubscription());
    }

    public void setShippingAddress(String line1, String line2, String city, String state, String zip, String country) {
        this.shippingAddress.setAddress(line1, line2, city, state, zip, country);
    }

    public void setBillingAddress(String line1, String line2, String city, String state, String zip, String country) {
        this.billingAddress.setAddress(line1, line2, city, state, zip, country);
    }

    public void setOrderStatus(String status) {
        this.orderStatus = status;
    }

    public void setDateCreated(String date) {
        this.date.setDateCreated(date);
    }

    public void setDateShipped(String date) {
        this.date.setDateShipped(date);
    }

    public void printOrderDetails() {
        System.out.println("Order Details:");
        this.date.printDate();
        System.out.println("User Name: " + userName);
        System.out.println("Order Status: " + orderStatus);
        this.shippingAddress.printAddressDetails();
        this.billingAddress.printAddressDetails();
        System.out.println("Order Price: $" + orderPrice);
    }

    public double calculatePrice(Subscription subscription) {
        double totalPrice = 0.0;

        for (CartItem item : items) {
            totalPrice += item.getTotalPrice();
        }

        totalPrice = subscription.applyDiscount(totalPrice);

        return totalPrice;
    }
}
