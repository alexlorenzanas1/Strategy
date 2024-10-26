package Service;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import static org.junit.Assert.*;

public class MallardDuckTest {
    private MallardDuck m;
    private ByteArrayOutputStream out;

    @Before
    public void before() throws Exception {
        m = new MallardDuck();
        out = new ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));
    }

    @Test
    public void TestFlyBehavior() {
        m.performFly();
        assertTrue(out.toString().toLowerCase().contains("vuelo con alas"));
    }

    @Test
    public void TestSoundBehavior() {
        m.performSound();
        assertTrue(out.toString().toLowerCase().contains("yo hago quack"));
    }

    @Test
    public void TestDisplay(){
        m.display();
        assertTrue(out.toString().toLowerCase().contains("hola soy un pato silvestre"));
    }

    @Test
    public void TestToStringMallardDuck() {
        String esperado = "mallardduck{}";
        String obtenido = m.toString().toLowerCase();
        assertEquals(esperado, obtenido);
    }
}
