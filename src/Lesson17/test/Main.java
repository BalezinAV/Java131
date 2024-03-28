package Lesson17.test;

public class Main {
    //Новая тема "Анонимные классы" 06.03.24 -2- 0.58
    public static void main(String[] args) {
        int x = 5, y = 3;
        Calc sum = new Calc();
        sum.calculate(x, y); // 8

        Calc mul = new Calc(){ // Это анонимный класс. При помощи него мы можем не создавать наследуемые классы для переопределения методов.
            // В () могут указываться параметры.
            @Override
            public void calculate(int a, int b) {
                System.out.println(a * b);
            }
        }; // как будь-то мы создали новый класс и переопределили метод.

//        CalcElse mul = new CalcElse(); // new CalcElse() - экземпляр класса
//        mul.calculate(x, y);
//        Calc mul = new CalcElse(); // Можно и так сделать. При этом метод который будет использован, будет взят из Класса, в котором создана переменная (new CalcElse())
        mul.calculate(x, y);
    }
}

class Calc{
    public void calculate(int a, int b){
        System.out.println(a + b);
    }
}

//class CalcElse extends Calc{
//    @Override
//    public void calculate(int a, int b) {
//        System.out.println(a * b); // Переопределили в дочернем классе и сделали произведение.
//    }
//}
// 06.03.24 -2- 0.50 переходим в класс Program