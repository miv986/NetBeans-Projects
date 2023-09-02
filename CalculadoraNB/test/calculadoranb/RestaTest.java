package calculadoranb;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Djmir
 */
public class RestaTest {

    public RestaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testGetResta() {
        System.out.println("getResta");
        double a = 8.0;
        double b = 2.0;
        Resta instance = new Resta();
        double expResult = 6.0;
        double result = instance.getResta(a, b);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testDecrementa() {
        System.out.println("decrementa");
        double a = 10.0;
        Resta instance = new Resta();
        double expResult = 9.0;
        double result = instance.decrementa(a);
        assertEquals(expResult, result, 0);
    }
}
