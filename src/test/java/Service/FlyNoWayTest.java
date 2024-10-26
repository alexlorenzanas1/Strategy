package Service;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FlyNoWayTest {

    private static final FlyNoWay flynoway = new FlyNoWay();

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void fly() {
        flynoway.fly();
    }

}