public class PlatinumSubscription implements Subscription {
    
    @Override
    public double applyDiscount(double price) {
        return price* 0.9; // 10% discount
    }
}
