package lesson5;

public class Main {
    public static void main(String[] args) {
        Staff[] staff = new Staff[5];
        staff[0] = new Staff("Дмитрий Юрьевич", "Главный инженер", "bdy@eample.com", "8", 60000, 31);
        staff[1] = new Staff("Юрий Иванович", "Начальник отдела", "kir@example.com", "800", 70000, 72);
        staff[2] = new Staff("Виталий Вячеславович", "Заместитель начальника", "vtv@example.com", "555", 65000, 41);
        staff[3] = new Staff("Виктор Алексеевич", "Ведущий электроник", "pva@example.com", "35", 45000, 24);
        staff[4] = new Staff("Андрей Дмитриевич", "Ведущий электроник", "pad@example.com", "35", 50000, 45);

        for (int i = 0; i < staff.length; i++) {
            if (staff[i].age >= 40) staff[i].printInfo();
        }

    }
}
