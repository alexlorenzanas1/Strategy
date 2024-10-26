package Service;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import static org.junit.Assert.*;

public class ModelDuckTest {
    private ModelDuck m;
    private ByteArrayOutputStream out;

    @Before
    public void before() throws Exception {
        m = new ModelDuck();
        out = new ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));
    }

    @Test
    public void TestFlyBehavior() {
        m.performFly();
        assertTrue(out.toString().toLowerCase().contains("vuelo como cohete"));
    }

    @Test
    public void TestSoundBehavior() {
        m.performSound();
        assertTrue(out.toString().toLowerCase().contains("......."));
    }

    @Test
    public void TestDisplay(){
        m.display();
        assertTrue(out.toString().toLowerCase().contains("hola soy un pato modelo"));
    }

    @Test
    public void TestToStringMallardDuck() {
        String esperado = "modelduck{}";
        String obtenido = m.toString().toLowerCase();
        assertEquals(esperado, obtenido);
    }
}
