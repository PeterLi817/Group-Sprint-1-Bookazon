public class DVD extends CartItem {
    private String director;
    private int yearReleased;
    private String genre;

    public DVD(String title, String director, int yearReleased, double price, String genre, int quantity) {
        super(title, price, quantity);
        this.director = director;
        this.yearReleased = yearReleased;
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public int getYearReleased() {
        return yearReleased;
    }

    public String getGenre() {
        return genre;
    }

    public String getDetails() {
        return getName() + " (DVD) - Director: " + director + ", Year: " + yearReleased + ", Genre: " + genre + ", Quantity: " + getQuantity() + ", Total: $" + getTotalPrice();
    }
}
