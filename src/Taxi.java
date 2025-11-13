
import java.util.ArrayList;
import java.util.List;

public class Taxi {

    private int taxiId;
    private char currentSpot;
    private int freeTime;
    private int earnings;
    private List<Booking> bookings;

    Taxi(int id){
        this.taxiId = id;
        this.currentSpot = 'A';
        this.freeTime = 0;
        this.earnings = 0;
        bookings = new ArrayList<>();
    }

    public  int getTaxiId(){ return taxiId;}
    private char getCurrentSpot(){ return  currentSpot;}
    private int getFreeTime(){ return freeTime;}
    private int getEarnings(){ return earnings;}
    private List<Booking> getBookings(){ return bookings;}
}
