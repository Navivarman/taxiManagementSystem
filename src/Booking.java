public class Booking {
    private  int id;
    private Customer customer;
    private char dropPoint;
    private  int charges;

    Booking(int id,Customer customer , char dropPoint,int charges){
        this.id = id;
        this.customer = customer;
        this.dropPoint = dropPoint;
        this.charges = charges;
    }
}
