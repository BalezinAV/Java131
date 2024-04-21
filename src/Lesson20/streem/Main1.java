package Lesson20.streem;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main1 {// Переходим Main 1 Задача Лекция от 01.04.24 -1-
// Дан массив аргументов, нужно получить Мап, где каждому ключу будет соответствовать свое значение. Нечетный-ключь, четный-значение.
    public static void main(String[] args) {
        String[] arguments = {"one", "first", "two", "second", "three", "third", "four", "fourth", "five", "fifth"};
        Map<String, String> aMap = new LinkedHashMap<>(arguments.length / 2);
        for (int i = 0; i < arguments.length; i += 2) {
        aMap.put(arguments[i], arguments[i + 1]);
        }
        System.out.println(aMap);
        aMap.forEach((key, value) -> System.out.printf("%s: %s%n", key, value));
    } // Возвращаемся в Майн 01.04.241 -1- 0.17
}
