package org.example;

public class SquareTriangle {
    public static class TriangleArea {
        double base;
        double height;

        public TriangleArea(double base, double height) {
            this.base = base;
            this.height = height;
            if (base <=0 | height <=0){
                System.out.println("Значения не могут быть отрицательными или равны нулю");
            }
        }

        public double calculateArea() {
            return (base * height) / 2;
        }
    }
}
