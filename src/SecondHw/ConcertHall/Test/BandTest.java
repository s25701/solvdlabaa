package SecondHw.ConcertHall.Test;

import SecondHw.ConcertHall.*;
import java.util.ArrayList;
import java.util.List;

public class BandTest {
    public static void main(String[] args) {
        List<Person> band1Person = new ArrayList<>();
        List<MusicInstrument> musicInstruments1= new ArrayList<>();
        Name name1 = new Name("Arzu", "Kilic");
        Person person1 = new Person(name1, "903847574894", 21);
        Name name2 = new Name("Beyza", "Sonmez");
        Person person2 = new Person(name2, "9038574894", 20);
        Name bandName = new Name("Turkai", "Murda");
        Instrument instrument1=new Instrument("guitar");
        MusicInstrument musicInstrument1=new MusicInstrument(instrument1, "classical");
        Instrument instrument2=new Instrument("piano");
        MusicInstrument musicInstrument2=new MusicInstrument(instrument2, "classical");
        band1Person.add(person1);
        band1Person.add(person2);
        musicInstruments1.add(musicInstrument1);
        musicInstruments1.add(musicInstrument2);
        Band band1 = new Band(bandName, band1Person, "Turkey", musicInstruments1);
        System.out.println("Band 1:" + " " + band1);
        band1.printAllPerson(band1Person);
    }
}
