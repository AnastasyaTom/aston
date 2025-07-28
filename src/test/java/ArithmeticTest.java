import org.example.Arithmetic;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArithmeticTest {
    @Test
    void testSumma() {
        Arithmetic arithmetic = new Arithmetic();
        Assertions.assertEquals(10, arithmetic.summa(3, 7));
    }

    @Test
    void testSumma1() {
        Arithmetic arithmetic = new Arithmetic();
        Assertions.assertEquals(10, arithmetic.summa(4, 7));
    }

    @Test
    void testDifference() {
        Arithmetic arithmetic = new Arithmetic();
        Assertions.assertEquals(3, arithmetic.difference(10,7));
    }
    @Test
    void testDifference1() {
        Arithmetic arithmetic = new Arithmetic();
        Assertions.assertEquals(3, arithmetic.difference(10, -7));
    }
    @Test
    void testMultiplication() {
        Arithmetic arithmetic = new Arithmetic();
        Assertions.assertEquals(21, arithmetic.multiplication(3, 7));
    }
    @Test
    void testMultiplication1() {
        Arithmetic arithmetic = new Arithmetic();
        Assertions.assertEquals(20, arithmetic.multiplication(3, 7));
    }
    @Test
    void testDivision(){
        Arithmetic arithmetic = new Arithmetic();
        Assertions.assertEquals(3, arithmetic.division(21,7));
    }
    @Test
    void testDivision1(){
        Arithmetic arithmetic = new Arithmetic();
        Assertions.assertEquals(4, arithmetic.division(21,7));
    }
    @Test
    void testDivision2(){
        Arithmetic arithmetic = new Arithmetic();
        Assertions.assertEquals(3, arithmetic.division(21,0));
    }
}
