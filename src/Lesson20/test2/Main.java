package Lesson20.test2;

import java.util.*;
import java.util.stream.Stream;

public class Main {// Переходим в пакет тест2 01.04.24 -2- 0.10

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // вернулись из тест 4
//        Stream<String> phoneStream = Stream.of("iPhone X", "Nokia 9", "Huawei Nexus 6P", "Samsung Galaxy S8", "LG G6");
////        phoneStream.skip(1).forEach(n -> System.out.println(n));
//        phoneStream.skip(1).limit(2).forEach(n -> System.out.println(n)); // Часто исползуются вместе. skip - удалает количество элементов. limit- возвращает не более заданнго количества

        // Взяли для примера с конца документа
        List<String> phones = new ArrayList<>();
        phones.addAll(Arrays.asList("iPhone X", "Nokia 9", "Huawei Nexus 6P", "Xiaomi MI6", "Samsung Galaxy S8", "LG G6", "ASUS Zenfone 3", "Sony Xperia Z5", "Meizu Pro 6", "Pixel 2"));
        System.out.println(phones);

        boolean any = phones.stream().anyMatch(s -> s.length() > 10);
        System.out.println(any);
        boolean all = phones.stream().allMatch(s -> s.length() > 10);
        System.out.println(all);
        boolean non = phones.stream().noneMatch(s -> s.length() < 2);
        System.out.println(non);

//         Optional<String> first = phones.stream().findFirst();
//        System.out.println(first.get());
////        System.out.println(first);
//        Optional<String> any = phones.stream().findAny();
//        System.out.println(any.get());

//        int pageSaze = 3;
//        while (true){
//            System.out.print("Введите номер страницы: ");
//            int page = input.nextInt();
//            if (page < 1){
//                break;
//            }
//            phones.stream().skip((page - 1) * pageSaze).limit(pageSaze).forEach(s -> System.out.println(s));
//        }



//        List<String> phones = new ArrayList<>();
//        Collections.addAll(phones, "iPhone X", "Nokia 9", "Huawei Nexus 6P", "Xiaomi MI6", "Samsung Galaxy S8", "LG G6", "ASUS Zenfone 3", "Sony Xperia Z5", "Meizu Pro 6", "Pixel 2");
//
//        System.out.println(phones); // При сортировке не учиывается регистр. Сортируется по коду символа. Данный метод моржет не всегда подходить.
//        phones.stream().filter(p -> p.length() < 12).sorted().forEach(s -> System.out.println(s));
    } // Переходим в пакет тест 3 01.04.24 -2- 0.20
    // ДЗ от 01.04.24 -2- 1.09
}
