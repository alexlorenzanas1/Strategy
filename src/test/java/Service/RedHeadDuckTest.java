package Service;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import static org.junit.Assert.*;

public class RedHeadDuckTest {
    private RedHeadDuck r;
    private ByteArrayOutputStream out;

    @Before
    public void before() throws Exception {
        r = new RedHeadDuck();
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
        assertTrue(out.toString().toLowerCase().contains("yo hago quack"));
    }


    @Test
    public void TestDisplay(){
        r.display();
        assertTrue(out.toString().toLowerCase().contains("hola soy un pato de cabeza roja "));
    }

    @Test
    public void TestToStringRedHeadDuck() {
        String esperado = "redheadduck{}";
        String obtenido = r.toString().toLowerCase();
        assertEquals(esperado, obtenido);
    }

}

