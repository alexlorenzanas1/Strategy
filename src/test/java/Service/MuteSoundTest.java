package Service;

import org.junit.Test;
import static org.junit.Assert.*;
public class MuteSoundTest {

    private static final MuteSound muteSound = new MuteSound();

    @Test
    public void makeSound() {
        muteSound.MakeSound();
    }
}
