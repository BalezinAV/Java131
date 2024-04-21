package Lesson20.test1;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Main { // Переходим в пакет test1 01.04.24 -1- 1.14
    public static void main(String[] args) {
//        Map<String, Integer> ages = new HashMap<>();
//        ages.put("Виктор", 30);
//        ages.put("Марина", 25);
//        ages.put("Роман", 40);
//        ages.put("Сергей", 35); // Сами значения складывать не можем, нужно преобразовать в числа.

//        int result = ages.entrySet().stream().filter(entry -> entry.getValue() > 30).mapToInt(entry -> entry.getValue()).sum();
//        System.out.println(result);
        // Возвращаемся в ноутбук стрим.

        //Задача. Нужно из значений Стримоф полчить чередование с той же буквой в нижнем регистре.
        Stream.of("A", "B", "C").flatMap(s -> Stream.of(s, s.toLowerCase())).forEach(System.out::print);
    } // Переходим в пакет тест2 01.04.24 -2- 0.10
}
