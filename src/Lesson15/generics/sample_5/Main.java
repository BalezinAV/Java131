package Lesson15.generics.sample_5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Orange"));

        System.out.println("Исходный список чисел: " + numbers); // Так работает только с (ArrayList)
        ArrayList<Integer> reversedNumbers = reverseList(numbers);
        System.out.println("Перевернутый список: " + reversedNumbers);

        System.out.println("\nИсходный список цыветов: " + colors);
        ArrayList<String> reversedWords = reverseList(colors);
        System.out.println("Перевернутый список: " + reversedWords);
    }

    public static <T> ArrayList<T> reverseList(ArrayList<T> originalList){ // 1й Т - обощенные методы. 2й Т - типы данных. 3й Т - приходит ArrayList
        ArrayList<T> reversedList = new ArrayList<>();

        for (int i = originalList.size() - 1; i >= 0 ; i--) {
            reversedList.add(originalList.get(i)); // Индексы не работают, есть метод (get). Это особенность ArrayList.
        }
        return reversedList;
    }
} // Обощенные конструкторы sample_6 04.03.24 -1- 1.04
