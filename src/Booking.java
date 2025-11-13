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
    public int getDropTime(){ return dropTime;}
    public int getAmount(){ return amount;}
    public Customer getCustomer(){ return customer;}
    public int getCustomerId(){
        return this.customer.getCustomerId();
    }

    public char getPickUpPoint(){
        return this.customer.getPickPoint();
    }

    public char getDropPoint(){
        return this.customer.getDropPoint();
    }

    public int getPickUpTime(){
        return this.customer.getPickTime();
    }



}
