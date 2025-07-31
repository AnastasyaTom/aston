import org.example.Comparison;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class TestComparison {

    @Test
    public void testCLessD () {
        Comparison comparison = new Comparison ();
        String result = comparison.comparison(1,2);
       Assert.assertEquals (result, "c меньше d");
    }

    @Test
    public void testCGreaterD () {
        Comparison comparison = new Comparison ();
        String result = comparison.comparison(30,20);
        Assert.assertEquals (result, "c больше d");
    }

    @Test
    public void testCEqualsD () {
        Comparison comparison = new Comparison ();
        String result = comparison.comparison(2,2);
        Assert.assertEquals (result, "c равно d");
    }

    @Test
    public void testNegativeNumbers () {
        Comparison comparison = new Comparison ();
        String result = comparison.comparison(-10,-5);
        Assert.assertEquals (result, "c меньше d");
    }

    @Test
    public void testZero () {
        Comparison comparison = new Comparison ();
        String result = comparison.comparison(0,0);
        Assert.assertEquals (result, "c равно d");
    }

    @Test
    public void testMaxInt () {
        Comparison comparison = new Comparison ();
        String result = comparison.comparison(-2147483648,2147483647);
        Assert.assertEquals (result, "c меньше d");
    }
}
