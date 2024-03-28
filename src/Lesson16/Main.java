package Lesson16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) { //Лекция от 06.03.24
        Scanner input = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        String first = input.nextLine();
        System.out.print("Введите второе число: ");
        String second = input.nextLine();

        int a = 0; // Нужно присвоить значение, для того, чтобы мог отрабоать try - catch
        int b = 0;

        try {
            a = Integer.parseInt(first); // Преобразовывем к int.
            b = Integer.parseInt(second);
        } catch (NumberFormatException e){
            System.out.println("Одно или оба значения не корректны");
        } finally {
            System.out.println("Результат: " + (a + b));
        }

    }
} // Задача. 06.03.24 -1- 0.18 - пакет exeption
