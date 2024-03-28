package Lesson15.generics.sample_2;

public class Main {
    public static void main(String[] args) {
        //        Point<Integer> pt = new Point<>(1, 2);
//
//        double max = pt.getMax();
//        System.out.println(max);
//
//        Point<Double> pt2 = new Point<>(1.2, 2.6);
//
//        double max2 = pt2.getMax();
//        System.out.println(max2);
        // 28/02/24 -2- 0.59

        // Лекция от 04.03.24

        Point<Integer> pt = new Point<>(1, 2); // Хотим сравнить данные
        Point<Double> pt2 = new Point<>(1.0, 2.0);

        System.out.println(pt.equalsPoint(pt2)); // Экземпляры класса разных типов данных. Для устронения несоответствия можно вместо (Т) поставить метасимвольный знак (?).
    }
}
// 28/02/24 -2- 0.59
class Point<T extends Number>{ // Number для того чтобы мы принимали только числа. Наследование от числовых типов данных
    public T x, y;

    public Point(T x, T y) { // Конструктор с параметрами
        this.x = x;
        this.y = y;
    }
    // Лекция от 04.03.24
    boolean equalsPoint(Point<?> pt){ // Теперь мы не привязаны к какому-либо типу данных.
        return this.x.doubleValue() == pt.x.doubleValue() && this.y.doubleValue() == pt.y.doubleValue();
    } // Задача 04.03.24 -1- 0.10. Среднее арифметическое пакет семпел 3
    // 28/02/24 -2- 0.59
    double getMax(){ // Метод
        double xd = this.x.doubleValue();
        double yd = this.y.doubleValue();
        return (xd < yd) ? yd : xd;
    }
} // ДЗ 28.02.24 -2- 1.16 на енам. Вывести скорость ТС.
