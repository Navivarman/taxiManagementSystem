import java.util.ArrayList;
import java.util.List;

public class BookingSystem {
    List<Taxi> taxis;
    int bookingId = 1;

    BookingSystem(int taxiCount){
        taxis = new ArrayList<>();
        for(int i = 0; i < taxiCount; i++){
            taxis.add(new Taxi(i));
        }
    }
    private int calculateCharges(char pickUpPoint,char dropPoint){
        int distance = Math.abs(pickUpPoint - dropPoint) * 15;
        int charges = 100;
        distance -= 5;
        charges += distance*10;
        return charges;
    }

    Taxi findTaxi(char pickUpPoint,int pickUpTime) {
        List<Taxi> freeTaxis = new ArrayList<>();
        for (Taxi t : taxis) {
            if (t.isFree(pickUpPoint, pickUpTime)) freeTaxis.add(t);
        }

        if (freeTaxis.isEmpty()) return null;

        int minDistance = Integer.MAX_VALUE;
        for (Taxi t : freeTaxis) {
            int distance = Math.abs(pickUpPoint - t.getCurrentSpot());
            if (distance < minDistance) minDistance = distance;
        }

        List<Taxi> closetTaxi = new ArrayList<>();
        for (Taxi t : freeTaxis) {
            int distance = Math.abs(pickUpPoint - t.getCurrentSpot());
            if (distance == minDistance) closetTaxi.add(t);
        }

        Taxi selected = closetTaxi.get(0);
        for (Taxi t : closetTaxi) {
            if (t.getEarnings() < selected.getEarnings()) {
                selected = t;
            }
        }
        return selected;
    }

    void bookTaxi(Customer c){
        Taxi selected = findTaxi(c.getPickPoint(),c.getPickTime());

        int travelTime = Math.abs(c.getPickPoint() - c.getDropPoint());
        int dropTime = c.getPickTime() + travelTime;
        int charges = calculateCharges(c.getPickPoint(),c.getDropPoint());

        Booking booking = new Booking(bookingId,dropTime,charges,c);
        bookingId++;
    }
}
