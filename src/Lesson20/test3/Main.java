package Lesson20.test3;

import java.util.Comparator;
import java.util.stream.Stream;

public class Main {// Переходим в пакет тест 3 01.04.24 -2- 0.20
    // Соритруем при помощи компаратора
    public static void main(String[] args) {
        Stream<Phone> phoneStream = Stream.of(
          new Phone("Pixel 2", "Google", 500),
          new Phone("iPhone X", "Apple", 600),
          new Phone("Nokia", "HMD Global", 150),
          new Phone("iPhone 8", "Apple", 450),
          new Phone("Galaxy", "Samsung", 300)
        );

        phoneStream.sorted(new PhoneComparator()).forEach(p -> System.out.printf("%s (%s) -%d %n", p.getName(), p.getCompany(), p.getPrice()));
    }
}

class Phone{
    private String name;
    private String company;
    private int price;

    public Phone(String name, String company, int price) {
        this.name = name;
        this.company = company;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public int getPrice() {
        return price;
    }
}
class PhoneComparator implements Comparator<Phone>{
    @Override
    public int compare(Phone a, Phone b) { // компаратор для сравнения двух элементов по коду. В момент проверки мы все значения преобразовываем в верхний регистр.
        return a.getName().toUpperCase().compareTo(b.getName().toUpperCase()); // Нам нужно чтобы сравнение шло в одном регистре.
    } // Переходим в пакет тест 4 01.04.24 -2- 0.35
}
