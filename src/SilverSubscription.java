public class SilverSubscription extends Subscription{
    public static final double discountRate = 0.05;
    public static final String subscriptionName = "Silver";

    public SilverSubscription() {
        super(discountRate,subscriptionName);
    }
}
