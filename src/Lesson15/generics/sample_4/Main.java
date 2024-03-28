package Lesson15.generics.sample_4;

public class Main {
    public static void main(String[] args) {
        Short ar[] = {1, 2, 3, 4};
        Short val = 4; // Это тип данных (Short)
//        Integer ar[] = {1, 2, 3, 4};
//        Integer val = 4;
        boolean flIn = Math.<Short>isIn(val, ar); // Мы можем явным образом указывать тип данных (<Short>), которые могут приниматься
        System.out.println(flIn);
    }
}

class Math{
    public static <T> boolean isIn(T val, T[] ar){ // Будет принмать любой тип данных и массив любого типа данных
        for (T v : ar){ // <T> это обощенный тип данных, без него класс не будет принимать никакие типы данных.
            if (v.equals(val)){
                return true;
            }
        }
        return false;
    }
} // Задача 04.03.24 -1- 0.40 новый пакет sample_5
