package Lesson19.map5;

import java.util.TreeMap;

public class Main { // 27.03.24 -1- 1.09 переходим в пакет map5
     // TreeMap - хранится по ключу и сортируется по возрастанию ключа.
     public static void main(String[] args) {
//         TreeMap<String, String> fileExtensions = new TreeMap<>();
//         fileExtensions.put("Python", "*.py");
//         fileExtensions.put("C++", "*.cpp");
//         fileExtensions.put("JavaScript", "*.js");
//         fileExtensions.put("Goland", "*.go");
//         fileExtensions.put("Java", "*.java");
//         fileExtensions.put("java", "*.java");
//
//         System.out.println(fileExtensions);


// Продолжить 27.03.24 -2-
         //        System.out.println(fileExtensions.get("Java"));
//        fileExtensions.remove("Goland");
//        System.out.println(fileExtensions);
//        var tree = fileExtensions.descendingMap(); // Это уже не тримап.
//        System.out.println("=tree=" + tree + "=tree=");
//        fileExtensions1 = fileExtensions.descendingMap(); // так не сделать.
//        System.out.println(fileExtensions.descendingMap()); // развернуть порядок - по убыванию
//        System.out.println(fileExtensions.lastEntry());
//        System.out.println(fileExtensions.firstEntry());

// Работа компоратора
//        TreeMap<String, String> fileExtensions = new TreeMap<>(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.compareTo(o1); // Переопределили элементы.
//            }
//        }); // Вложенный анонимный класс
//        TreeMap<String, String> fileExtensions = new TreeMap<>((o1, o2) -> o2.compareTo(o1));
         // Заменили на Лямбда выражение
         // Переопределили элементы и развернули так чтобы оставлся тримап
//        fileExtensions.put("Python", "*.py");
//        fileExtensions.put("C++", "*.cpp");
//        fileExtensions.put("JavaScript", "*.js");
//        fileExtensions.put("Goland", "*.go");
//        fileExtensions.put("Java", "*.java");
//        fileExtensions.put("java", "*.java");
//
//        System.out.println(fileExtensions);

         TreeMap<String, String> fileExtensions = new TreeMap<>(String.CASE_INSENSITIVE_ORDER); // Игнорирует регистр и убирает второе встреченное значение
         fileExtensions.put("Python", "*.py");
         fileExtensions.put("C++", "*.cpp");
         fileExtensions.put("JavaScript", "*.js");
         fileExtensions.put("Goland", "*.go");
         fileExtensions.put("Java", "*.java1"); // Ключ взялся первый, а значение второе
         fileExtensions.put("java", "*.java2");

         System.out.println(fileExtensions);
     } // Переходим в map6 класс Main 27.03.24 -2- 0.20
}

