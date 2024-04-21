package Lesson20.streem;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Main { // Streem API (Поток данных)
    public static void main(String[] args) {
//        Stream<String> cityStream = Arrays.stream(new String[] {"Сочи", "Москва", "Калининград"}); // Это паток данных состоящий из массива.
//        Stream<String> cityStream = Stream.of("Сочи", "Москва", "Калининград"); // Другой синтаксис
////        cityStream.forEach(s -> System.out.print(s + " ")); // Заменили обычный форич на метод с лямбдавыражением.
//        System.out.println(cityStream);
//        cityStream.forEach(System.out::println);// Добавить дополнительные параметры добавить не можем.
//        System.out.println();
//        IntStream intStream = Arrays.stream(new int []{1, 2, 3, 4, 5, 6, 7});
//        intStream.forEach(i -> System.out.print(i + " "));
//        System.out.println();
//        LongStream longStream = Arrays.stream(new long[]{108, 250, 3578, 47878, 545679, 632165, 7778});
//        longStream.forEach(i -> System.out.print(i + " "));
//        System.out.println();
//        DoubleStream doubleStream = DoubleStream.of(3.4, 6.7, 9.5, 8.564, 121);
//        doubleStream.forEach(i -> System.out.print(i + " "));
//        System.out.println();
//        double[] d = new double[]{1, 2, 3, 4, 5};
//        DoubleStream doubleStream1 = DoubleStream.of(d);
//        doubleStream1.forEach(i -> System.out.print(i + " "));
//    } // Переходим Main 1 Задача Лекция от 01.04.24 -1-
        // Возвращаемся в Майн 01.04.241 -1- 0.17
//        Stream<String> cityStream = Stream.of("Сочи", "Москва", "Калининград");
//        cityStream.filter(s -> s.length() >= 6).forEach(System.out::println); // forEach нужен для вывода элементов.

        //Задача. Посчитать элементы больше нуля.
//        int[] numbers = {-5, 0, 1, 2, 3, -4, 4, -3, -2, -1, 5};
//        int count = 0;
//        for (int i : numbers) {
//            if (i > 0) count++;
//        }
//        System.out.println(count);

//        long count = IntStream.of(-5, 0, 1, 2, 3, -4, 4, -3, -2, -1, 5).filter(w -> w > 0).count();
//        System.out.println(count);

        // Задача Подсчитать количество строк в списке, начинающихся с определенной буквы.
        List<String> colors = Arrays.asList("Красный", "Кремовый", "Синий", "Зеленый", "Коричневый", "Серый");
        System.out.println("Исходный список цветов: " + colors);
        char start = 'К';
        long ctr = colors.stream().filter(s -> s.startsWith(String.valueOf(start))).count();
        System.out.println("\nКоличество цветов, которые начинаются с '" + start + "': " + ctr);
        System.out.println("===");
        char start1 = 'С';
        long ctr1 = colors.stream().filter(s -> s.startsWith(String.valueOf(start1))).count();
        System.out.println("Количество цветов, которые начинаются с '" + start1 + "': " + ctr1);

    } // Переходим в пкет netbook_stream 01.04.24 -1- 0.57
}
