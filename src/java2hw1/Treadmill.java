package java2hw1;

import javax.crypto.spec.PSource;

public class Treadmill implements Obstacle {

    private int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    @Override
    public boolean overcome(Participant participant) {
        if (participant.run() >= distance) {
            System.out.println("Он сделал это!");
            return true;
        } else {
            System.out.println("Слабак! Ты изгнан с нашего праздника жизни");
            return false;
        }
    }
}
