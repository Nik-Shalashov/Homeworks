package lesson2;

public class Task4 {
    public static void main(String[] args) {
        task4(7);
    }

    static void task4(int SIZE) {
        int[][] deepArr = new int[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            int count = i;
            for (int j = 0; j < SIZE; j++) {
                deepArr[i][0 + count] = 1;
                deepArr[i][(SIZE - 1) - count] = 1;
            }
        }
        for (int[] ints : deepArr) {
            for (int anInt : ints) {
                System.out.printf("%2d", anInt);
            }
            System.out.println();
        }
    }

}
