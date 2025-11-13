public class Booking {
    private  int bookingId;
    private int dropTime;
    private  int amount;
    private Customer customer;

    Booking(int bookingId,int dropTime,int amount,Customer customer){
        this.bookingId= bookingId;
        this.customer = customer;
        this.dropTime = dropTime;
        this.amount = amount;
    }

    public int getBookingId(){ return  bookingId;}
    private int getDropTime(){ return dropTime;}
    private int getAmount(){ return amount;}
    private Customer getCustomer(){ return customer;}
}
