package Lesson18.collection4;

public class Main {// 18.03.24 -2- 0.0 переходим в пакет collection4
    public static void main(String[] args) {
        System.out.println("main start");
        method3();
        System.out.println("main end");
    }
    static void method1(){
        System.out.println("method_1 start");
        System.out.println("method_1 end");
    }
    static void method2(){
        System.out.println("method_2 start");
        method1();
        System.out.println("method_2 end");
    }
    static void method3(){
        System.out.println("method_3 start");
        method2();
        System.out.println("method_3 end");
    }
}
// 18.03.24 -2- 0.6 Переходим в класс Program