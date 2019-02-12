import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {
    BusStop busStop;
    Passenger passenger;

    @Before
    public void before(){
        busStop = new BusStop("PartyTown");
        passenger = new Passenger();
    }


    @Test
    public void hasName() {
        assertEquals("PartyTown", busStop.getName());
    }

    @Test
    public void hasQueue(){
        assertEquals(0, busStop.getQueueLength());
    }

    @Test
    public void canAddToQueue(){
        busStop.addToQueue(passenger);
        assertEquals(1, busStop.getQueueLength());
    }




}
