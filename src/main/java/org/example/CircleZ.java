package org.example;

public class CircleZ implements Figure{
    private  double radius;


    public CircleZ(double radius) {
        this.radius = radius;
    }

    @Override
    public void perimeterOne() {
        double perimeterCircle = 2 * Math.PI * radius;
        System.out.println("Периметр круга = " + perimeterCircle);
    }

    @Override
    public void squareOne() {
        double squareOne = Math.PI * radius * radius;
        System.out.println("Площадь круга = " + squareOne);
    }

    @Override
    public void colorBackground() {
        System.out.println("Цвет заливки: красный");
    }

    @Override
    public void colorBorder() {
        System.out.println("Цвет границ: черный");

    }

}
