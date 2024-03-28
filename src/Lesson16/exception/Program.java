package Lesson16.exception;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        int a = 0;
        int b = 0;
        try {
            a = getNumber("Введите первое число");
            b = getNumber("Введите второе число");
        }catch (NumberFormatException e){
            System.out.println("Одно или оба значения не корректны");
        }


        System.out.println("Результат: " + (a + b));
    }

    public static int getNumber (String massage) throws NumberFormatException{ // Так мы потенциально сообщаем, что может выброситься исключение. И передаем обязанность по его обработке вышестоящему методу.
        Scanner input = new Scanner(System.in);
        System.out.print(massage + ": ");
        String s = input.nextLine();

        return Integer.parseInt(s);
    }
}
// Можно создать класс с искелючениями, которые не предусмотренны программаой.
// Переходим в пакет dog 06.03.24 -1- 0.43
