package Lesson17.sample;

public class Main {// 11.03.24 -1- 0.40 переходим в Main

    public static void main(String[] args) {
        //        Printable printer = s -> System.out.println(s);
//        printer.print("Hello, Java!"); // Нужно соблюдать порядок записи
        Printable printer = () -> System.out.println("Hello, Java!"); // Если метод ничего не возвращает и не принимает, то нужны ().
        System.out.println("Вторая строка");
        printer.print(); // Так как метод указан ниже, то "Hello, Java!" выведится второй строкой. Если нужно сдеать лямбда выражение из несткольких строк, но нужно заключить в {};
        // Пример в нескольок строк
        System.out.println("==========");
        Printable printer1 = () ->{
            System.out.println("Hello, Java!");
            System.out.println("Вторая строка с учетом корректной записи");
        }; // При этом вызываемый методт выносится за {};
        printer1.print();

    }
}

interface Printable{ // Если работаем в этмо документе для интерфейса указывать модификатор public не нужно.
    //    void print(String s);
    void print(); // Пример если ниченго не приходит. Нужны ()!
}
// 11.03.24 -1- 0.59 - переходим в Program

