import java.util.ArrayList;
import java.util.List;

public class Taxi {
    private  int id;
    private char cSpot;
    private int freeTime;
    private int earnings;
    private List<Booking> booking;

    Taxi(int id,char cSpot,int freeTime,int earnings,Booking booking){
        this.id = id;
        this.cSpot = cSpot;
        this.freeTime = freeTime;
        this.earnings = earnings,
        this.booking = new ArrayList<>();
    }
}
