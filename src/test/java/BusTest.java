import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {
    Bus bus;
    Passenger passenger;

    @Before
    public void before() {
        bus = new Bus("PartyTown");
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
    public void canAddAPassenger(){
        bus.addPassenger(passenger);
        assertEquals(1, bus.getPassengerCount());
    }
}
