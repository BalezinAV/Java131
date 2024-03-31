package Lesson17.test;

public class Program { //06.03.24 -2- 0.50 переходим в класс Program
    public static void main(String[] args) {
        int x = 5, y = 3;
//        CalcInterface sum = new Calculate();
//        CalcInterface sum = new CalcInterface(){
//            @Override
//            public void calculate(int a, int b) { // Метод, который принимал два аргумента
//
//                System.out.println(a + b);
//            }
//        }; // Это анонимный класс без какого-то имени.

//        CalcInterface sum = (a, b) -> System.out.println(a + b); // сократили при помощи лямбдовыражения.
//        sum.calculate(x, y); // Типы данных берутся из интерфейса. После (->) идет возвращаемое значение.

        // Лекция от 11.03.24 -1- Лямбда-выражения.
        // Перезапишем выражение
        CalcInterface sum = (a, b) -> a + b;
        int res = sum.calculate(x, y);
        System.out.println(res);

    }
}

interface CalcInterface{ // Для его реализации нужен класс наследник.
//    void calculate(int a, int b);
    int calculate(int a, int b); // Для работы с лябда-выражением заменим тип данных в методе. Чтбы сделать значение возвращаемым.
}

//class Calculate implements CalcInterface{ // Наследуемся от интерфейса для его рализации.
//    @Override
//    public void calculate(int a, int b) {
//        System.out.println(a + b);
//    }
//}
 // ДЗ 28 от 06.03.24 -2- 1.20