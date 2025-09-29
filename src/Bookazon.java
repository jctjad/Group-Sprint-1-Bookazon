
import java.util.ArrayList;

public class Bookazon {

    private ArrayList<Media> media;
    private ArrayList<User> users;

    public Bookazon() {
        media = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addMedia(Media m) {   
        media.add(m);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void viewMedia() {         
        for (Media m : media) {
            m.printDetails();         
            System.out.println("-------------------");
        }
    }

    public void viewUsers() {
        for (User user : users) {
            System.out.println(user.getName() + " - Role: " + user.getSubscription());
        }
    }

    public void removeMedia(Media m) {
        media.remove(m);
    }

    public void removeUser(User user) {
        users.remove(user);
    }
    
    
    public static void main(String[] args) {
        
        Bookazon bookazon = new Bookazon();
        
        // create books
        bookazon.addMedia(new Paperback("The Great Gatsby", "F. Scott Fitzgerald", 1925, 9.99));
        bookazon.addMedia(new EBook("To Kill a Mockingbird", "Harper Lee", 1960, 7.99));
        bookazon.addMedia(new Audiobook("1984", "George Orwell", 1949, 8.99));
        bookazon.addMedia(new DvD("Inception", "Christopher Nolan", 2010, 14.99));

        // create users
        User alice = new User("Alice", new NormalSubscription());
        User bob = new User("Bob", new GoldSubscription());

        bookazon.addUser(alice);
        bookazon.addUser(bob);

        // add books to cart
        Cart aliceCart = new Cart();
        aliceCart.addItem(new CartItem(bookazon.media.get(0).getTitle(),
                                       bookazon.media.get(0).getPrice(), 1));
        aliceCart.addItem(new CartItem(bookazon.media.get(1).getTitle(),
                                       bookazon.media.get(1).getPrice(), 2));

        // view cart
        aliceCart.viewCartDetails();

        // create an order for Alice
        Order aliceOrder = new Order(aliceCart, alice);

        // set shipping address and billing address
        aliceOrder.setShippingAddress("123 Main St", "", "Springfield", "IL", "62701", "USA");
        aliceOrder.setBillingAddress("456 Elm St", "", "Springfield", "IL", "62702", "USA");
        aliceOrder.setOrderStatus("Processing");
        aliceOrder.setDateCreated("2025-09-27");

        // view order details
        aliceOrder.printOrderDetails();

        // print all books and users
        System.out.println("\nAvailable Media:");
        bookazon.viewMedia();

        System.out.println("\nUsers:");
        bookazon.viewUsers();
    }
}
