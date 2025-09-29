public class PaperbackBook extends Book {

    public PaperbackBook(String title, String author, int yearPublished, double price) {
        super(title, author, yearPublished, price);
    }

    @Override
    public void printFormat() {
        System.out.println("Format: Paperback");
    }
}