package Lesson15.generics;

public class Main {
    // Generics.
    public static void main(String[] args) {
        Integer[] intArray = {2, 1, 5, 3, 5};
        Double[] doubleArray = {3.3 , 2.2, 1.1, 4.4};
        Character[] charArray = {'G', 'e', 'n', 'e', 'r', 'i', 'c'};
        // На прямую к массиву мы просто так обратиться не можем, чтобы вывести его значения. Можем вывести только код памяти.
        System.out.println("Это массив intArray содержит:");
        printArray(intArray);
        System.out.println("Это массив doubleArray содержит:");
        printArray(doubleArray);
        System.out.println("Это массив charArray содержит:");
        printArray(charArray);

    }
    public static <T> void printArray(T[] inputArray){ // Возвращает и принмает любой тип данных. Т - это универсальный параметр. Можно взять любую букву.
        for (T element: inputArray) { // С приметивными типами данных (int[] intArray) не работает. У любого примтивного типа данных есть класс - обертка.
            System.out.printf("%s ", element); // Вывели элементы массива с помощью одного и тогоже статического метода.
        } // int - это приметивный тип, Integer - не приметивный.
        System.out.println();
    }
} // 28.02.24 -2- 0.15 Обощенные класса. Новый класс програм
