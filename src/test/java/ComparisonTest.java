import org.example.Comparison;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ComparisonTest {
    @Test
    public void testComparison1() {
        Comparison comp = new Comparison();
        Assertions.assertEquals("c меньше d", comp.comparison(3,5));
    }

    @Test
    public void testComparison2() {
        Comparison comp = new Comparison();
        Assertions.assertEquals("c больше d", comp.comparison(5,3));
    }
    @Test
    public void testComparison3() {
        Comparison comp = new Comparison();
        Assertions.assertEquals("c равно d", comp.comparison(5,5));
    }
    @Test
    public void testComparison4() {
        Comparison comp = new Comparison();
        Assertions.assertEquals("c меньше d", comp.comparison(6,5));
    }
    @Test
    public void testComparison5() {
        Comparison comp = new Comparison();
        Assertions.assertEquals("c больше d", comp.comparison(5,10));
    }
    @Test
    public void testComparison6() {
        Comparison comp = new Comparison();
        Assertions.assertEquals("c равно d", comp.comparison(5,3));
    }


}
