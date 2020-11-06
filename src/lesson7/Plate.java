package lesson7;

public class Plate {

    private int capacity;
    private int currentValue;

    public Plate(int capacity, int currentValue) {
        this.capacity = capacity;
        this.currentValue = currentValue;
    }

    public int decreaseFood(int appetite, int hunger) {
        do {
            hunger = isCatHungry(appetite, hunger);
            appetite = hunger;
        } while (hunger > 0);
        return hunger;
    }

    public int isCatHungry(int appetite, int hunger) {
        if (currentValue < 0 || (appetite > currentValue && appetite > 0)) {
            currentValue -= appetite;
            System.out.println("Шерстяной засранец съел всё из миски и смотрит на тебя с осуждением");
            hunger = (currentValue) * (-1);
            System.out.println("Кот хочет скушац ещё " + hunger + " шт. вкусняшек");
            currentValue = 0;
            info();
            plateFill();
            return hunger;
        } else {
            currentValue -= appetite;
            System.out.println("Шерстяной засранец съел " + appetite + " шт. вкусняшек, теперь он наелся и спит");
            hunger = 0;
            return hunger;
        }
    }

    public void plateFill() {
        System.out.println("Досыпаем в миску " + (capacity - currentValue) + " шт. вкусняшек");
        currentValue = capacity;
    }

    public void info() {
        System.out.println("plate: " + currentValue);
    }

}
