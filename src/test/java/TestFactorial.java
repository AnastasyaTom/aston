import org.example.Factorial;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFactorial {

    @Test
    public void testPositiveCases() {
        Assert.assertEquals(Factorial.getFactorial(0), 1);
    }
    @Test
    public void test1PositiveCases() {
        Assert.assertEquals(Factorial.getFactorial(1), 1);
    }
    @Test
    public void test2PositiveCases() {
        Assert.assertEquals(Factorial.getFactorial(5), 120);
    }
    @Test
    public void testNegativeNumber() {
        Factorial.getFactorial(-1);
    }
    @Test
    public void test1NegativeNumber() {
        Assert.assertNotEquals (Factorial.getFactorial(6), 126);
    }
    @Test
    public void test2NegativeNumber() {
        Factorial.getFactorial(50000);
    }

}
