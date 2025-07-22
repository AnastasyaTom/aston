package org.example;

public class LessonFive {

    static int sumArr(String[][] arr) throws MyArraySizeException, MyArrayDataException, ArrayIndexOutOfBoundsException {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr.length != 4 || arr[i].length != 4)
                    throw new MyArraySizeException("Массив должен быть размером 4х4");
                if (i > arr[1].length || j> arr[i].length)
                    throw new ArrayIndexOutOfBoundsException();
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Некорректные данные в ячейках: " + i + " - " + j);
                }
            }
        }
       return sum;
    }
}