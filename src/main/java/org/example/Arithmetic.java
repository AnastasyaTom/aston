package org.example;

public class Arithmetic {
    int a;
    int b;

    public Arithmetic(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int summa (int a, int b) {
        return a + b;
    }

    public int difference (int a, int b) {
        return a - b;
    }

    public int multiplication (int a, int b) {
        return a * b;
    }

    public double division (int a, int b) {
        if (b == 0) {
         throw new ArithmeticException ("Деление на ноль невозможно");
        }
        return (double) a / b;
    }
}
