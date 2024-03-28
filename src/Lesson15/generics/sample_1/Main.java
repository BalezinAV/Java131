package Lesson15.generics.sample_1;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        PrintList<Integer> pl = new PrintList<>();
//        System.out.println(pl);
        for (int i = 10; i < 50; i++) { // size = 10; после стало size = 40;
            pl.add(i); // добавим элементы обощенного типа данных
        }
        pl.printList(false);
        System.out.println();
        pl.printList(true);

        PrintList<String> pl2 = new PrintList<>();
        pl2.add("a");
        pl2.add("b");
        pl2.add("c");
        pl2.add("d");
        pl2.add("e");
        pl2.add("f");
        System.out.println();
        pl2.printList(false);
        System.out.println();
        pl2.printList(true);
    }
}

class PrintList<T>{
    private ArrayList<T> list;
    public PrintList(){ // Конструктор без принимаемых аргументов
        this.list = new ArrayList<T>(); // Массив не имеет определенных значений.
    }

    public void add(T data){
        list.add(data); // Добавляем элементы в список
    }

    public void printList(boolean isOdd){ // Для решения задачи нужно проверить на чтеность или нечетность. Добавляем параметр boolean.
        int size = this.list.size(); // Это вспомогательная переменная. Длинна устанавливается в строке 9
        if (isOdd){
            for (int i = 1; i < size; i+= 2) { // Проверка на нечетность
                System.out.print(list.get(i) + " ");
            }
        } else {
            for (int i = 0; i < size; i += 2) { // Проверка на четность
                System.out.print(list.get(i) + " ");
            }
        }
    }
} // 28.02.24 -2- 0.59 новый пакет семпел2
