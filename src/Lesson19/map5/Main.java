package Lesson19.map5;

import java.util.TreeMap;

public class Main { // 27.03.24 -1- 1.09 переходим в пакет map5
     // TreeMap - хранится по ключу и сортируется по возрастанию ключа.
     public static void main(String[] args) {
         TreeMap<String, String> fileExtensions = new TreeMap<>();
         fileExtensions.put("Python", "*.py");
         fileExtensions.put("C++", "*.cpp");
         fileExtensions.put("JavaScript", "*.js");
         fileExtensions.put("Goland", "*.go");
         fileExtensions.put("Java", "*.java");
         fileExtensions.put("java", "*.java");

         System.out.println(fileExtensions);
// Продолжить 27.03.24 -2-
     }
}
