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
public class SumaTest {

    public SumaTest() {
    }

    @Test
    public void testGetSuma() {
        System.out.println("getSuma");
        double a = 5.0;
        double b = 11.0;
        Suma instance = new Suma();
        double expResult = 16.0;
        double result = instance.getSuma(a, b);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testIncrementa() {
        System.out.println("incrementa");
        double a = 5.0;
        Suma instance = new Suma();
        double expResult = 6.0;
        double result = instance.incrementa(a);
        assertEquals(expResult, result, 0);
    }
}
