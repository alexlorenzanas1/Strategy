package Service;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;

import static org.junit.Assert.*;

public class DecoyDuckTest {

    private DecoyDuck d;
    private ByteArrayOutputStream out;

    @Before
    public void before() throws Exception {
        d = new DecoyDuck();
        out = new ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));
    }

    @Test
    public void TestFlyBehavior() {
        d.performFly();
        assertTrue(out.toString().toLowerCase().contains("no puedo volar"));
    }

    @Test
    public void TestSoundBehavior() {
        d.performSound();
        assertTrue(out.toString().toLowerCase().contains("......."));
    }

    @Test
    public void testDisplay() {
        d = new DecoyDuck();
        d.display();
        // Si el método se ejecuta sin lanzar excepciones, la prueba pasará
    }

    @Test
    public void testInstanceType() {
        d = new DecoyDuck();
        assertTrue(d instanceof DecoyDuck); // Verifica que la instancia sea del tipo correcto
    }
}



