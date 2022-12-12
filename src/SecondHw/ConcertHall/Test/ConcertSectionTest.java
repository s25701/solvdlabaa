package SecondHw.ConcertHall.Test;

import SecondHw.ConcertHall.TicketClass;
import SecondHw.ConcertHall.ConcertSection;

public class ConcertSectionTest{

    public static void main(String[] args) {

        ConcertSection concertSection1 = new ConcertSection(TicketClass.ECONOMY);
        System.out.println(concertSection1 );

        ConcertSection concertSection2 = new ConcertSection(TicketClass.BUSINESS);
        System.out.println(concertSection2 );

        System.out.println(concertSection2.getTicketClass());
    }
}
