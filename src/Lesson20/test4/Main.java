package Lesson20.test4;

import java.util.stream.Stream;

public class Main {// Переходим в пакет тест 4 01.04.24 -2- 0.35
// Объединение потоков
    public static void main(String[] args) {
        Stream<String> people1 = Stream.of("Виктор", "Екатерина", "Дмитрий");
        Stream<String> people2 = Stream.of("Александр", "Виктория", "Дмитрий");

        Stream.concat(people1, people2).distinct().forEach(n -> System.out.println(n)); // Удалили повтарения
        // Вернулись в тест2
//        Stream.concat(people1, people2).forEach(n -> System.out.println(n));

//        Stream<Integer> numbers = Stream.of(-3, -2, -1, 0, 1, 2, 3, -4, -5);
//        numbers.sorted().dropWhile(n -> n < 0).forEach(n -> System.out.println(n)); // Пропускает элементы потока соответствующие условию пока не встретит элементы не соответствующие условию.
//        numbers.dropWhile(n -> n < 0).forEach(n -> System.out.println(n)); // Без сортировки выведет элементы не соответствующие условию, при этом выведет все что ест после тех элементов.
//        numbers.sorted().takeWhile(n -> n < 0).forEach(n -> System.out.println(n)); // Применили соретд и стало работать как филтр.
//        numbers.takeWhile(n -> n < 0).forEach(n -> System.out.println(n)); // filter даст все элементы по условию, а takeWhile берет пока выполняется условие.
//        numbers.filter(n -> n < 0).forEach(n -> System.out.println(n));
    }// ДЗ от 01.04.24 -2- 1.09
}
