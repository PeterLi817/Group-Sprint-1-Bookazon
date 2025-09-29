import java.util.ArrayList;

public class Bookazon {

    private ArrayList<CartItem> itemsCatologue;
    private ArrayList<User> users;

    public Bookazon() {
        itemsCatologue = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addItem(CartItem item) {
        itemsCatologue.add(item);
    }

    public void viewItems() {
        for (CartItem item : itemsCatologue) {
            System.out.println(item.getDetails());
        }
    }

    public void removeItem(CartItem item) {
        itemsCatologue.remove(item);
    }

    public void updateItemDetails(CartItem item, String newTitle, double newPrice) {
        item.setName(newTitle);
        item.setPrice(newPrice);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void viewUsers() {
        for (User user : users) {
            System.out.println(user.getName() + " - Role: " + user.getSubscription().getName());
        }
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public void updateRole(User user, Subscription role) {
        user.setSubscription(role);
    }

    public static void main(String[] args) {
        Bookazon bookazon = new Bookazon();

        // create items
        bookazon.addItem(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, 9.99, true, 10));
        bookazon.addItem(new Audiobook("Atomic Habits", "James Clear", 2018, 14.99, 7.5, 5));
        bookazon.addItem(new DVD("Inception", "Christopher Nolan", 2010, 12.99, "Sci-Fi", 3));
        bookazon.addItem(new Ebook("Clean Code", "Robert C. Martin", 2008, 19.99, "PDF", 8));

        // create users
        bookazon.addUser(new User("Alice", new NormalSubscription()));
        bookazon.addUser(new User("Bob", new GoldSubscription()));

        // add items to cart
        bookazon.users.get(0).addToCart(bookazon.itemsCatologue.get(0), 1);
        bookazon.users.get(0).addToCart(bookazon.itemsCatologue.get(1), 2);

        // view cart
        bookazon.users.get(0).viewCart();

        // set shipping address and billing address
        Address shipping = new Address(123, "Main St", "Springfield", "IL", 62701, "USA");
        Address billing  = new Address(456, "Elm St", "Springfield", "IL", 62702, "USA");

        bookazon.users.get(0).setShippingAddress(shipping);
        bookazon.users.get(0).setBillingAddress(billing);

        // checkout
        bookazon.users.get(0).checkout();

        // view order details
        bookazon.users.get(0).viewOrders();
    }
}
