package Lesson18.collection7;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

public class Program {// Переходим в класс program 20.03.24 -1- 1.21
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>();
        Student st1 = new Student("Виктор", 5);
        Student st2 = new Student("Герман", 3);
        Student st3 = new Student("Ольга", 1);
        Student st4 = new Student("Ирина", 4);
        Student st5 = new Student("Михаил", 2);
        treeSet.add(st1); // Не понятно как должна происходить сортировка. То есть нужно определить способ сортировки.
        treeSet.add(st2);
        treeSet.add(st3);
        treeSet.add(st4);
        treeSet.add(st5);
        System.out.println(treeSet);
//        System.out.println(treeSet.first());
//        System.out.println(treeSet.last());
//        Student st6 = new Student("Алена", 3);
//        treeSet.add(st6);
//        System.out.println(treeSet.headSet(st6)); // Выведем элементы меньше заданного. Заданные значения не включаются.
//        System.out.println(treeSet.tailSet(st6)); // Выведем элементы больше заданного или равны указанному элементу.
//        Student st7 = new Student("Игорь", 2);
//        Student st8 = new Student("Владимир", 4);
//        System.out.println(treeSet.subSet(st7, st8)); // Вернет с начальной позиции до конечной, не включительно.

        System.out.println("=======================");
        Iterator<Student> iterator = treeSet.iterator();
        while (iterator.hasNext()){ // пока есть следующий элемент
            System.out.println(iterator.next()); // будем выводить итератор некст
        }
        System.out.println("=======================");

        Iterator<Student> iterator2 = treeSet.descendingIterator(); // вывести в обратном порядке
        while (iterator2.hasNext()){ // пока есть следующий элемент
            System.out.println(iterator2.next()); // будем выводить итератор некст
        }
        System.out.println("=======================");

    }
}

class Student implements Comparable<Student> {
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student(name '" + name + "', cours=" + course + ")";
    }

    @Override
    public int compareTo(Student o) { // Нужно переопределить метод, в соответствии с которым будет происходить сортировка.
        return this.course - o.course;
    }
} // Перпеходим в пакет collection8