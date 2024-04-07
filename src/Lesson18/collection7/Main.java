package Lesson18.collection7;

import java.util.Set;
import java.util.TreeSet;

public class Main {// Перехолдим в пакет collection7 20.03.24 -1- 1.13

    public static void main(String[] args) {
//        Set<Integer> treeSet = new TreeSet<>();
//        treeSet.add(15);
//        treeSet.add(10);
//        treeSet.add(28);
//        treeSet.add(83);
//        treeSet.add(30); // Сохранится в порядке возрастания
//        System.out.println(treeSet);
//        treeSet.remove(9);
//        System.out.println(treeSet);
//        System.out.println(treeSet.contains(28));
//        System.out.println(treeSet.contains(9));

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("c");
        treeSet.add("a");
        treeSet.add("b"); // Сохранит в порядке алфавита
        System.out.println(treeSet);

    } // Переходим в класс program 20.03.24 -1- 1.21
}
