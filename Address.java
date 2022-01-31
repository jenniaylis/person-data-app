public class Address {
    private String street;
    private int postcode;
    private String city;

    // builder
    public Address(String aStreet, int aPostcode, String aCity) {
        street=aStreet;
        postcode=aPostcode;
        city=aCity;
    }

    // setters and getters
    public void setStreet(String aStreet) {
        street=aStreet;
    }
    public String getStreet() {
        return street;
    }
    public void setPostcode(int aPostcode) {
        postcode=aPostcode;
    }
    public int getPostcode() {
        return postcode;
    }
    public void setCity(String aCity) {
        city = aCity;
    }
    public String getCity() {
        return city;
    }

    public void printAddress() {
        System.out.println("Address information:");
        System.out.println(street);
        System.out.println(postcode + " " + city);
    }
}