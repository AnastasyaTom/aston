package org.example;

public class LessonTwo {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        invertArray();
        fillArray();
        changeArray();
        diagonalArray();
    }
    // Задание 1
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

    }
    // Задание 2
    public static void checkSumSign() {

        int a = 4;
        int b = 11;
        if ((a + b) >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    // Задание 3
    public static void printColor() {

        int value = 33;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Жёлтый");
        } else {
            System.out.println("Зелёный");
        }
    }
    // Задание 4
    public static void compareNumbers() {

        int a = 37;
        int b = 54;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
    // Задание 5
    public boolean intSumm(int a, int b) {

        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }
    // Задание 6
    public static void intNum(int a) {

        if (a >= 0) {
            System.out.println(a + " - число положительное");
        } else {
            System.out.println(a + " - число отрицательное");
        }
    }
    // Задание 7
    public boolean intInt(int a) {
        return a >=0;
    }
    // Задание 8
    public static void stringInt(String text, int n) {
        for (int i = 0; i < n; i++) ;
        System.out.println(text);
    }
    // Задание 9
    public boolean intYear(int n) {
        for (int i = 1; i < n; i++) {
            if (i % 4 == 0) {
                return true;
            } else if (i % 100 == 0) {
                return false;
            } else if (i % 400 == 0) {
                return true;
            }
        }
        return false;
    }
    // Задание 10
    public static void invertArray() {
        System.out.println();
        int[] arr = {1, 0, 0, 1, 1, 1, 0, 0, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr [i] == 1){
                arr[i] = 0;
            } else if (arr[i] == 0) {
                arr[i] = 1;
            }
            System.out.print(arr[i] + " ");
        }
    }
    // Задание 11
    public static void fillArray() {

        int [] arr = new int [100];
        for (int i = 0; i < 100; i++){
            arr[i] = i;
            System.out.println("arr [" + i + "]");
        }

    }
    // Задание 12
    public static void changeArray() {
        int [] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr [i] < 6) {
                System.out.println(arr [i] = arr[i]*2);
            }else{
                System.out.println(arr[i]);
            }
        }

    }
    // Задание 13
    public static void diagonalArray() {

        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length - i - 1] = 1;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }
    // Задание 14
    public static int[] arrLen(int len, int initialValue) {
        int [] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr [i] = initialValue;
        }
        return arr;
    }
}




