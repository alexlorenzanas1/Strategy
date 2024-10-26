package Service;

import org.junit.Test;

import static org.junit.Assert.*;

public class FlyLikeRocketTest {

    private static final FlyLikeRocket flylikerocket = new FlyLikeRocket();

    @Test
    public void fly() {
        flylikerocket.fly();
    }
}