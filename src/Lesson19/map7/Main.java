package Lesson19.map7;
import java.util.Hashtable;
public class Main {// Переходим в мап 7 , класс майн 27.03.24 -2- 0.39
    public static void main(String[] args) {
        Hashtable<Integer, String> ht1 = new Hashtable<>(4, 0.75f); // 0.75f это размер таблици по умолчанию
        Hashtable<Integer, String> ht2 = new Hashtable<>(2, 0.5f); // Передали размер хеш таблици. Тем самым поменяли структуру и изменился вывод

        ht1.put(1, "one");
        ht1.put(2, "two");
        ht1.put(3, "three");

        ht2.put(4, "four");
        ht2.put(5, "five");
        ht2.put(6, "six");

        System.out.println("ht1 =" + ht1);
        System.out.println("ht2 =" + ht2);
    } // ДЗ от 27.03.24 -2- 0.48
}
