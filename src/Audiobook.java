public class Audiobook extends Book {
    public Audiobook(String title, String author, int yearPublished, double price) {
        super(title, author, yearPublished, price, MediaFormat.DISC);
    }
}