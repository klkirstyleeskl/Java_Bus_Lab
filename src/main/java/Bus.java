import java.util.ArrayList;

public class Bus {
    String destination;
    int capacity;
    ArrayList<Passenger> passengers;


    public Bus(String desintation){
        this.destination = desintation;
        this.capacity = 50;
        this.passengers = new ArrayList<>();
    }

    public String getDestination(){
        return this.destination;
    }

    public int getRemainingCapacity(){
        return this.capacity;
    }

    public int getPassengerList(){
        return this.passengers.size();
    }








}
