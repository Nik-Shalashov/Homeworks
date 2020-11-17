package java2hw1;

public class Wall implements Obstacle {

    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean overcome(Participant participant) {
        if (participant.jump() >= height) {
            System.out.println("Он сделал это!");
            return true;
        } else {
            System.out.println("Слабак! Ты изгнан с нашего праздника жизни!");
            return false;
        }
    }
}
