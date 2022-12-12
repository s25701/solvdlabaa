package SecondHw.ConcertHall.Test;

import SecondHw.ConcertHall.Exception.TicketIsTakenException;
import SecondHw.ConcertHall.Ticket;
import SecondHw.ConcertHall.TicketClass;

public class TicketTest {
    public static void main(String[] args) throws TicketIsTakenException {
        Ticket ticket2 = new Ticket("C09", false, TicketClass.FIRST);
        while (ticket2.isStatus() == false) {
            try {
                System.out.println("\n"+ ticket2);
                break;
            } catch (Throwable e) {
                throw new TicketIsTakenException("The ticket is taken", e);
            }
        }
        System.out.println("\n"+ ticket2);
        //test getters
        System.out.println(ticket2.getTicketId());
        System.out.println(ticket2.isStatus());
        ticket2.ticketPrice();

    }
}
