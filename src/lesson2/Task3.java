package lesson2;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        task3(1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1);
    }

    static void task3(int arr0, int arr1, int arr2, int arr3, int arr4, int arr5, int arr6,int arr7, int arr8, int arr9, int arr10, int arr11) {
        int SIZE = 12;
        int[] arr = new int[SIZE];
        arr[0] = arr0;
        arr[1] = arr1;
        arr[2] = arr2;
        arr[3] = arr3;
        arr[4] = arr4;
        arr[5] = arr5;
        arr[6] = arr6;
        arr[7] = arr7;
        arr[8] = arr8;
        arr[9] = arr9;
        arr[10] = arr10;
        arr[11] = arr11;
        System.out.println("Исходный массив: arr = " + Arrays.toString(arr));
        for (int i = 0; i < SIZE; i++) {
            if(arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println("Проверенный массив: arr = " + Arrays.toString(arr));
    }

}
