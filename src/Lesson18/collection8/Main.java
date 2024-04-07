package Lesson18.collection8;

import java.util.LinkedHashSet;

public class Main { // Перпеходим в пакет collection8
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(7);
        lhs.add(3);
        lhs.add(1);
        lhs.add(4);
        lhs.add(9); // Сохранились в том порядке, в котором мы создали
        System.out.println(lhs); // вызватьт по индексу не получится
        lhs.remove(4); // Удаляем по значению
        System.out.println(lhs.contains(4));
        System.out.println(lhs.contains(3));
        System.out.println(lhs.removeIf(x -> x > 5)); // Удаление с условием
        System.out.println(lhs);
    } // Задача. Продолжить 20.03.24 -2- 0.25 пакет cities
}
