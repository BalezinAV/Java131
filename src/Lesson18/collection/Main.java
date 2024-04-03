package Lesson18.collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Iterator;

public class Main { // 13.03.24 -2- 0.0 переходим в новый пакет Lesson 18. Динамические структуры данных
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Валерий");
        arrayList1.add("Ирина");
        arrayList1.add("Игорь");
        System.out.println(arrayList1); // [Валерий, Ирина, Игорь]

//        ArrayList<String> arrayList2 = new ArrayList<>(20); // Выделяем память под первоначальное количество элементов
//        arrayList2.add("Валерий");
//        arrayList2.add("Ирина");
//        arrayList2.add("Игорь");
//        System.out.println(arrayList2.size());
//        System.out.println(arrayList2);
//
//        List<String>arrayList3 = new ArrayList<>(); // Можно использовать List
//        arrayList3.add("Валерий");
//        arrayList3.add("Ирина");
//        System.out.println(arrayList3);
//
//        ArrayList<String> arrayList4 = new ArrayList<>(arrayList1);
//        System.out.println(arrayList4);
//        arrayList4.add("Владимир");
//        System.out.println(arrayList4); // Смотрим, внесли ли изменения.
//
//        ArrayList arrayList5 = new ArrayList<>(); // Без указания типа ланных массива, в массив можно добавлять любой тип, не используюя дженерик
//        arrayList5.add("Валерий");
//        arrayList5.add(7);
//        arrayList5.add(true);
//        arrayList5.addAll(arrayList1); // Добавили другой массив, другого типа данных
//        System.out.println(arrayList5);

        ArrayList<String> arrayList6 = new ArrayList<>();
        arrayList6.add("!!!");
        arrayList6.add("???");

//        arrayList6.addAll(arrayList1);
//        System.out.println(arrayList6); // Объединили массивы одного типа данных

        arrayList6.addAll(1, arrayList1); // Можем указать позицию в массиве (индекс)
        System.out.println(arrayList6);

        // Удаление элементов
//        arrayList1.set(2, "Александр");
//        System.out.println(arrayList1);
//        arrayList6.removeAll(arrayList1);
//        System.out.println(arrayList6);

        // Оставляем элементы, которые есть в другом массиве
//        arrayList6.retainAll(arrayList1);
//        System.out.println(arrayList6);

        // Берем какую-то чсасть (по индексам)
//        List<String> myList = arrayList6.subList(0, 3); // от 0 до 3 не включая третий.
//        System.out.println(myList);
//        myList.add("Борис");
//        System.out.println(myList);
//        System.out.println(arrayList6);

        // Преобразование в простой массив
//        String[] array = arrayList6.toArray(new String[8]);
//        String[] array = arrayList6.toArray(new String[0]); // При преобразовании можно задать меньшую длинну, при этом сам массив не сократится, ничего не произойдет.
//        for (String s : array) {
//            System.out.print(s + " ");
//        }
//        System.out.println("\n" + array.length);

//        Collections.sort(arrayList6); // Сортирует - сперва спец-символы
//        Collections.shuffle(arrayList6); // Перемешает случайным образом
//        Collections.reverse(arrayList6); // Развернуть
//        Collections.swap(arrayList6, 0, 2); // Меняем элементы местами
//        System.out.println(arrayList6);

        // Итератор
        Iterator<String> iterator = arrayList6.iterator();
//        while (iterator.hasNext()){ // Цикл работает, пока существует следющий элемент.
//            System.out.print(iterator.next() + " ");
//        }
        // Удаление элементов
        while (iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }
        System.out.println(arrayList6);

        // ЛинкедЛист. Есть ссылка на предыдущий и следующий элемент.
        // переходим в пакет collection2 13.03.24 -2- 1.12

    }
}
