import java.util.ArrayList;

public class User {
    private String name;
    private Subscription subscription;
    private Address shippingAddress;
    private Address billingAddress;
    private Cart cart;
    private ArrayList<Order> orders;

    public User(String name, Subscription subscription) {
        this.name = name;
        this.subscription = subscription;  // normal, gold, platinum, silver membership
        this.cart = new Cart();
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Subscription getSubscription() {
        return subscription;
    }

    public void setSubscription(Subscription role) {
        this.subscription = role;
    }

    // CHANGED: use CartViewer instead of cart.viewCartDetails()
    public void viewCart() {
        CartViewer.printCart(cart);
    }

    public void addToCart(CartItem item, int quantity) {
        item.updateQuantity(quantity);
        cart.addItem(item);
    }

    public void removeFromCart(CartItem item) {
        cart.removeItem(item);
    }

    public void viewOrders() {
        for (Order order : orders) {
            order.printOrderDetails();
        }
    }

    public void checkout() {
        Order order = new Order(cart, this, this.shippingAddress, this.billingAddress);
        order.setOrderStatus("Order Placed");
        order.setDateCreated("2024-01-01");
        orders.add(order);
    }
    
    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }
    
    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }
}
