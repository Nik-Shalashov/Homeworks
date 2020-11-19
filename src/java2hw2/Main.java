package java2hw2;

import java.util.Random;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static int size;
    static int sum = 0;


    public static void main(String[] args) {
        try {
            arr();
        } catch (MyArraySizeException e) {
            e.printStackTrace();
            System.out.println();
            System.out.println("Начнём сначала");
            System.out.println();
            arr();
        }
    }

    protected static void arr() throws MyArraySizeException, MyArrayDataException {
        System.out.println("Тебе выпала непростая задача. Надо создать массив РАЗМЕРОМ 4х4!");
        System.out.println("Но не просто создать его, так ещё и заполнить ЧИСЛАМИ!");
        System.out.println("Запомни это и не говори, что тебя не предупреждали.");
        System.out.println("Итак, начнём. Введи размерность твоего двумерного массива:");
        size = scanner.nextInt();
        if (size != 4) throw new MyArraySizeException("Размер массива не равен 4х4");
        System.out.println("Отлично! Размер массива что надо. Теперь заполни его вручную ЧИСЛАМИ! Не буквами, не словами, а Ц И Ф Р А М И!");
        String[][] arr = new String[size][size];
        int[][] newArr = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = scanner.next();
                try {
                    newArr[i][j] = Integer.parseInt(arr[i][j]);
                    sum += newArr[i][j];
                } catch (NumberFormatException e) {
                    System.out.println("Ты всё сломал!");
                    throw new MyArrayDataException("Элемент массива под номером " + i + "-" + j + " - не число");
                }

            }
        }
        System.out.println("В итоиге получился массив:");
        for (int[] ints: newArr) {
            for (int anInt: ints) {
                System.out.printf("%2d", anInt);
            }
            System.out.println();
        }
        System.out.println("Сумма элементов массива = " + sum);
        System.out.println("Поздравляю! ты справился с этой нелёгкой задчей!");
    }

}
