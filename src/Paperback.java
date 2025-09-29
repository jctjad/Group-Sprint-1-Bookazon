public class Paperback extends Book {
    public Paperback(String title, String author, int yearPublished, double price) {
        super(title, author, yearPublished, price, MediaFormat.PAPERBACK);
    }
}