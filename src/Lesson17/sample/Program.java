package Lesson17.sample;

public class Program {// 11.03.24 -1- 0.59 - переходим в Program
//    static int x = 10; // Чтобы можно было обратиться на прямую, мы выносим в область видимости класса, чтобы можно было обращаться без указания экземпляра
//    static int y = 20;

    public static void main(String[] args) {
//        int x = 10; // Теперь поместим переменные внутрь метода main
//        int y = 20; // Теперь переменные стали типа final и перезаписать их нельзя. Это особенность лямбда выражений. Все что в них используется определяется как константа.
//        int z = 40;
//        z = 50; // Так как (z) не используется в лямбда выражении, то эту переменную можно перезаписать.
////        Calc operation = () -> x + y; // В одну строку
//        Calc operation = () ->{ // в две строки и перезаписали переменную.
////            x = 30; // Переменная изменится только внутри выражения. За пределами выражения переменная (x) свеого значения не изменила.
////            z = 60; // Когда переменная (z) попала в лямбда выражение, она тоже не может быть перезаписана.
//            return x + y;
//        }; // Если бы были принимаемые аргументы, то перезаписать переменные можно.
////         x = 30;
//        System.out.println(x);
//        System.out.println(z);
//        System.out.println(operation.calculate());

        // Делаем более развернутый код.
//        Calc operation = (int x, int y) -> { // Можно и без int
//            if (y == 0){
//                return 0;
//            }else {
//                return x / y;
//            }
//        };
//        System.out.println(operation.calculate(20, 10));
//        System.out.println(operation.calculate(20, 0));
//        System.out.println(operation.calculate(3, 1));
//    }

        Calc<Integer> operation1 = (x, y) -> x + y; // Обязательно указываем тип данных с которым мы работаем.
        Calc<String> operation2 = (x, y) -> x + y;
        System.out.println(operation1.calculate(20, 10));
        System.out.println(operation2.calculate("Hello", "World"));
    }
}

interface Calc<T>{ // Усложняем код, добавляем Обобщенный (неопределнный) параметр <T>.
    T calculate(T x, T y); // Интерфейс принимает любые типы данных

//interface Calc{
//    double calculate(int x, int y); // Можно даже вместо int указать double

//interface Calc{
//    int calculate(); // При такой записи при реализации нужен return
}
// 11.03.24 -2- 0.06 переходим в пакет sample2

