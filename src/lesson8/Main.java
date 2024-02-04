package lesson8;

import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Исключения. Лекция 15.01.2024 часть 2 (1.42)
//        try {
//            System.out.print("Введите первое число: ");
//            int a = input.nextInt();
//            System.out.print("Введите второе число: ");
//            int b = input.nextInt();
//            System.out.println(a / b);
//        } catch (InputMismatchException | ArithmeticException e){ // Объединили исключения.
//            System.out.println("Вы ввели не целое число или делить на 0 нельзя");
//        } finally { // Эот блок отработает в любом случае.
//            System.out.println("Конец программы");
//        }
//        } catch (InputMismatchException e){ // e - Эксепшен. Можно выводить либо нет. Но (e) или любой другой символ обязательно должен быть написан.
//            System.out.println("Вы ввели не целое число");
//        } catch (ArithmeticException e){
//            System.out.println("Делить на 0 нельзя");
//        }

        // Исключения в массиве
//        try { // try без catch бфть не может!
//            int[] numbers = new int[3];
//        numbers[4] = 9;
//    } catch (ArrayIndexOutOfBoundsException e){
//            System.out.println(e);
//            System.out.println("Введен некорректный индекс");
//        }

        //Задача факторриал 5! = 1*2*3*4*5;
//        int res = getFactorial(-5);
//        System.out.println(res);
//    }
//    public static int getFactorial(int num){
//        int res = 1;
//        try {
//            if (num < 1){
//            throw new Exception("Число меньше 1 указывать нельзя");
//            }
//            for (int i = 1; i <= num; i++) {
//            res *= i;
//        }
//    } catch (Exception e){
//            System.out.println(e.getMessage());
//            res = num;
//        }
//        return res;
//    } // End public


    }
}
