package lesson7;

public class Main {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Матроскин", 21);
        Cat cat2 = new Cat("Барсик", 6);
        Cat cat3 = new Cat("Балбес", 14);
        Cat[] cats = {cat1, cat2, cat3};

        Plate plate1 = new Plate(10, 7);
        catsEat(cats, plate1);

    }

    public static void catsEat(Cat[] cats, Plate plate1) {
        plate1.info();
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate1);
            plate1.info();
        }

    }
}



