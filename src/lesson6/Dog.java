package lesson6;


import java.util.Scanner;

public class Dog extends Animal implements Jumping, Running, Swimming{

    Scanner scanner = new Scanner(System.in);
    private String breed;
    protected double distance;
    protected double limit;
    protected double limitSize;


    protected Dog(String name, String color, String size, String breed) {
        super(name, color, size);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public boolean jump() {
        limitSize = 2.0;
        limit = 0.1 + (Math.random() * limitSize);
        System.out.println("Эта собака может совершать прыжки в пределах от 0,1 до " + limit + "метра");
        System.out.println("Введите высоту прыжка:");
        distance = scanner.nextDouble();
        if (distance <= limit && distance >= 0.1) {
            System.out.println("Собака " + getName() + " прыгнула на высоту " + distance +  " метра");
            return true;
        } else {
            System.out.println("Собака " + getName() + " при прыжке на высоту " + distance +  " метра померла");
            return false;
        }
    }

    @Override
    public boolean run() {
        limitSize = 1000.0;
        limit = 0.1 + (Math.random() * limitSize);
        System.out.println("Эта собака может совершать забег в пределах от 0,1 до " + limit + "метра");
        System.out.println("Введите дистанцию забега:");
        distance = scanner.nextDouble();
        if (distance <= limit && distance >= 0.1) {
            System.out.println("Собака " + getName() + " пробежала дистанцию " + distance +  " метра");
            return true;
        } else {
            System.out.println("Собака " + getName() + " при забеге на дистанцию " + distance +  " метра померла");
            return false;
        }
    }

    @Override
    public boolean swim() {
        limitSize = 1000.0;
        limit = 0.1 + (Math.random() * limitSize);
        System.out.println("Эта собака может совершать заплыв в пределах от 0,1 до " + limit + "метра");
        System.out.println("Введите дистанцию заплыва:");
        distance = scanner.nextDouble();
        if (distance <= limit && distance >= 0.1) {
            System.out.println("Собака " + getName() + " проплыла дистанцию " + distance +  " метра");
            return true;
        } else {
            System.out.println("Собака " + getName() + " при заплыве на дистанцию " + distance +  " метра померла");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Собака: " +
                "Порода - " + breed + ", " +
                super.toString();
    }

    public void fullInfo() {
        System.out.println(toString());
        run();
        jump();
        swim();
    }
}
