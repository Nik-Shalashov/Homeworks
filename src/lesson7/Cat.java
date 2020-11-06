package lesson7;

public class Cat {

    private String name;
    private int appetite;
    protected int hunger;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public void eat(Plate p) {
        System.out.println("Кот " + name + " подошёл к миске и хочет скушац " + appetite + " шт. вкусняшек");
        hunger = p.decreaseFood(appetite, hunger);
    }

    public void hunger(Plate p) {

    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }
}
