
import java.util.ArrayList;

public class Bookazon {

    private ArrayList<Book> books;
    private ArrayList<User> users;

    public Bookazon() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void viewBooks() {
        for (Book book : books) {
            book.printDetails();
            System.out.println("-------------------");
        }
    }

    public void viewUsers() {
        for (User user : users) {
            System.out.println(user.getName() + " - Role: " + user.getSubscription());
        }
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void removeUser(User user) {
        users.remove(user);
    }
    
    
    public static void main(String[] args) {
        
        Bookazon bookazon = new Bookazon();
        
        // create books
        bookazon.addBook(new Paperback("The Great Gatsby", "F. Scott Fitzgerald", 1925, 9.99));
        bookazon.addBook(new EBook("To Kill a Mockingbird", "Harper Lee", 1960, 7.99));
        bookazon.addBook(new Audiobook("1984", "George Orwell", 1949, 8.99));
        // add the dvd here

        // create users
        User alice = new User("Alice", new NormalSubscription());
        User bob = new User("Bob", new GoldSubscription());

        bookazon.addUser(alice);
        bookazon.addUser(bob);

        // add books to cart
        Cart aliceCart = new Cart();
        aliceCart.addItem(new CartItem(bookazon.books.get(0).getTitle(),
                                       bookazon.books.get(0).getPrice(), 1));
        aliceCart.addItem(new CartItem(bookazon.books.get(1).getTitle(),
                                       bookazon.books.get(1).getPrice(), 2));

        // view cart
        aliceCart.viewCartDetails();

        // create an order for Alice
        Order aliceOrder = new Order(aliceCart, alice);

        // set shipping address and billing address
        aliceOrder.setShippingAddress("123 Main St", "", "Springfield", "IL", "62701", "USA");
        aliceOrder.setBillingAddress("456 Elm St", "", "Springfield", "IL", "62702", "USA");
        aliceOrder.setOrderStatus("Processing");
        aliceOrder.setDateCreated("2025-09-27");

        // checkout
        // bookazon.users.get(0).checkout();
        // currently we do not have a checkout method in Order

        // view order details
        aliceOrder.printOrderDetails();

        // 8. Print all books and users
        System.out.println("\nAvailable Books:");
        bookazon.viewBooks();

        System.out.println("\nUsers:");
        bookazon.viewUsers();
    }
}
