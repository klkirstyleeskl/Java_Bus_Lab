import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {
    BusStop busStop;

    @Before
    public void before(){
        busStop = new BusStop("PartyTown");
    }


    @Test
    public void hasName() {
        assertEquals("PartyTown", busStop.getName());
    }

    
}
