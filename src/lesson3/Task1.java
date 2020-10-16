package lesson3;

import java.util.Random;
import java.util.Scanner;

public class Task1 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Сыграем в игру. Вам необходимо отгадать число от 0 до 9. У вас есть 3 попытки.");
        game();
    }

    static void endGame() {
        System.out.println("Хотите сыграть ещё раз? y/n");
        String decision = scanner.next();
        if (decision.equals("y")) {
            game();
        } else if (decision.equals("n")) {
            System.exit(0);
        }
    }

    static void game() {
        System.out.println("Введите число:");
        int userNum;
        Random random = new Random();
        int randNum = random.nextInt(10);
        for (int i = 0; i < 3; i++) {
            userNum = scanner.nextInt();
            if (userNum == randNum) {
                System.out.println("Поздравляю! Вы угадали число! Игра окончена.");
                endGame();
            } else if (i == 2) {
                System.out.println("К сожалению, вы не угадали число.");
                endGame();
            } else if (userNum < randNum) {
                System.out.println("Ваше число меньше загаданного. Введите другое число:");
            } else if (userNum > randNum) {
                System.out.println("Ваше число больше загаданного. Введите другое число:");
            }
        }

    }

}


