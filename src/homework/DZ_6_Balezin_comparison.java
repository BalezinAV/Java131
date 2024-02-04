package homework;
import java.util.Scanner;
public class DZ_6_Balezin_comparison {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //ДЗ 6. Вычислить среднее арифметическое целых, положительных значений, пока не введен "0".
        // Вывести максимум и минимум вводимых значений.
        int x, sum = 0;
        System.out.println("Введите число: ");
        x = input.nextInt();
        while (input.hasNextInt() && x > 0){
            //x = input.nextInt();
            sum += x;
            System.out.println("Сумма положительных значений = " + sum);
        }


        }
    }
