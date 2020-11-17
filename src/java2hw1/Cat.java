package java2hw1;

public class Cat implements Participant {

    private String name;
    private int runLimit;
    private int jumpLimit;

    public Cat(String name, int runLimit, int jumpLimit) {
        this.name = name;
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
        System.out.println(name + " готовится к забегу на дистанцию");
        return runLimit;
    }

    @Override
    public int jump() {
        System.out.println(name + " собирается запрыгнуть на стену");
        return jumpLimit;
    }
}
