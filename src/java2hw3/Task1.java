package java2hw3;

import java.util.*;

public class Task1 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("A");
        list.add("E");
        list.add("F");
        list.add("D");
        list.add("C");
        list.add("A");
        list.add("F");
        list.add("A");
        list.add("D");

        System.out.println("Исходный массив:");
        System.out.println(list);

        System.out.println("Уникальные элементы в массиве:");
        HashSet set = new HashSet(list);
        System.out.println(set);

        Iterator<String> iterator1 = set.iterator();

        while (iterator1.hasNext()) {
            int sum = 0;
            String str = iterator1.next();
            for (int i = 0; i < list.size(); i++) {
                String str1 = list.get(i);
                if (str1.equals(str)) {
                    sum++;
            }
            }
            System.out.println(str + " встречается в тексте " + sum + " раз");
        }

    }

}
