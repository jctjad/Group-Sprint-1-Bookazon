public class EBook extends Book {
    public EBook(String title, String author, int yearPublished, double price) {
        super(title, author, yearPublished, price, MediaFormat.EBOOK);
    }
}