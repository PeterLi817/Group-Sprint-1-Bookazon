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
    
    public void updateQuantity(CartItem item, int quantity) {
        for (CartItem cartItem : items) {
            if (cartItem.equals(item)) {
                cartItem.updateQuantity(quantity);  // FIXED
                break;
            }
        }
    }
    
    
    public class CartViewer {
        public static void printCart(Cart cart) {
            System.out.println("Cart Details:");
            for (CartItem item : cart.getItems()) {
                System.out.println(item.getDetails());  // CHANGED → use CartItem’s method
            }
            System.out.println();
        }
    }
    
    
    public ArrayList<CartItem> getItems() {
        return items;
    }
}
