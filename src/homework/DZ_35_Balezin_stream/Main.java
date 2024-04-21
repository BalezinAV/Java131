package homework.DZ_35_Balezin_stream;

import java.util.stream.Stream;

public class Main { // ДЗ 35 от 01.04.24
    // Написать программу, которая из значений Stream.of(3, 4, 2, 5, 1)
    // получит только три значения из середины, умноженных на два.
    // Результат: 8 4 10
    public static void main(String[] args) {
        Stream<Integer> arr = Stream.of(3, 4, 2, 5, 1);
//        arr.sorted().forEach(a -> System.out.print(a + " "));
//        System.out.println();
//        arr.forEach(a-> System.out.print(a + " "));
        arr.filter(a-> a > 1).skip(1).forEach(a-> System.out.print(a * 2 +" "));

    }
}
