package lesson1;

import java.util.Scanner;

public class Main {
    //Задание 1
    public static void main(String[] args) {

        //Задание 2
        byte bit8 = 56;
        short sh = 24789;
        int a = 500;
        long lg = -894546548L;
        float fl = 89.99f;
        double db = -56.245;
        char s = 'G';
        boolean bl = true;

        System.out.println(calculate(8, 6, 6, 0));
        System.out.println(compareSum(80, 9));
        compareToZero(-6);
        System.out.println(checkBelowZero(5));
        sayHello("Никита");
        whatsYear(900);

    }

    //Задание 3
    static double calculate(int a, int b, int c, int d) {
        if (d == 0) {
            Scanner in = new Scanner(System.in);
            System.out.println("Параметр d не может быть равным 0, измените его");
            d = in.nextInt();
            in.close();
        }
        return a * (b + (1.0 * c / d));
    }

    //Задание 4
    static boolean compareSum(int a, int b) {
        int c = a + b;
        return  (c >= 10 && c <= 20);
    }

    //Задание 5
    static void compareToZero(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    //Задание 6
    static boolean checkBelowZero(int a) {
        return (a < 0);
        }


    //Задание 7
    static void sayHello(String name) {
        System.out.printf("Привет, " + name + "!\n");
    }

    //Задание 8*
    static void whatsYear(int year) {
        if ((year % 4) != 0 || ((year % 400) != 0 && (year % 100) == 0)) {
            System.out.println("Год  не високосный");
        } else {
            System.out.println("Год високосный");
        }
    }

}
