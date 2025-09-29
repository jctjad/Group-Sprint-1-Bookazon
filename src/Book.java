public abstract class Book extends Media {
    public Book(String title, String author, int yearPublished, double price) {
        setTitle(title);
        setAuthor(author);
        setYearPublished(yearPublished);
        setPrice(price);
    }


    public void printBookDetails() {
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Year Published: " + getYearPublished());
        System.out.println("Price: $" + getPrice());
    }

    public abstract void printFormat();

}