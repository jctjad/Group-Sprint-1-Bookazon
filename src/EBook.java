public class EBook extends Book {

    public EBook(String title, String author, int yearPublished, double price) {
        super(title, author, yearPublished, price);
    }

    @Override
    public void printFormat() {
        System.out.println("Format: E-Book");
    }
}