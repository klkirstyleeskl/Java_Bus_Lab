import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {
    Bus bus;

    @Before
    public void before() {
        bus = new Bus("PartyTown");
    }

    @Test
    public void hasDestination(){
        assertEquals("PartyTown", bus.getDestination());

    }
}
