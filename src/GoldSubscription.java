public class GoldSubscription implements Subscription {
    
    @Override
    public double applyDiscount(double price) {
        return price * 0.85; // 15% discount
    }

    @Override
    public String toString() {
        return "Gold Subscription (15% discount)";
    }
}
