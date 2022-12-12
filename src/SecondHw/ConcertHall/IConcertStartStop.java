package SecondHw.ConcertHall;

import SecondHw.ConcertHall.Exception.TheConcertIsPostponedException;

public interface IConcertStartStop {
     void concertStart() throws Exception;
     void concertStop() throws TheConcertIsPostponedException;
}
