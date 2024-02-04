package homework;

import java.util.Scanner;

public class DZ_4_Balezin_coins {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Написать слово "копеек" в правильном формате от 1 до 99. Ввод осуществляет пользователь.
        //Исключения 2-4 копейки; 5-20 копеек; 1, 21, 31, 41, 51, 61, 71, 81, 91 -копейка; 22-24, 32-34, 42-44,
        // 52-54, 62-64, 72-74, 82-84, 92-94 - копейки. Основное 25-30, 35-40, 45-50, 55-60, 65-70, 75-80, 85-90, 
        // 95-99 - копеек.
        int coinN;
        System.out.print("Введите количество копеек от 1 до 99: ");
        coinN = input.nextInt();
        if (coinN >= 1 && coinN <= 99) {
            if (coinN > 1 && coinN < 5) System.out.println("У вас " + coinN + " копейки");
            else if (coinN >= 5 && coinN <= 20) System.out.println("У вас " + coinN + " копеек");
            else if (coinN % 10 == 1 && coinN != 11) System.out.println("У вас " + coinN + " копейка");
            else if (coinN >= 22 && coinN <= 99 && coinN % 10 >= 2 && coinN % 10 <= 4) {
                System.out.println("У вас " + coinN + " копейки");
            } else {
                System.out.println("У вас " + coinN + " копеек");
            }

            } else {
                System.out.println("У вас больше копеек чем нужно.");
            }

        }
    }