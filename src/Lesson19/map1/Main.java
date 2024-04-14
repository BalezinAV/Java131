package Lesson19.map1;

import java.util.HashMap;
import java.util.Map;

public class Main { // ХашМэп. переходим в пакет lesson19/map1 - Main. 25.03.24 -1- 1.03
    public static void main(String[] args) {
        // Map - способ хранения данных. ХэшМэп. Сопоставления ключей значений. Хранение элементов по хешкоду.
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(334455, "Михаил Борисов"); // Передается ключ, потом элемент
        map1.put(778899, "Ринат Зуев");
        map1.put(443366, "Роман Свиридов");
        map1.put(225577, "Анна Полякова");
        System.out.println(map1);
////        map1.put(884466, "Анна Полякова"); // Разные ключи могут хранить одинаковые значения.
////        map1.put(334455, "Ирина Мельник"); // Ключ перезапишется на последнее значение.
//        map1.putIfAbsent(334455, "Ирина Мельник"); // Ключ перезапишется на последнее значение.
//        map1.putIfAbsent(334466, "Ирина Мельник"); // Ключ перезапишется на последнее значение.
////        map1.put(null, "Ирина Мельник");
////        map1.put(779944, null);
//        System.out.println(map1);
//        System.out.println(map1.get(778899));
//        System.out.println(map1.get(778800)); // Можем обратиться к несуществуещему ключу и получим null
//        map1.remove(443366); // Удаляется и ключ и значение. Удалить можно только по ключу.
//        System.out.println(map1);
        System.out.println(map1.containsValue("Роман Свиридов")); // Проверка на значение
        System.out.println(map1.containsValue("Валентин Свиридов"));
        System.out.println(map1.containsKey(225577)); // Проверка на ключ.
        System.out.println(map1.containsKey(225566));

        System.out.println(map1.keySet()); // Списко всех ключей в переменной
        System.out.println(map1.values()); // Списко всех значений в переменной

    } // Переходим в пакет map2 -2- 25.03.24
}
