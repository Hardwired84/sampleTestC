import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static java.lang.Double.NaN;
import static junit.framework.TestCase.assertEquals;

public class CalculatorTests {

    Calculator calc = new Calculator();

    @Before
    public void consolePrint() {
        System.out.println("Tests started!!! ");
    }

    @Test
    public void testAddTwoPositiveValues() {
        assertEquals("10 + 5 must be 15", 15, calc.add(10, 5));
    }

    @Test
    public void testAddTwoNegativeValues() {
        assertEquals("-10 + (-5) must be -15", -15, calc.add(-10, -5));
    }

    @Test
    public void testTwoMultiplyPositiveValues() {
        assertEquals("15 * 10 must be 150", 150.0, calc.multiply(15.0, 10.0));
    }

    @Test
    public void testTwoMultiplyNegativeValues() {
        assertEquals("-15 * (-10) must be 150", 150.0, calc.multiply(-15.0, -10.0));
    }

    @Test
    public void testTwoDivisionPositiveValues() {
        assertEquals("20 / 10 must be 2", 2.0, calc.division(20, 10));
    }

    @Test
    public void testTwoDivisionNegativeValues() {
        assertEquals(" -20 / (-10) must be 2", 2.0, calc.division(-20, -10));
    }

    @Test
    public void testTwoSubtractionPositiveValues() {
        assertEquals("30 - 20 must be 10", 10, calc.subtraction(30, 20));
    }

    @Test
    public void testTwoSubtractionNegativeValues() {
        assertEquals("-30 - (-20) must be -10", -10, calc.subtraction(-30, -20));
    }

    @Test
    public void testSquareRootPositiveValues() {
        assertEquals("sqrt 40 must be 6.3245553203367587", 6.3245553203367587, calc.squareRoot(40.0));
    }

    @Test
    public void testSquareRootNegativeValues() {
        assertEquals("sqrt -40 must be 6.3245553203367587i", NaN, calc.squareRoot(-40.0));
    }

    @Test
    public void testExpositionPositiveValues() {
        assertEquals(" sqr second 50 must be 2500", 2500.0, calc.xSecondExposition(50.0));
    }

    @After
    public void consolePrintAfter() {
        System.out.println("Tests finished!!!");
    }
}