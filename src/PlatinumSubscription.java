public class PlatinumSubscription extends Subscription{
    public static final double discountRate = 0.10;
    public static final String subscriptionName = "Platinum";

    public PlatinumSubscription() {
        super(discountRate,subscriptionName);
    }
}
