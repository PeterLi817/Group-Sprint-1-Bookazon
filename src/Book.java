public class Book extends CartItem {
    private String author;
    private int yearPublished;
    private boolean isPaperback;

    public Book(String title, String author, int yearPublished, double price, boolean isPaperback, int quantity) {
        super(title, price, quantity);
        this.author = author;
        this.yearPublished = yearPublished;
        this.isPaperback = isPaperback;
    }

    public String getTitle() {
        return getName();
    }

    public void setTitle(String title) {
        setName(title);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public double getPrice() {
        return super.getTotalPrice() / getQuantity();
    }

    public void setPrice(double price) {
        super.setPrice(price);
    }

    public boolean isPaperback() {
        return isPaperback;
    }

    public void setPaperback(boolean isPaperback) {
        this.isPaperback = isPaperback;
    }

    public String getDetails() {
        return getName() + " (Book) - Author: " + author + ", Year: " + yearPublished + ", Is paperback: " + isPaperback + ", Quantity: " + getQuantity() + ", Total: $" + getTotalPrice();
    }

    public boolean isPriceValid() {
        return getPrice() > 0;
    }

    public boolean isTitleValid() {
        return getName() != null && !getName().isEmpty();
    }

    public boolean isAuthorValid() {
        return author != null && !author.isEmpty();
    }

    public boolean isYearPublishedValid() {
        return yearPublished > 0;
    }
}