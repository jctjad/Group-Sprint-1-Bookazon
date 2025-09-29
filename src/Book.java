public abstract class Book extends Media {
    protected Book(String title, String author, int yearPublished, double price, MediaFormat format) {
        super(title, author, yearPublished, price, format);
    }
}