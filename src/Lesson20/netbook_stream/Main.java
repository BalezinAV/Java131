package Lesson20.netbook_stream;

import java.util.stream.Stream;

public class Main {// Переходим в пкет netbook_stream 01.04.24 -1- 0.57

    public static void main(String[] args) {
        Stream<Notebook> noteStream = Stream.of(
                new Notebook("ThinkPad", 40000),
                new Notebook("MacBook", 45000),
                new Notebook("Legion", 55000)
        );
        noteStream.flatMap(p -> Stream.of( // новый элемент флат мап. Возвращаемся в тест 1
                "Название: " + p.getName() + ", цена без скидки: " + p.getPrice(),  "название: " + p.getName() + ", цена со скидкой: " + (p.getPrice() - (int) (p.getPrice() * 0.1)))).forEach(s -> System.out.println(s));
//        noteStream.map(p -> "название: " + p.getName() + ", цена: " + p.getPice() * 2).forEach(s -> System.out.println(s));
//        noteStream.map(p -> p.getName()).forEach(s -> System.out.println(s));
//        noteStream.forEach(s -> System.out.println(s));
//        noteStream.filter(p -> p.getPice() < 50000).forEach(p -> System.out.println(p.getName()));
    } // Переходим в пакет test1 01.04.24 -1- 1.14
}

class Notebook{
    private String name;
    private int price;

    public Notebook(String name, int pice) {
        this.name = name;
        this.price = pice;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int pice) {
        this.price = pice;
    }
}