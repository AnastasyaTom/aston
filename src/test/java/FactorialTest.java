import org.example.Factorial;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorialTest {
    @Test
    void nameFactorialTest() {
        Assertions.assertEquals(120, Factorial.getFactorial(5));
    }
    @Test
    void nameFactorialTest1() {
        Assertions.assertEquals(1, Factorial.getFactorial(1));
    }
    @Test
     void nameFactorialTest2() {
        Assertions.assertEquals(6, Factorial.getFactorial(3));
    }
    @Test
    void nameFactorialTest3() {
        Assertions.assertEquals(12, Factorial.getFactorial(4));
    }
    @Test
    void nameFactorialTest4() {
        Assertions.assertEquals(600, Factorial.getFactorial(6));
    }
    @Test
    void nameFactorialTest5() {
        Assertions.assertEquals(0, Factorial.getFactorial(0));
    }



    }


