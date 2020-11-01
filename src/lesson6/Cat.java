package lesson6;

import java.util.Scanner;

public class Cat extends Animal implements Running, Jumping{

    Scanner scanner = new Scanner(System.in);
    public String type;
    private String breed;
    protected double distance = 0.0;
    protected double limit = 0.0;
    protected double limitSize = 0.0;

    public Cat(String name, String color, String size, String type) {
        super(name, color, size);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean jump() {
        limitSize = 2.0;
        limit = 0.1 + (Math.random() * limitSize);
        System.out.println("Эта кошка может совершать прыжки в пределах от 0,1 до " + limit + "метра");
        System.out.println("Введите высоту прыжка:");
        distance = scanner.nextDouble();
        if (distance <= limit && distance >= 0.1) {
            System.out.println("Кошка " + getName() + " прыгнула на высоту " + distance +  " метра");
            return true;
        } else {
            System.out.println("Кошка " + getName() + " при прыжке на высоту " + distance +  " метра померла");
            return false;
        }
    }

    @Override
    public boolean run() {
        limitSize = 1000.0;
        limit = 0.1 + (Math.random() * limitSize);
        System.out.println("Эта кошка может совершать забеги в пределах от 0,1 до " + limit + "метра");
        System.out.println("Введите дистанцию забега:");
        distance = scanner.nextDouble();
        if (distance <= limit && distance >= 0.1) {
            System.out.println("Кошка " + getName() + " пробежала дистанцию " + distance +  " метра");
            return true;
        } else {
            System.out.println("Кошка " + getName() + " при забеге на дистанцию " + distance +  " метра померла");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Кошка: " +
                "Разновидность - " + type + ", " +
                super.toString();
    }

    public void fullInfo() {
        System.out.println(toString());
        run();
        jump();
    }

}
