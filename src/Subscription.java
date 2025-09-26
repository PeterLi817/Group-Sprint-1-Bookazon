abstract class Subscription {
    private double discout;
    private String name;

    Subscription(double discout, String name) {
        this.discout = discout;
    }

    public double getDiscout() {
        return discout;
    }

    public String getName() {
        return name;
    }
}
