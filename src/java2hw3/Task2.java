package java2hw3;

import java.util.*;

public class Task2 {

    public static void main(String[] args) {
        Set<String> tnForPetrov = new HashSet<>();
        tnForPetrov.add("12");
        tnForPetrov.add("23");

        Set<String> tnForIvanov = new HashSet<>();
        tnForIvanov.add("1111");
        tnForIvanov.add("2222");

        HashMap<String, Set<String>> phonebook = new HashMap<>();
        phonebook.put("Petrov", tnForPetrov);
        phonebook.put("Ivanov", tnForIvanov);

        System.out.println("Телефонный справочник:");
        System.out.println(phonebook);

        Set<String> keys = phonebook.keySet();

        String newSecondName = "Petrov";
        String newTN = "555";
        System.out.println("Внесём в справочник ктонтакт с фамилией " + newSecondName + " и телефонным номером " + newTN);

        if (keys.contains(newSecondName)) {
            phonebook.get(newSecondName).add(newTN);
        } else {
            Set<String> tnForSmith = new HashSet<>();
            tnForSmith.add(newTN);
            phonebook.put(newSecondName, tnForSmith);
        }

        System.out.println("Телефонный справочник после изменений");
        System.out.println(phonebook);

        Set<String> keys1 = phonebook.keySet();

        String newSecondName2 = "Smith";
        String newTN2 = "666";
        System.out.println("Внесём в справочник ктонтакт с фамилией " + newSecondName2 + " и телефонным номером " + newTN2);

        if (keys1.contains(newSecondName2)) {
            phonebook.get(newSecondName2).add(newTN2);
        } else {
            Set<String> tnForSmith = new HashSet<>();
            tnForSmith.add(newTN2);
            phonebook.put(newSecondName2, tnForSmith);
        }

        System.out.println("Телефонный справочник после изменений");
        System.out.println(phonebook);

    }

}
