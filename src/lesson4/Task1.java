package lesson4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {

    static int SIZE = 3;
    static char[][] map = new char[SIZE][SIZE];

    static final char EMPTY_SIGN = '*';
    static final char PLAYER_SIGN = 'X';
    static final char AI_SIGN = '0';

    static final String EMPTY = " ";
    static final String HEAD_SIGN = "$";

    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        turnGame();
        playGame();
    }

    private static void turnGame() {
        initMap();
        printMap();
    }

    private static void initMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = EMPTY_SIGN;
            }
        }
        System.out.println(map);
    }

    private static void printMap() {
        printMapHeader();
        printMapRows();
    }

    private static void printMapHeader() {
        System.out.print(HEAD_SIGN + EMPTY);
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + EMPTY);
        }
        System.out.println();
    }

    private static void printMapRows() {
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + EMPTY);
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + EMPTY);
            }
            System.out.println();
        }
    }

    private static void playGame() {
        while (true){
            humanTurn();
            printMap();
            if (checkWin(PLAYER_SIGN)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }

            aiTurn();
            printMap();
            if (checkWin(AI_SIGN)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }

    }

    private static void humanTurn() {
        System.out.println("Ваш ход");
        int rowNum;
        int colNum;
        boolean isAI = false;
        do {
            System.out.println("Номер строки:");
            rowNum = scanner.nextInt() - 1;
            System.out.println("Номер столбца:");
            colNum = scanner.nextInt() - 1;
        } while (!isCellValid(rowNum, colNum, isAI));
        map[rowNum][colNum] = PLAYER_SIGN;
    }

    private static void aiTurn() {
        System.out.println("Ход компьютера");
        int rowNum;
        int colNum;
        boolean isAI = true;
        do {
            rowNum = random.nextInt(SIZE);
            colNum = random.nextInt(SIZE);
        } while (!isCellValid(rowNum, colNum, isAI));
        map[rowNum][colNum] = AI_SIGN;
    }

    private static boolean isCellValid(int rowNum, int colNum, boolean isAI) {
        if (rowNum < 0 || rowNum >= SIZE || colNum < 0 || colNum >= SIZE) {
            System.out.println("Вы вышли за пределы игрового поля. Проверьте значения.");
            return false;
        }
        if (map[rowNum][colNum] != EMPTY_SIGN) {
            if (isAI == false) {
                System.out.println("Эта ячейка занята! Выберите другую.");
                return false;
            }
            return false;
        }
        return true;
    }

    private static boolean checkWin(char dot) {
        if (SIZE >= 3 || SIZE <= 6) ifSize36(dot);
        if (SIZE >= 7 || SIZE <= 10) ifSize710(dot);
        if (SIZE >= 11) ifSize11More(dot);
        return false;
    }

    private static boolean ifSize36(char dot) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == dot && map[i][j + 1] == dot && (map[i][j + 2] == dot || map[i][j - 1] == dot))
                    return true;
                if (map[i][j] == dot && map[i][j - 1] == dot && map[i][j - 2] == dot) return true;
                if (map[i][j] == dot && map[i + 1][j] == dot && (map[i + 2][j] == dot || map[i - 1][j] == dot))
                    return true;
                if (map[i][j] == dot && map[i - 1][j] == dot && map[i - 2][j] == dot) return true;
                if (map[i][j] == dot && map[i + 1][j + 1] == dot && (map[i + 2][j + 2] == dot || map[i - 1][j - 1] == dot))
                    return true;
                if (map[i][j] == dot && map[i - 1][j - 1] == dot && (map[i - 2][j - 2] == dot || map[i + 1][j + 1] == dot))
                    return true;
            }
        }
        return false;
    }

    private static void ifSize710(char dot) {

    }

    private static void ifSize11More(char dot) {

    }

    private static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == EMPTY_SIGN) return false;
            }
        }
        return true;
    }
}


