package Lesson15.generics;

public class Program {
    public static void main(String[] args) {
        // Обобщенный класс отлилчается тем, что у него будут параметры.
//        Point<Integer> pt = new Point<Integer>(); // Старая версия записи
        Point<Integer, String> pt = new Point<>(1, 2, "point_1"); // Создали экземпляр класса. После создания конструктора нужно ввести значения переменных.
//        pt.x = 10; // С вещественным числом работать не будет.
//        pt.y = 20;
//        System.out.println(pt.x + " " + pt.y);
        System.out.println(pt.getId() + ": " + pt.getX() + " " + pt.getY()); // Так как privet - выводим через геттер

        Point<Double, Integer> pt2 = new Point<>(10.5, 20.6, 1); // Создали экземпляр класса
//        pt2.x = 15.7;
//        pt2.y = 30.5;
//        System.out.println(pt2.x + " " + pt2.y);
        System.out.println(pt2.getId() + ": " +  pt2.getX() + " " + pt2.getY()); // Так как privet - выводим через геттер
    }
}

class Point<T, V>{ // Добавили переменную.
    //    public T x, y; // Т - это обощенный тип и он не привязывается к типу данных. Тип данных указывается при создании экземпляра класса.
    private T x, y; // Изменили модификатор доступа. Теперь нужны геттеры и сеттеры
    private V id;
    public Point(T x, T y, V id) { // Конструктор. После добавления V это конструктор на 3 парметра.
        this.x = x;
        this.y = y;
        this.id = id;
    }

    public T getX() { // геттер
        return x;
    }

    public T getY() { // геттер
        return y;
    }

    public V getId() {
        return id;
    }
} // Задача 28.02.24 -2- 0.33 в дженерике пакет семпл_1
