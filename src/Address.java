public class Address {
    private String addressLine1;
    private String addressLine2;
    private String addressCity;
    private String addressState;
    private String addressZip;
    private String addressCountry;

    public void setAddress(String line1, String line2, String city, String state, String zip, String country){
        this.addressLine1 = line1;
        this.addressLine2 = line2;
        this.addressCity = city;
        this.addressState = state;
        this.addressZip = zip;
        this.addressCountry = country;
    }
    
}
