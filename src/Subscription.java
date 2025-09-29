abstract class Subscription {
    private double discount;
    private String name;

    Subscription(double discount, String name) {
        this.discount = discount;
        this.name = name;
    }

    public double getDiscount() {
        return discount;
    }

    public String getName() {
        return name;
    }
}
