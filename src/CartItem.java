public abstract class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public void updateQuantity(int quantity) {
        this.quantity = quantity;
    }

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

    public void setName(String name) {
        this.itemName = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
