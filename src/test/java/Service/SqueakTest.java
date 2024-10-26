package Service;

import org.junit.Test;
import static org.junit.Assert.*;

public class SqueakTest {

    private static final Squeak squeak = new Squeak();

    @Test
    public void MakeSound() {
        squeak.MakeSound();
    }
}
