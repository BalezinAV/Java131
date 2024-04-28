package Lesson20.test5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {// Переходим в пакет тест5 03.04.24 -1- 0.12

    public static void main(String[] args) {
        ArrayList<Phone> phones = new ArrayList<>();
        phones.addAll(Arrays.asList(
                new Phone("Pixel 2", 500),
                new Phone("iPhone X", 600),
                new Phone("Nokia", 150),
                new Phone("iPhone 8", 450)
        ));
//        Phone min = phones.stream().min(Phone::compare).get();
//        Phone max = phones.stream().max(Phone::compare).get();
//        System.out.printf("MIN: name = %s, price = %d usd %n", min.getName(), min.getPrice());
//        System.out.printf("MAX: name = %s, price = %d usd %n", max.getName(), max.getPrice());

        // Вернулись из тест 4. Преобразуем элементы в меп
        Map<String, Integer> phoneMap = phones.stream().collect(Collectors.toMap(p -> p.getName(), t -> t.getPrice()));
        phoneMap.forEach((k, v) -> System.out.println(k + ": " + v));
    } // возвращаемся в тест2
}

class Phone{
    private String name;
    private int price;

    public Phone(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
    public static int compare (Phone p1, Phone p2){
        if (p1.getPrice() > p2.getPrice()){
            return 1;
        } // compare для сортировки текущих элементов
        return -1;
        // Возвращаемся в тест 4
        // Переходим в пакет лессон 21. Работа с файлами, потоки ввода и вывода.
    }
}