package Service;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;

import static org.junit.Assert.*;

public class RubberDuckTest {

    private RubberDuck r;

    private ByteArrayOutputStream out;

    @Before
    public void before() throws Exception {
        r = new RubberDuck();
        out = new ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));
    }

    @Test
    public void TestFlyBehavior() {
        r.performFly();
        assertTrue(out.toString().toLowerCase().contains("vuelo con alas"));
    }

    @Test
    public void TestSoundBehavior() {
        r.performSound();
        assertTrue(out.toString().toLowerCase().contains("yo hago squeak"));
    }

    @Test
    public void testDisplay() {
        r = new RubberDuck();
        r.display();
        // Si el método se ejecuta sin lanzar excepciones, la prueba pasará
    }

    @Test
    public void testInstanceType() {
        r = new RubberDuck();
        assertTrue(r instanceof RubberDuck); // Verifica que la instancia sea del tipo correcto
    }
}
