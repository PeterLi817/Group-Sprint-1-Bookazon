public class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Cart no longer uses setQuantity directly
    public void updateQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Cart doesn’t need to know how to print details
    public String getDetails() {
        return itemName + " - Quantity: " + quantity + " - Total: $" + getTotalPrice();
    }

    public int getQuantity() {
        return quantity;
    }
    public boolean equals(CartItem item) {
        return this.itemName.equals(item.itemName);
    }

    public double getTotalPrice() {
        return price * quantity;
    }

    public String getName() {
        return itemName;
    }
}
