package java2hw1;

public class Human implements Participant {

    public String name;
    public int runLimit;
    public int jumpLimit;

    public Human(String name, int runLimit, int jumpLimit) {
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
        System.out.println(name + " собирается пробежать дистанцию по беговой дорожке");
        return runLimit;
    }

    @Override
    public int jump() {
        System.out.println(name + " собирается перепрыгнуть через стену");
        return jumpLimit;
    }
}
