public class GoldSubscription implements Subscription {
    
    @Override
    public double applyDiscount(double price) {
        return price * 0.85; // 15% discount
    }
}
