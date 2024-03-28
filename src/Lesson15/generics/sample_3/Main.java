package Lesson15.generics.sample_3;

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Averege<Integer> integerAverege = new Averege<>(intArray);
        System.out.println("Среднее арифметическое для Integer: " + integerAverege.average());

        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Averege<Double> doubleAverege = new Averege<>(doubleArray);
        System.out.println("Среднее арифметическое для Double: " + doubleAverege.average());
    }
}

class Averege<T extends Number>{ // Наследуемся от чисел, то есть будут приниматься только числа
    private T[] array;

    public Averege(T[] array) { // Конструктор с одним принимаемым аргументом.
        this.array = array;
    }

    public double average(){
        double sum = 0;
        for (T value : this.array) { // array это элементы наших массивов
            sum += value.doubleValue(); // Приводим к вещественному числу.
        }
        return sum / array.length;
    }
} // 04/03/24 -1- 0.27 новый пакет sample_4
