
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
    public char getCurrentSpot(){ return  currentSpot;}
    public int getFreeTime(){ return freeTime;}
    public  int getEarnings(){ return earnings;}
    public  List<Booking> getBookings(){ return bookings;}
    public  boolean isFree(char pickUpPoint,int pickUpTime){
        int traveledTime = Math.abs(currentSpot - pickUpPoint);
        if((traveledTime + freeTime) <= pickUpTime){
            return true;
        }
        return false;

    }

    public  void assignBooking(Booking b){
        bookings.add(b);
    }
}
