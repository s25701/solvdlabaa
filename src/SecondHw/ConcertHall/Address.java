package SecondHw.ConcertHall;

public class Address {
    private String street;
    private String city;
    private String country;

    public Address(String street, String city, String country) {
        this.street = street;
        this.city = city;
        this.country=country;
    }

    @Override
    public String toString() {
        return street + " " + city + " " + country;
    }
}
