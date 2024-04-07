package Lesson18.collection4;
import java.util.Stack;
public class Program {// 18.03.24 -2- 0.6 Переходим в класс Program
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Катя");
        stack.push("Виктор");
        stack.push("Игорь");
        stack.push("Михаил");
        System.out.println(stack);
//        System.out.println(stack.pop()); // Удаляем элемент, помещенный последним (вверху стопки)
//        System.out.println(stack);
//        while (!stack.isEmpty()){ // Пока стек не пустой
//            System.out.println(stack.pop()); // Удаляем по одному
//            System.out.println(stack);
//        }
//        System.out.println(stack.get(1)); // Получить значение по индексу.
//        System.out.println(stack.set(1, "Лиза"));
        stack.set(1, "Лиза");
        System.out.println(stack);
    }
}// Переходим к пакет compar 18.03.24 -2- 0.16
// Comparable - Интерфейс. Позваляет выполнить естественную сортировку на основе какого-либо свойства
// Comparator - наследует от Интерфейсас и позваоляет выполнять по любому количеству свойств (полей).
