package Lesson15.generics.sample_6;

public class Main {
    public static void main(String[] args) {
        Digit d1 = new Digit(10); //  Пока передать не можем.
        Digit d2 = new Digit(10.5); // Хотим передать любые значения.
        Digit d3 = new Digit(10.5f);

        System.out.println(d1.value + " " + d2.value + " " + d3.value);

    }
}

class Digit {
    public double value;

    //    public Digit(double value) { // Контсруктор. Все величины приведены к double
//        this.value = value;
//}
    public <T extends Number> Digit(T value) {
        this.value = value.doubleValue(); //

    }
}// Обобщенный интерфес sample_7 04.03.24 -1- 1.17
