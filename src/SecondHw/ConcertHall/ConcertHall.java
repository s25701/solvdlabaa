package SecondHw.ConcertHall;

public class ConcertHall {
    private String concertHallId;
    private Address address;

    public ConcertHall(String concertHallId, Address address) {
        this.setConcertHallId(concertHallId);
        this.setAddress(address);
    }

    public void setConcertHallId(String concertHallId) {
        if (concertHallId.matches("[a-zA-Z]+$") && concertHallId.length() == 3) {
            this.concertHallId = concertHallId.toUpperCase();
        } else {
            System.out.println("Invalid SecondHw.ConcertHall ID");
        }
    }

    public void setAddress(Address address) {
        this.address = address;
    }


    public String getConcertHallId() {
        return concertHallId;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return this.getConcertHallId() + "," + this.getAddress();
    }
}
