import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {
    Bus bus;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;
    BusStop busStop;

    @Before
    public void before() {
        bus = new Bus("PartyTown");
        busStop = new BusStop("PartyTown");
        busStop.addToQueue(passenger1);
        busStop.addToQueue(passenger2);
        busStop.addToQueue(passenger3);
        busStop.addToQueue(passenger4);
    }

    @Test
    public void hasDestination(){
        assertEquals("PartyTown", bus.getDestination());

    }

    @Test
    public void startsEmpty(){
        assertEquals(3, bus.getRemainingCapacity());
    }

    @Test
    public void hasAListOfPassengers(){
        assertEquals(0, bus.getPassengerCount());
    }

    @Test
    public void canAddAPassengerFromStop(){
        bus.pickUpFromStop(busStop);
        assertEquals(1, bus.getPassengerCount());
    }


    @Test
    public void busCantGoOverCapacity(){
        bus.pickUpFromStop(busStop);
        bus.pickUpFromStop(busStop);
        bus.pickUpFromStop(busStop);
        bus.pickUpFromStop(busStop);
        assertEquals(3, bus.getPassengerCount());
    }

    @Test
    public void removePassenger(){
        bus.pickUpFromStop(busStop);
        bus.pickUpFromStop(busStop);
        bus.pickUpFromStop(busStop);
        bus.removePassenger();
        assertEquals(2, bus.getPassengerCount());

    }


}
