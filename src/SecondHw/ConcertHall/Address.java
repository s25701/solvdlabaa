package SecondHw.ConcertHall;

public class Address {
    final String street;
    final String city;
    final String country;

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
