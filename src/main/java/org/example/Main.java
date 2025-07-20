package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog ("Bobik", 600, 10);
        dog1.runDog (300);
        dog1.swimDog(20);

        System.out.println();

        Cat cat1 = new Cat("Murzik",100, 0, 50, 50, true);
        cat1.swimCat(0);
        cat1.eatCat (70, 50);

        System.out.println();

        CircleZ circle = new CircleZ(5);
        circle.perimeterOne();
        circle.squareOne();
        circle.colorBackground();
        circle.colorBorder();

        System.out.println();

        Triangle triangle = new Triangle (5,10,6);
        triangle.perimeterOne();
        triangle.squareOne();
        triangle.colorBackground();
        triangle.colorBorder();

        System.out.println();

        Rectangle rectangle = new Rectangle (4, 5);
        rectangle.perimeterOne();
        rectangle.squareOne();
        rectangle.colorBackground();
        rectangle.colorBorder();
    }


    }
