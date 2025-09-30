public class NormalSubscription implements Subscription {

    @Override
    public double applyDiscount(double price) {
        return price; // no discount
    }

    @Override
    public String toString() {
        return "Normal Subscription (no discount)";
    }
}
