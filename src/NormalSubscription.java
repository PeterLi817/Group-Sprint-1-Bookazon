public class NormalSubscription extends Subscription{
    public static final double discountRate = 0.0;
    public static final String subscriptionName = "Normal";

    public NormalSubscription() {
        super(discountRate,subscriptionName);
    }
}