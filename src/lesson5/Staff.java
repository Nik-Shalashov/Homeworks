package lesson5;

public class Staff {
    protected String name;
    protected String position;
    protected String email;
    protected String tfNumber;
    protected int salary;
    protected int age;

    protected Staff(String name, String position, String email, String tfNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.tfNumber = tfNumber;
        this.salary = salary;
        this.age = age;
    }

    protected void printInfo() {
        System.out.println("Имя сотрудника: " + name);
        System.out.println("Должность сотрудника: " + position);
        System.out.println("Рабочая почта: " + email);
        System.out.println("Номер телефона: " + tfNumber);
        System.out.println("Заработная плата:" + salary);
        System.out.println("Возраст: " + age);
        System.out.println();
    }

    public void setAge(int age) {
        if (age >= 0) this.age = age;
        else System.out.println("Введён некорректный возраст");
    }

    public int getAge() {
        return age;
    }

    public void setSalary(int salary) {
        if (salary >= 0)this.salary = salary;
        else System.out.println("Зарплата не может быть меньше 0");
    }

    public int getSalary() {
        return salary;
    }
}


