public class CartViewer {
    public static void printCart(Cart cart) {
        System.out.println("Cart Details:");
        for (CartItem item : cart.getItems()) {
            System.out.println(item.getDetails());
        }
        System.out.println();
    }
}
