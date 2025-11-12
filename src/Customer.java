public class Customer {
    private int id;
    private  char pickPoint;
    private  char dropPoint;
    private  int time;

    Customer(int id,char pickPoint,char dropPoint,char time){
        this.id = id;
        this.pickPoint = pickPoint;
        this.dropPoint = dropPoint;
        this.time = time;
    }
}
