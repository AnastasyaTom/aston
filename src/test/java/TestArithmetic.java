import org.example.Arithmetic;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestArithmetic {

    @Test
    public void testSumma() {
        Arithmetic arithmetic = new Arithmetic (10, 4);
        int result = arithmetic.summa(10,4);
        Assert.assertEquals(result, 14);
    }

    @Test
    public void testDifference() {
        Arithmetic arithmetic = new Arithmetic(11, 5);
        int result = arithmetic.difference(11, 5);
        Assert.assertEquals(result, 6);
    }

    @Test
    public void testDivision() {
        Arithmetic arithmetic = new Arithmetic(10, 5);
        double result = arithmetic.division (10, 5);
        Assert.assertEquals(result, 2);
    }

    @Test
    public void testDivisionZero() {
        Arithmetic arithmetic = new Arithmetic(10, 0);
        arithmetic.division (10, 5);
    }

    @Test
    public void testSummaNegative() {
        Arithmetic arithmetic = new Arithmetic(5, 5);
        double result = arithmetic.summa (5, 5);
        Assert.assertNotEquals(result, 9);
    }

    @Test
    public void testMultiplicationZero() {
        Arithmetic arithmetic = new Arithmetic(0, 5);
        int result = arithmetic.multiplication (0, 5);
        Assert.assertEquals(result, 0);
    }
}
