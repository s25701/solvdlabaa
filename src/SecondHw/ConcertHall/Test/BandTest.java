package SecondHw.ConcertHall.Test;

import SecondHw.ConcertHall.Person;
import SecondHw.ConcertHall.Band;
import SecondHw.ConcertHall.Name;
import java.util.ArrayList;
import java.util.List;

public class BandTest {
    public static void main(String[] args) throws Exception {
        List<Person> band1Person = new ArrayList<Person>();
        Name name1 = new Name("Arzu", "Kilic");
        Person person1 = new Person(name1, "903847574894", 21);
        Name name2 = new Name("Beyza", "Sonmez");
        Person person2 = new Person(name2, "9038574894", 20);
        Name bandName = new Name("Turkai", "Murda");
        band1Person.add(person1);
        band1Person.add(person2);

        Band band1 = new Band(bandName, band1Person, "Turkey");
        System.out.println("Band 1:" + " " + band1);
        band1.printAllPerson(band1Person);
    }
}
