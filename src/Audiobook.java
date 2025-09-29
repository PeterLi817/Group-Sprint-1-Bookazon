public class Audiobook extends CartItem {
    private String author;
    private int yearPublished;
    private double durationHours;

    public Audiobook(String title, String author, int yearPublished, double price, double durationHours, int quantity) {
        super(title, price, quantity);
        this.author = author;
        this.yearPublished = yearPublished;
        this.durationHours = durationHours;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public double getDurationHours() {
        return durationHours;
    }

    public String getDetails() {
        return getName() + " (Audiobook) - Author: " + author + ", Year: " + yearPublished + ", Duration: " + durationHours + "h, Quantity: " + getQuantity() + ", Total: $" + getTotalPrice();
    }
}
