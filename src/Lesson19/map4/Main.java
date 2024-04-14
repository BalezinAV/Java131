package Lesson19.map4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main { // Лекция от 27.03.2024 Переходим в пакет map4
    public static void main(String[] args) { // Работа в повторяющимися элементами.
        ArrayList<String> words = new ArrayList<>(Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple"));
        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word : words) { // в word будут попадать значенния из words. 1я итерация: "apple" -> null
            wordCount.compute(word, (key, count) -> count == null ? 1 : count + 1); // word - текущее значение ключа, key, count - придуманные имена. тернарный: еслди count == null, то ему будем присваивать значение 1, иначе  + 1, то есть просто будем увеличивать на единицу, после того как он станет 1.
//            Integer count = wordCount.get(word); // 6 итерации => 6 значений. Когда count пытаемся поллучить по ключу "apple", так как значений нет, то выводится null.
//            System.out.println(count); // выводим count при каждой итерации.
//            wordCount.put(word, count == null ? 1 : count + 1); // 1й элемент попадет в ключ, второй в значение.
        } // {"apple" = 2 - ключ повторился и count увеличился, "banana" = 2 - ключ повторился и count увеличился, "orange"=1}
        System.out.println(wordCount);
    }
} // Задача 27.03.24 -1- 0.26 преходим в класс PhoneBook
