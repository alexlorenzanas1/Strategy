package Service;

import org.junit.Test;
import static org.junit.Assert.*;

public class QuackTest {

    private static final Quack quack = new Quack();

    @Test
    public void MakeSound() {
        quack.MakeSound();
    }
}
