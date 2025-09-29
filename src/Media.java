public abstract class Media {
    protected String title;
    protected String author;
    protected int yearPublished;
    protected double price;
    protected MediaFormat format;

    public Media(String title, String author, int yearPublished, double price, MediaFormat format) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
        this.format = format;
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

    public MediaFormat getFormat() { 
        return format; 
    }
    
    protected void setFormat(MediaFormat format) { 
        this.format = format; 
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

    public void printDetails() {
        System.out.println(format + ": " + title + " by " + author +
                           " (" + yearPublished + "), $" + price);
    }
}