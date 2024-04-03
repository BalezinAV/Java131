package Lesson18.collection3;
import java.util.Vector;
public class Main { // 18.03.24 -1- 1.12 Переходим в пакет collection3
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Сергей");
        vector.add("Михаил");
        vector.add("Николай");
        vector.add("Виктор");
        System.out.println(vector); // Можем вызывать список через имя самого списка. Обычные массивы такого делать на могут
        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
        System.out.println(vector.get(1));
        vector.remove(2);
        System.out.println(vector);
        // В векторе не могут выполняться одновременно два действия. Идет блокировка элемента на момент выполнения действия.
    }

}
// LIFO - стек ласт ин фест аут (последним пришел, первым вышел - сверху стопки)
