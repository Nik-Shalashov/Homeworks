package lesson2;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        task5(8, 0, 90);
    }

    static void task5(int SIZE, int minLimit, int maxLimit) {
        int[] arr = new int[SIZE];
        int min = 0;
        int max = 0;
        for (int i = 0; i < SIZE; i++) {
            arr[i] = minLimit + (int) (Math.random() * maxLimit);
        }
        System.out.println("Массив чисел: arr = " + Arrays.toString(arr));
        min = arr[0];
        max = arr[0];
        for (int i = 0; i < SIZE; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }
}
