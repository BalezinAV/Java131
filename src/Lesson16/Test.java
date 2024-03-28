package Lesson16;

public class Test {
    public static void main(String[] args) {
        try {
            compute(1);
            compute(20);
            compute(5); // Так как эта строка после строки с исключением, то мы ее не сможем вывести.
        } catch (NewException e){
            System.out.println("Перехваченное исключение. " + e);
        }
        System.out.println("Код дальше"); // этот код мы увидим, так как он за пределами отрабатываемых исключений.
//        compute(5); // За пределами обработки, этот метод не будет работать.
    }

    public static void compute(int a) throws NewException{
        System.out.println("Вызыван метод compute(" + a + ")");
        if (a > 10){
            throw new NewException(a, "Какое-то сообщение");
        }
        System.out.println("Нормальное завершение");
    }
}

class NewException extends Exception{
    private int detail;

    public NewException(int detail, String message) { // Конструктор. Поменяли местами переменные, чтобы с начала выводилось число, а потом сообщение.
        super(message);
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "NewException(detail = " + this.detail + ", massage = " + getMessage() + ")"; // getMessage можем вызвать так как мы наследуемся от Exception
    }
}
// Задача 06.03.24 -2- 0.37 переходим в класс sample 2