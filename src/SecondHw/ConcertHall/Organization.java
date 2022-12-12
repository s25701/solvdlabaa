package SecondHw.ConcertHall;

public class Organization <T extends Concert>{
    private T concert;

    public Organization(T concert){
        this.concert = concert;
    }

    @Override
    public String toString(){
        return "\n\n\nScheduled Concerts:\n\n " + concert;
    }
}
