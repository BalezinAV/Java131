package Lesson19.map3;


import java.util.HashMap;
import java.util.Map;

public class Main { // Как формируется хешкод. Формируется ассоциативыный массив, в котором элементы с одинаковым хешкодом хранятся как двухсвязный список линкедлист.
    public static void main(String[] args) {
        HashMap map = new HashMap<>();
        map.put(new Key("Виталий"), 20);
        map.put(new Key("Александр"), 30);
        map.put(new Key("Виталий"), 40);
        map.put(new Key("Александра"), 25);
        System.out.println("==============");
        System.out.println("Значение для ключа Александр: " + map.get(new Key("Александр")));
        System.out.println("Значение для ключа Виталий: " + map.get(new Key("Виталий")));
        System.out.println("Значение для ключа Александра: " + map.get(new Key("Александра")));
//        map.put(new Key("Виталий"), 20);
//        System.out.println("Значение для ключа Виталий: " + map.get(new Key("Виталий")));

//        Map<Integer, String> map2 = new HashMap<>(16, 0.75f); // 16 * 0,75 = 12 - хешмеп будет увеличен в 1,5 раза
    }
}

class Key{
    String key;

    public Key(String key) {

        this.key = key;
    }

    @Override
    public int hashCode() {
        int hash = key.charAt(0); // Это индекс.
        System.out.println("hashCode для ключа: " + key + " = " + hash); // Выводим hash по индексу 0
        return hash;
    }

//    @Override
//    public int hashCode() {
//        System.out.println("hashCode для ключа: " + hashCode());
//        return super.hashCode();
//    }


//
//    @Override
//    public boolean equals(Object obj) {
//        return key.equals(((Key) obj).key); // Будем преобразовывать к типу данных Key, obj который приходит и у него вызывать свойство key
//    } // Мы сравниваем ключ, который есть у нас с тем ключем у принимаемого элемента
} // ДЗ от 25.03.24 -2- 1.12
// Лекция от 27.03.2024 Переходим в пакет map4