import java.util.ArrayList;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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

    public void viewCart() {
        cart.printCart();
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

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void checkout() {
        Order order = new Order(cart, this, this.shippingAddress, this.billingAddress);
        order.setOrderStatus("Order Placed");
        String dateToday = LocalDate.now().format(DateTimeFormatter.ISO_DATE);
        order.setDateCreated(dateToday);
        orders.add(order);
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }
}
