public class NormalSubscription implements Subscription {

    @Override
    public double applyDiscount(double price) {
        return price; // no discount
    }
}
