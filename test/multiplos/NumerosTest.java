
package multiplos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ANDRESCOGI
 */
public class NumerosTest {

    public NumerosTest() {
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

    /**
     * Test validar multiplos de 3.
     */
    @Test
    public void testValidarMultiplo3() {
        System.out.println("validarMultiplos3");
        Integer numero = 36;
        Numeros instance = new Numeros();
        String expResult = "Fizz";
        String result = instance.validarNumeros(numero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (!result.equals(expResult)) {
            fail("The test case is a prototype.");
        }

    }

    /**
     * Test validar multiplos de 5.
     */
    @Test
    public void testValidarMultiplo5() {
        System.out.println("validarMultiplos5");
        Integer numero = 50;
        Numeros instance = new Numeros();
        String expResult = "Buzz";
        String result = instance.validarNumeros(numero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (!result.equals(expResult)) {
            fail("The test case is a prototype.");
        }

    }

    /**
     * Test validar multiplos de 3 y 5.
     */
    @Test
    public void testValidarMultiplo3y5() {
        System.out.println("validarMultiplos3y5");
        Integer numero = 15;
        Numeros instance = new Numeros();
        String expResult = "FizzBuzz";
        String result = instance.validarNumeros(numero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (!result.equals(expResult)) {
            fail("The test case is a prototype.");
        }

    }

}
