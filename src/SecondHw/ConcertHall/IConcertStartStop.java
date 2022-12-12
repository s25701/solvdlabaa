package SecondHw.ConcertHall;

import SecondHw.ConcertHall.Exception.TheConcertIsPostponedException;

public interface IConcertStartStop {
    public void concertStart() throws Exception;
    public void concertStop() throws TheConcertIsPostponedException;
}
