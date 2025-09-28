import java.util.ArrayList;

public class Order {
    private String dateCreated;
    private String dateShipped;
    private String userName;
    private String orderStatus;
    private Address shippingAddress;
    private Address billingAddress;
    private ArrayList<CartItem> items;
    private double orderPrice;
    private Subscription subscription;

    public Order(Cart cart, Subscription subscription, Address shippingAddress, Address billingAddress) {
        this.items = cart.getItems();
        this.orderPrice = calculatePrice(subscription);
        this.shippingAddress = shippingAddress;
        this.billingAddress = billingAddress;
        this.subscription = subscription;
    }

    public void setShippingAddress(Address address) {
        this.shippingAddress = address;
    }

    public void setBillingAddress(Address address) {
        this.billingAddress= address;
    }

    public void setOrderStatus(String status) {
        this.orderStatus = status;
    }

    public void setDateCreated(String date) {
        this.dateCreated = date;
    }

    public void setDateShipped(String date) {
        this.dateShipped = date;
    }

    public void setUserName(String name) {
        this.userName = name;
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
        this.orderPrice = calculatePrice(subscription);
    }
    
    public Subscription getSubscription() {
        return this.subscription;
    }

    public void printOrderDetails() {
        System.out.println("Order Details:");
        System.out.println("Date Created: " + dateCreated);
        System.out.println("Date Shipped: " + dateShipped);
        System.out.println("User Name: " + userName);
        System.out.println("Order Status: " + orderStatus);
        System.out.println("Shipping Address: " + shippingAddress.toString());
        System.out.println("Billing Address: " + billingAddress.toString());
        System.out.println("Subscription Name: " + subscription.getName());
        System.out.println("Subscription Discount: " + (subscription.getDiscount() * 100) + "%");
        System.out.println("Order Price: $" + orderPrice);
    }

    public double calculatePrice(Subscription subscription) {
        double totalPrice = 0.0;

        for (CartItem item : items) {
            totalPrice += item.getTotalPrice();
        }

        totalPrice *= 1 - subscription.getDiscount();

        return totalPrice;
    }
}
