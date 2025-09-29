public class Ebook extends CartItem {
    private String author;
    private int yearPublished;
    private String format;

    public Ebook(String title, String author, int yearPublished, double price, String format, int quantity) {
        super(title, price, quantity);
        this.author = author;
        this.yearPublished = yearPublished;
        this.format = format;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public String getFormat() {
        return format;
    }

    public String getDetails() {
        return getName() + " (Ebook) - Author: " + author + ", Year: " + yearPublished + ", Format: " + format + ", Quantity: " + getQuantity() + ", Total: $" + getTotalPrice();
    }
}
