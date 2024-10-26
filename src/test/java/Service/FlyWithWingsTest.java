package Service;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class FlyWithWingsTest {

    private static final FlyWithWings flywithwings = new FlyWithWings();

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void fly() {
        flywithwings.fly();
    }
}
