package lesson2;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        task2();
    }

    static void task2() {
        int SIZE = 8;
        int[] arr = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            arr[i] = i * 3;
           }
        System.out.println("Массив: arr = " + Arrays.toString(arr));
    }

}
