public class DvD extends Media {
    
    public DvD(String title, String author, int yearPublished, double price) {
        super(title, author, yearPublished, price);
    }

    public void playBack() {
        System.out.println("Playing " + title);
    }
}