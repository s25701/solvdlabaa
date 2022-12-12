package SecondHw.ConcertHall;


import java.util.List;

public class Band {
    public Name name;
    public List<Person> person;
    final String bandOrigin;

    public Band(Name name, List<Person> person, String bandOrigin) throws Exception {
        this.name=name;
        setPerson(person);
        this.bandOrigin = bandOrigin;
    }

    public List<Person> getPerson() {
        return person;
    }

    public void setPerson(List<Person> person) throws Exception {
        this.person = person;
    }

    public <Person> void printAllPerson(List<Person> person) {
        for (Object persons : person)
            System.out.println(persons + " ");
    }

    @Override
    public String toString() {
        return name + " " + ","+ person + " " + "," + bandOrigin;
    }
}
