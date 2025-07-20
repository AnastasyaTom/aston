package org.example;

public class Rectangle implements Figure {
    double width;
    double length;


    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

 /*   @Override
    public double perimeter() {
        return width * 2 + length * 2;
    }

    @Override
    public double square() {
        return width * length;
    }*/

    @Override
    public void perimeterOne() {
        double perimeterRectangle = width * 2 + length * 2;
        System.out.println("Периметр прямоугольника = " + perimeterRectangle);
    }

    @Override
    public void squareOne() {
        double squareRectangle = width * length;
        System.out.println("Площадь прямоугольника = " + squareRectangle);
    }

    @Override
    public void colorBackground() {
        System.out.println("Цвет заливки: зелёный");
    }

    @Override
    public void colorBorder() {
        System.out.println("Цвет границ: синий");
    }

}
