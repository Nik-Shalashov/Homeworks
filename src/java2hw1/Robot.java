package java2hw1;

public class Robot implements Participant {

    private String model;
    private int runLimit;
    private int jumpLimit;

    public Robot(String model, int runLimit, int jumpLimit) {
        this.model = model;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    public int getRunLimit() {
        return runLimit;
    }

    public int getJumpLimit() {
        return jumpLimit;
    }

    @Override
    public int run() {
        System.out.println(model + " собирается пробежат дистанцию");
        return runLimit;
    }

    @Override
    public int jump() {
        System.out.println(model + " берёт разбег для прыжка через стену");
        return jumpLimit;
    }
}
