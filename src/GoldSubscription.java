public class GoldSubscription extends Subscription{
    public static final double discountRate = 0.15;
    public static final String subscriptionName = "Gold";

    public GoldSubscription() {
        super(discountRate,subscriptionName);
    }
}
