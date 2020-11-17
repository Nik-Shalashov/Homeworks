package java2hw1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Participant[] participants = new Participant[3];
        participants[0] = new Human("Кожаный", 5000, 3);
        participants[1] = new Cat("Шерстяной", 1000, 2);
        participants[2] = new Robot("Бендер", 10000, 5);

        Obstacle[] obstacles = new Obstacle[2];
        obstacles[0] = new Treadmill(5000);
        obstacles[1] = new Wall(2);

        for (int i = 0; i < participants.length; i++) {
            for (int j = 0; j < obstacles.length; j++) {
             if (!obstacles[j].overcome(participants[i])) break;
            }
        }

    }

}
