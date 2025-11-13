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

    public int getBookingId(){ return  bookingId;}
    private char getDropTime(){ return dropTime;}
    private int getAmount(){ return amount;}
    private Customer getCustomer(){ return customer;}
}
