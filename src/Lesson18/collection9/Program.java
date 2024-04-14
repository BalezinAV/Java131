package Lesson18.collection9;

import java.util.ArrayDeque; // Двунаправленная очередь. Получаем доступ либо с конца, либо с налчала.

public class Program {// Переходим в класс Program 25.03.24 -1- 0.44

    public static void main(String[] args) {
        ArrayDeque<String> states = new ArrayDeque<>();
        states.add("red"); // В конец списка
        states.addFirst("blue"); // начало
        states.push("white"); // начало
        states.addLast("green");
        states.add("black"); // в конец списка
        System.out.println(states);

        System.out.println(states.getFirst());
        System.out.println(states.getLast());
        System.out.println(states.size());

        while (states.peek() != null){ // метод берет первый элемент
            System.out.println(states.pop()); // Метод, который удаляет элементы
        }
        System.out.println(states);
    }
}// ХашМэп. переходим в пакет lesson19/map1 - Main. 25.03.24 -1- 1.03
