public class Customer {
    private int customerId;
    private  char pickPoint;
    private  char dropPoint;
    private  int pickTime;

    Customer(int customerId,char pickPoint,char dropPoint,int pickTime){
        this.customerId = customerId;
        this.pickPoint = pickPoint;
        this.dropPoint = dropPoint;
        this.pickTime = pickTime;
    }

    public int getCustomerId(){ return customerId;}
    public char getPickPoint(){ return pickPoint;}
    public char getDropPoint(){ return dropPoint;}
    public int getPickTime(){ return  pickTime;}
}
