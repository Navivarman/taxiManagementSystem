public class Booking {
    private  int bookingId;
    private char dropTime;
    private  int amount;
    private Customer customer;

    Booking(int bookingId,char dropTime,int amount,Customer customer){
        this.bookingId= bookingId;
        this.customer = customer;
        this.dropTime = dropTime;
        this.amount = amount;
    }
}
