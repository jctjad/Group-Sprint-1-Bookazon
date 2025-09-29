import java.util.ArrayList;

public class User {
    private String name;
    private Subscription subscription;
    private Address address;

    public User(String name, Subscription subscription, Address address) {
        this.name = name;
        this.subscription = subscription;  // normal, gold, platinum, silver membership
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Subscription getSubscription() {
        return subscription;
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }

    public Address getAddress() {
        return address;
    }
}
