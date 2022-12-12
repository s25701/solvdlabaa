package SecondHw.ConcertHall.Test;

import SecondHw.ConcertHall.Exception.CouldntCreateException;
import SecondHw.ConcertHall.Name;
import SecondHw.ConcertHall.Person;

public class PersonTest {
    public static void main(String[] args) throws CouldntCreateException {
        try{
            Name name1 = new Name("Arzu", "Kilic");
            Person person1 = new Person(name1, "903847574894", 21);
        } catch (Throwable e) {
            throw new CouldntCreateException("couldnt create person or name",e);
        }
        Name name1 = new Name("Arzu", "Kilic");
        Person person1 = new Person(name1, "903847574894", 21);
        System.out.println(person1.yearsOfExperience(9, 2));

        System.out.println(person1.yearsOfExperience("Amateur:Three", "Professional:Two"));

        person1.personInfo();
    }
}
