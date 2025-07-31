import org.example.SquareTriangle;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class TestSquareTriangle {

    @Test
    public void testNormValues(){
        SquareTriangle.TriangleArea triangle = new SquareTriangle.TriangleArea(4.0, 6.0);
        assertEquals(triangle.calculateArea(), 12.0, "Площадь треугольника 4х6 должна быть 12");
    }

    @Test
    public void testLargeValues(){
        SquareTriangle.TriangleArea triangle = new SquareTriangle.TriangleArea(400.0, 600.0);
        assertEquals(triangle.calculateArea(), 120000.0, "Площадь треугольника 400х600 должна быть 120000");
    }

    @Test
    public void testFractionalValues(){
        SquareTriangle.TriangleArea triangle = new SquareTriangle.TriangleArea(2.5, 3.5);
        assertEquals(triangle.calculateArea(), 4.375, "Площадь треугольника 2.5х3.5 должна быть 120000");
    }

    @Test
    public void testZeroBase(){
        SquareTriangle.TriangleArea triangle = new SquareTriangle.TriangleArea(0.0, 3.5);
        assertEquals(triangle.calculateArea() <=0, "При основании 0, площадь должна быть 0 или отрицательной");
    }

    @Test
    public void testNegativeHeight() {
        SquareTriangle.TriangleArea triangle = new SquareTriangle.TriangleArea(10.0, -3.5);
        assertEquals(triangle.calculateArea() <= 0, "При отрицательной высоте площадь должна быть 0 или отрицательной");
    }

    @Test
    public void testZero(){
        SquareTriangle.TriangleArea triangle = new SquareTriangle.TriangleArea(0.0, 0.0);
        assertEquals(triangle.calculateArea(), 0.0, "При нулевых значениях, площадь должна быть 0 ");
    }
}
