package org.example;

public class Triangle implements Figure{
    private double side1;
    private double side2;
    private double side3;


    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public void perimeterOne() {
        double perimeterTriangle = side1 + side2 + side3;
        System.out.println("Периметр треугольника = " + perimeterTriangle);
    }

    @Override
    public void squareOne() {
        double perimeterTriangle = side1 + side2 + side3;
        double semiPerimeter = perimeterTriangle / 2;
        double squareTriangle = (perimeterTriangle * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
        System.out.println("Площадь треугольника = "+ squareTriangle);
    }

    @Override
    public void colorBackground() {
        System.out.println("Цвет заливки: белый");
    }

    @Override
    public void colorBorder() {
        System.out.println("Цвет границ: черный");
    }
}
