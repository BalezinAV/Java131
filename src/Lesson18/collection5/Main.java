package Lesson18.collection5;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Collections;

public class Main { // 18.03.24 -2- 1.10 переходим пакет collection5
    //Set - набор уникальных значений.

    public static void main(String[] args) {
//        Set<String> set = new HashSet<>();
//        set.add("Валерий");
//        set.add("Николай");
//        set.add("Григорий");
//        set.add("Александр");
//        set.add("Александр"); // Будут добавлены только уникальные значения.
//        System.out.println(set); // В набор не вошел повторяющийся элемент. При добавлении метод сам выполняет сортировку.
//         // так происходит из-зи того, что данные хранятся в хештабличке. Хеши получают независимо от нас.
//        // Геттеров здесь нет.
//        for (String s: set) {
//            System.out.println(s);
//        }
//        set.add(null);
//        System.out.println("=======");
//
//        set.remove("Александр"); // Чтобы удалить элемент, нужно обратиться по значению элемента.
//        for (String s: set) {
//            System.out.println(s);
//        }
//        System.out.println(set.size());
//        System.out.println(set.contains("Александр")); // Обращаемся по имени элемента (false)
//        System.out.println(set.contains("Григорий")); // true
        // ДЗ 31 от 18.03.24 -2- 1.21 ЛинкедЛист.

        // Лекция от 20.03.24
//        Set<Integer> a = new HashSet<>(); // Можно сет, можно хешсет
//        Set<Integer> b = new HashSet<>();
//
//        a.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
//        b.addAll(Arrays.asList(5, 6, 7, 8, 9));
//
//        System.out.println(a);
//        System.out.println(b);
//
//        HashSet<Integer> union = new HashSet<>(a);
//        System.out.println(union);
//        union.addAll(b); // Провели операцию объединения.
//        System.out.println(union); // Теперь храним только уникальные элементы. Дубликаты не попали.
//
//        HashSet<Integer> interset = new HashSet<>(a); // Хотим сделать пересечение из двух сетов.
//        interset.retainAll(b);
//        System.out.println(interset); // Вернули значения, которые повторялись в двух сетах.
//
//        HashSet<Integer> substract = new HashSet<>(a);
//        substract.removeAll(b); // разность элементов. Останутся те, которые есть в первом, но нет во втором.
//        System.out.println(substract);
        // Продолжить 20.03.24 -1- 0.15 Задача
        // Задача на хешсет
//        Set<Integer> num = new HashSet<>();
//        num.add(21);
//        num.add(54);
//        num.add(24);
//        num.add(43);
//        num.add(31);
//        System.out.println(num);
//
//        Integer max = null;
//        for (Integer item : num) {
//            if (max == null) {
//                max = item;
//            }
//            else if (max < item){
//                max = item;
//            }
//        }
//        System.out.println("Максимальное значение: " + max);
//        System.out.println("Минимальное значение: " + Collections.min(num));

        int[] arr = {2, 5, 2, 7, 8, 8, 10};
        System.out.println("Исходный массив: " + Arrays.toString(arr));
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        System.out.println(set);
        int[] uniqueArr = new int[set.size()];
        int i = 0;
        for (int num: set){
            uniqueArr[i++] = num;
        }

        System.out.println("Массив без дубликатов: " + Arrays.toString(uniqueArr));

    } // Переходим в пакет collection6 20.03.24 -1- 0.46
}
