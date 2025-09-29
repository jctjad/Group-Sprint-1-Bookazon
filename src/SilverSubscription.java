public SilverSubscription implements Subscription {
    
    @Override
    public double applyDiscount(double price) {
        return price * 0.95; // 5% discount
    }
}