package Lesson20.test4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {// Переходим в пакет тест 4 01.04.24 -2- 0.35
// Объединение потоков
    public static void main(String[] args) {
//        Stream<String> people1 = Stream.of("Виктор", "Екатерина", "Дмитрий");
//        Stream<String> people2 = Stream.of("Александр", "Виктория", "Дмитрий");
//
//        Stream.concat(people1, people2).distinct().forEach(n -> System.out.println(n)); // Удалили повтарения
        // Вернулись в тест2
//        Stream.concat(people1, people2).forEach(n -> System.out.println(n));

//        Stream<Integer> numbers = Stream.of(-3, -2, -1, 0, 1, 2, 3, -4, -5);
//        numbers.sorted().dropWhile(n -> n < 0).forEach(n -> System.out.println(n)); // Пропускает элементы потока соответствующие условию пока не встретит элементы не соответствующие условию.
//        numbers.dropWhile(n -> n < 0).forEach(n -> System.out.println(n)); // Без сортировки выведет элементы не соответствующие условию, при этом выведет все что ест после тех элементов.
//        numbers.sorted().takeWhile(n -> n < 0).forEach(n -> System.out.println(n)); // Применили соретд и стало работать как филтр.
//        numbers.takeWhile(n -> n < 0).forEach(n -> System.out.println(n)); // filter даст все элементы по условию, а takeWhile берет пока выполняется условие.
//        numbers.filter(n -> n < 0).forEach(n -> System.out.println(n));
        // ДЗ от 01.04.24 -2- 1.09

        // Лекция от 03.04.24 Продолжаем Стрим

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(5,4,8,7,6,1,2,3));
        //        Optional<Integer> min = numbers.stream().min(Integer::compare); // Создаем поток, находим минимальное и сортируем при помощи "compare"
//        Optional<Integer> max = numbers.stream().max(Integer::compare); // Создаем поток, находим минимальное и сортируем при помощи "compare"
////        System.out.println(min);
//        if (min.isPresent() || max.isPresent()){
//            System.out.println(min.get()); // Вывод без "Optional"
//            System.out.println(max.get());
//        }else {
//            System.out.println("Список пуст");
//        }
        // Переходим в пакет тест5 03.04.24 -1- 0.12

        // Перешли из тест5
//        Optional<Integer> result = numbers.stream().reduce((x, y)-> x * y);// перемножили все, что есть в списке.
//        Optional<Integer> result = numbers.stream().reduce((x, y)-> x + y); // сложили все.
////        Optional<Integer> result = numbers.stream().reduce((x, y)-> x - y);
////        Optional<Integer> result = numbers.stream().reduce((x, y)-> x / y); // сложили все.
//        System.out.println(result.get());
//// переменную нужно преобразовать в поток при помощи stream(), чтобы можно было использовать методы.
//        Stream<Integer> num = Stream.of(5,4,8,7,6,1,2,3);
//        Optional<Integer> res = num.reduce((x, y)-> x + y); // x5+y4 -> x9+y8 -> x17+y7->...=36
//        System.out.println(res.get());

//        Stream<String> wordStream = Stream.of("Язык", "программирования", "Java");
////        Optional<String> sentence = worddStream.reduce((x, y) -> x +" "+ y);
//        String sentence = wordStream.reduce("Результат", (x, y) -> x +" "+ y);
//        System.out.println(sentence);

// Задача. Вернуть кол-во символов в виде значений
        int sum = Stream.of("Язык", "программирования", "Java")
                .map(s -> s.length())//[4, 16, 4]
                .reduce(0, Integer::sum);//[4+16+4] 0- для инициализации и значения по умолчанию. Или через лябда, тогда не нужен 0.
        System.out.println(sum);
// возвращаемся в тест2
    }
}
