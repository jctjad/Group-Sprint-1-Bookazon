public abstract class Media {
    protected String title;
    protected String author;
    protected int yearPublished;
    protected double price;

    public Media(String title, String author, int yearPublished, double price) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isPriceValid() {
        return price > 0;
    }

    public boolean isTitleValid() {
        return title != null && !title.isEmpty();
    }

    public boolean isAuthorValid() {
        return author != null && !author.isEmpty();
    }

    public boolean isYearPublishedValid() {
        return yearPublished > 0;
    }
}