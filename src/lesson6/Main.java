package lesson6;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Шарик", "бурый", "большой", "дворняга");
        Cat cat1 = new Cat("Барсик", "рыжий", "средний", "тигр");
        dog1.fullInfo();
        cat1.fullInfo();
    }
}
