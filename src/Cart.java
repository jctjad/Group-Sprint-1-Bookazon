import java.util.ArrayList;

public class Cart {
    private ArrayList<CartItem> items;
    
    public Cart() {
        items = new ArrayList<>();
    }
    
    public void addItem(CartItem item) {
        items.add(item);
    }

    public void removeItem(CartItem item) {
        items.remove(item);
    }
    
    //Issue-3: Removing search for item with index method
    public void updateQuantity(CartItem item, int quantity) {
        int index = items.indexOf(item);
        items.get(index).setQuantity(quantity);
    }
    
    //Issue-3: Created helper function
    public void viewCartDetails() {
        System.out.println("Cart Details:");
        for (CartItem item: items){
            itemDetails(item);
        }
        System.out.println("\n");
    }
    
    public void itemDetails(CartItem item){
        System.out.println(item.getName() + " - Quantity: " + item.getQuantity());
    } 


    public ArrayList<CartItem> getItems() {
        return items;
    }
}
