package SecondHw.ConcertHall.Test;

import SecondHw.ConcertHall.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class ConcertTest {
    public static void main(String[] args) throws Exception {
        Concert concert = new Concert();
        concert.welcomeLog();
        LogManager slg = LogManager.getLogManager();
        Logger log = slg.getLogger(Logger.GLOBAL_LOGGER_NAME);
        log.log(Level.INFO, "Now it is time to insert details!");
        System.out.println("\n \n \n");
        List<Person> band1Person = new ArrayList<>();
        Name name1 = new Name("Arzu", "Kilic");
        Person person1 = new Person(name1, "903847574894", 21);
        Name name2 = new Name("Beyza", "Sonmez");
        Person person2 = new Person(name2, "9038574894", 20);
        Name bandName = new Name("Turkai", "Murda");
        band1Person.add(person1);
        band1Person.add(person2);
        Band band1 = new Band(bandName,band1Person , "Turkey");
        Company company1 = new Company("FF", "Japonska LTD");
        Concert concert1 = new Concert("FF 12",LocalDate.of(2002, 8, 1), "FF", band1, company1);
        System.out.println("CONCERT 1 INFORMATION \n");
        System.out.println(concert1);
        System.out.println("\n");

        System.out.println("CONCERT 2 INFORMATION \n");
        Concert concert2 = new Concert("FF 23", LocalDate.of(2003, 7, 1), "Kb", band1, company1);
        System.out.println(concert2);
        System.out.println("\n");
        try{
        System.out.println(concert2.getConcertNumber());
        System.out.println(concert2.getConcertDate());
        System.out.println(concert2.getConcertHallId());
            System.out.println("New concert is created, have fun :)");
        }
        catch(Throwable e){
            System.out.println("The concert couldn't be created");
        }

        if (concert1.equals(concert2)) {
            System.out.println("Same concert");
        } else {
            System.out.println("Not the same concert");
        }

        if (concert1.hashCode()==concert2.hashCode()) {
            System.out.println("Same concert");
        } else {
            System.out.println("Not the same concert");
        }
        concert1.concertStart();
        concert2.concertStop();
    }
}
