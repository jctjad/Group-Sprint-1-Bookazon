public class OrderDate{
    private String dateCreated;
    private String dateShipped;

    public void setDateCreated(String date){
        this.dateCreated = date;
    }

    public void setDateShipped(String date){
        this.dateCreated = date;
    }

    public void printDate(){
        System.out.println("Date Created: " + this.dateCreated);
        System.out.println("Date Shipped: " + this.dateShipped);
    }
}