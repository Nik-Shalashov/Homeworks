package lesson2;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        task1(0, 1, 0, 0, 1);
    }

    //Задание 1
    static void task1(int arr0, int arr1, int arr2, int arr3, int arr4) {
        int SIZE = 5;
        int[] arr = new int[SIZE];
        arr[0] = arr0;
        arr[1] = arr1;
        arr[2] = arr2;
        arr[3] = arr3;
        arr[4] = arr4;
        System.out.println("Исходный массив: arr = " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else if(arr[i] == 1) {
                arr[i] = 0;
            }
            else if(arr[i] !=1 || arr[i] !=0) {
                System.out.println("Неправильно введены элементы массива. Значения эелементов могут быть только 1 или 0.");
                break;
            }
        }
        System.out.println("Перевёрнутый массив: arr = " + Arrays.toString(arr));
    }


}

