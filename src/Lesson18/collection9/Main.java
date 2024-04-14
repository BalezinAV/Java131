package Lesson18.collection9;

import java.util.Comparator;
import java.util.PriorityQueue; // Однонаправленная очередь

public class Main { // Лекция от 25.03.24
    // Коллеция Queue - первым пришел, первым ушел. Принцип двунаправленного списка. Это обычная очередь.
    public static void main(String[] args) {
//        PriorityQueue<Integer> tasks = new PriorityQueue<>();
//        tasks.add(5);
//        tasks.add(1); // Чем меньше число, тем выше приоритет.
//        tasks.add(9);
//        tasks.add(2);
//        tasks.add(3);
//        tasks.add(3);
//        System.out.println(tasks);

//        while (!tasks.isEmpty()){
////            System.out.println(tasks.poll()); // poll() - метод удаления
//            System.out.println(tasks.remove()); // remove() - метод удаления. Будет выбрасывать исключение елси ничего нет.
//        }
//        System.out.println(tasks);
//        System.out.println(tasks.poll());
////        System.out.println(tasks.remove());
//        System.out.println(tasks.peek()); // Возвращает начало очереди
//        System.out.println(tasks.element()); // Возвращает первый элемент
        // Работа со строковыми значениями
//        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
//        PriorityQueue<String> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(String::length)); // Делаем сортировку и возвращаем числовое значение. Длинну преобразуем в строковое значение.
//        // При такой записи мы находим длинну строкового значения и тепер данные будут удаляться по количеству символов (по длине строки).
//        priorityQueue.add("Игорь");
//        priorityQueue.add("Александр");
//        priorityQueue.add("Андрей");
//        System.out.println(priorityQueue); // Строковые значения сохраняются по неконтролируемой сортировке.
//         while (!priorityQueue.isEmpty()){
//             System.out.println(priorityQueue.remove());
//         } // Удаление по алфавите с самого меньшего кода символа к самому большему.

        //Задача 0.18
        int[] nums = {3, 1, 4, 1, 5, 9, 2, 6};
        int k = 1;

        int largest = findLargest( nums, k);
        System.out.println(k + " Самый большой элемент: " + largest);
        k = 2;

        int largest2 = findLargest( nums, k);
        System.out.println(k + " Самый большой элемент: " + largest2);

    }

    public static int findLargest(int[] num, int n){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int m : num) {
            minHeap.add(m); // [3, 1(удалили), 4, 5, 9, 2, 6]
            if (minHeap.size() > n){ // 1 > n, 2 > n
                minHeap.poll();
            }
        }
        return minHeap.peek(); // Возвращаем верхушку
    } // Переходим в класс Program 25.03.24 -1- 0.44
}
