package Lesson19.map4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook { // Задача 27.03.24 -1- 0.26 преходим в класс PhoneBook
    public static void main(String[] args) {
        HashMap<String, ArrayList<Integer>> bookPhone = new HashMap<>(); // Ключ строка, значения - список (аррей) типа интеджер
        addNumber("Зотов", 778899, bookPhone);
        addNumber("Зотов", 112233, bookPhone);
        addNumber("Калинкин", 449988, bookPhone);
        addNumber("Романов", 889922, bookPhone);
        addNumber("Зотов", 445577, bookPhone);
        addNumber("Калинкин", 116655, bookPhone);
        System.out.println(bookPhone); // пока пустой map {}
        printBook(bookPhone);
    }
// метод
    public static void printBook(HashMap<String, ArrayList<Integer>> map){
        for (Map.Entry<String, ArrayList<Integer>> item : map.entrySet()) { // так мы получаем доступ к ключам и к значениям
            String phones = ""; // ""
            int i = 0; // i = 0;
            for (int el : item.getValue()) { // Проходимся по спискам значений. Попадут все значения, которые относятся к ключу.
//                phones = phones + el + ", "; // phones = "" + 889922 + ", "
                phones = phones + el + (item.getValue().size() - 1 == i ? " " : ", "); // Убираем запятые в конце.
                i++;
            }
            System.out.printf("%s: %s %n", item.getKey(), phones);
        }
    }
    public static void addNumber(String key, int value, HashMap<String, ArrayList<Integer>> map){
        if (map.containsKey(key)){
            map.get(key).add(value); // в map получать ключ и добавлять к ключу значение value
        } else { // Чтобы в ключ папли все значения.
            ArrayList<Integer> list = new ArrayList<>(); //[778899]
            list.add(value); // [778899, ]
            map.put(key, list); // {"Зотов" = [778899, 112233]}
        }
    }
} // 27.03.24 -1- 1.09 переходим в пакет map5
