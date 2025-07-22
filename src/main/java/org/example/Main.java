package org.example;

import static org.example.LessonFive.sumArr;

public class Main {
    public static void main(String[] args) {
        String[][] arr1 = {
                {"3", "2", "4", "5"},
                {"6", "9", "7", "9"},
                {"5", "1", "1", "3"},
                {"9", "8", "3", "7"}
        };

        String[][] arr2 = {
                {"1", "2", "3", "X"},
                {"5", "6", "7", "8"},
                {"9", "1", "0", "1"},
                {"1", "1", "2", "1"}
        };

        String[][] arr3 = {
                {"9", "2", "3", "5"},
                {"5", "5", "7", "7"},
                {"3", "1", "4", "1"},
                {"2", "1",}
        };

        try {
            int result1 = sumArr(arr1);
            System.out.println(result1);
        } catch (MyArraySizeException| MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
        try {
            int result2 = sumArr(arr2);
            System.out.println(result2);
        } catch (MyArraySizeException| MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
        try {
            int result3 = sumArr(arr3);
            System.out.println(result3);
        } catch (MyArraySizeException| MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
        try{
            System.out.println(arr3[5][7]);
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
}