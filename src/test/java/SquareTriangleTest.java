import org.example.SquareTriangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareTriangleTest {
    @Test
    void testCalculateArea() {
        SquareTriangle.TriangleArea triangle = new SquareTriangle.TriangleArea(10, 5);
        double expected = 25.0;
        Assertions.assertEquals(expected, triangle.calculateArea());
    }

    @Test
    void testCalculateArea1() {
        SquareTriangle.TriangleArea triangle = new SquareTriangle.TriangleArea(0, 5);
        Assertions.assertEquals(0, triangle.calculateArea());
    }
    @Test
    void testCalculateArea2() {
        SquareTriangle.TriangleArea triangle = new SquareTriangle.TriangleArea(10, 0);
        Assertions.assertEquals(0, triangle.calculateArea());
    }

    @Test
    void testCalculateArea3() {
        SquareTriangle.TriangleArea triangle = new SquareTriangle.TriangleArea(-10, 5);
        Assertions.assertEquals(-25.0, triangle.calculateArea());
    }
    @Test
    void testCalculateArea4() {
        SquareTriangle.TriangleArea  triangle = new SquareTriangle.TriangleArea(10, -5);
        Assertions.assertEquals(-25.0, triangle.calculateArea());
    }
    @Test
    void testCalculateArea5() {
        SquareTriangle.TriangleArea  triangle = new SquareTriangle.TriangleArea(10, 3);
        Assertions.assertEquals(30, triangle.calculateArea());
    }
    @Test
    void testCalculateArea6() {
        SquareTriangle.TriangleArea triangle = new SquareTriangle.TriangleArea(3, 5);
        Assertions.assertEquals(33, triangle.calculateArea());
    }
    @Test
    void testCalculateArea7() {
        SquareTriangle.TriangleArea triangle = new SquareTriangle.TriangleArea(20, 10);
        Assertions.assertEquals(105, triangle.calculateArea());
    }
}

