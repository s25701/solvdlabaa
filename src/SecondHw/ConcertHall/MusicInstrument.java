package SecondHw.ConcertHall;

public class MusicInstrument{
    private Instrument instrument;
    private String type;

    public MusicInstrument(Instrument instrument, String type) {
        this.instrument=instrument;
        this.type=type;
    }
    public void setType(String type){
        this.type=type;
    }
    public String getType(){
        return type;
    }

    @Override
    public String toString(){
        return instrument+ " " + type;
    }
}
