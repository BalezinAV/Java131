package Lesson18.collection2;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Collections;
import java.util.ListIterator;

public class Main {
    // ЛинкедЛист. Есть ссылка на предыдущий и следующий элемент.
    // переходим в пакет collection2 13.03.24 -2- 1.12
    public static void main(String[] args) {
        Student st1 = new Student("Viktor", 2);
        Student st2 = new Student("Anna", 3);
        Student st3 = new Student("Irina", 1);
        Student st4 = new Student("Igor", 3);
        Student st5 = new Student("Roman", 2);
        LinkedList<Student> stLL = new LinkedList<>();
        stLL.add(st1);
        stLL.add(st2);
        stLL.add(st3);
        stLL.add(st4);
        stLL.add(st5);
        System.out.println("LinkedList = " + stLL);
        System.out.println(stLL.get(2)); // Индексы присваиваются в том порядке, в котором мы добавляем в массив.

        // от 18.03.24
        Student st6 = new Student("Maria", 2);
        Student st7 = new Student("Sergey", 1);
//        stLL.add(st6);
//        stLL.add(1, st7);
        stLL.addFirst(st6);
        stLL.addLast(st7);
//        System.out.println("LinkedList = " + stLL);
        Student st8 = new Student("Vlad", 3);
        stLL.set(1, st8); // Метод заменяет элемент по указанному индексу.
//        stLL.remove(3);
//        stLL.removeFirst();
//        stLL.removeLast();
        System.out.println("LinkedList = " + stLL);

//        for (Student student : stLL) {
//            System.out.println(student);
//        }
//
//        for (int i = 0; i < stLL.size(); i++) {
//            System.out.println("Элементы по индексу " + i + ": " + stLL.get(i));
//        }
//
//        // Работа с Итератором
////        Iterator it = stLL.listIterator(2); // Можно указать с какого именно индекса можно использовать элементы.
//        Iterator it = stLL.descendingIterator(); // Разворачиваем в обратную сторону.
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }
//
//        Object first_element = stLL.getFirst(); // Привели к боолее высокому типу данных. Любой класс наследуется от Object не явным образом
//        System.out.println("Первый элемент: " + first_element);
//        Object last_element = stLL.getLast();
//        System.out.println("Последний элемент: " + last_element);

//        stLL.clear(); // очищаем список
//        System.out.println("LinkedList = " + stLL);
//
//        System.out.println("Пустой ли список?: " + stLL.isEmpty());

//        Collections.swap(stLL, 0, 2); // Меняем местами
//        System.out.println("LinkedList = " + stLL);

        Iterator it = stLL.listIterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("=================================");

        ListIterator<Student> listIterator = stLL.listIterator();
        System.out.println("Итерация прямого направления: ");
        while (listIterator.hasNext()){
            System.out.println("Index = " + listIterator.nextIndex() + ", Element = " + listIterator.next());
        }

        System.out.println("Итератор в обратном направлении: ");
        while (listIterator.hasPrevious()){
            System.out.println("Index = " + listIterator.nextIndex() + ", Element = " + listIterator.previous());
        }
    }
} // 18.03.24 -1- 0.51 переходим в класс Program

class Student{
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student('name=" + this.name + ", course=" + this.course + "')";
    }
} // ДЗ 30 на ArrayList от 13.03.24 -2- 1.24