import java.util.ArrayList;

public class BusStop {

    String name;
    ArrayList<Passenger> queue;

    public BusStop(String name){
        this.name = name;
        this.queue = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public int getQueueLength(){
        return this.queue.size();
    }

    public void addToQueue(Passenger passenger){
        this.queue.add(passenger);
    }

    public Passenger removeFromQueue(){
       return this.queue.remove(0);
    }






}
