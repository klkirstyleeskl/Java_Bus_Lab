import java.util.ArrayList;

public class Bus {
    String destination;
    int capacity;
    ArrayList<Passenger> passengers;


    public Bus(String desintation){
        this.destination = desintation;
        this.capacity = 3;
        this.passengers = new ArrayList<>();
    }

    public String getDestination(){
        return this.destination;
    }

    public int getRemainingCapacity(){
        return this.capacity;
    }

    public int getPassengerCount(){
        return this.passengers.size();
    }

    public void addPassenger(Passenger passenger){
        if (this.capacity > 0){
            this.passengers.add(passenger);
            this.capacity -= 1;
        }
    }

    public void removePassenger(){
        this.passengers.remove(0);
    }









}
