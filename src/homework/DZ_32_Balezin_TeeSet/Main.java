package homework.DZ_32_Balezin_TeeSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;

public class Main {
    // ДЗ 32 от 20.03.24
    // Создайте программу, которая наполнит TreeSet 5-ю целыми числами с клавиатуры и выведет наименьший (последний по величине) элемент
    // 15, 7, 12, 9, 10
    // Результат: Наименьший элемент в TreeSet 7

    public static void main(String[] args) {
        System.out.println("Введите целое, положительное число:");
        Scanner input = new Scanner(System.in);
        TreeSet<Integer> num = new TreeSet<>();
        int x;
        for (int i = 0; i < 5; i++) {
            System.out.print("-> ");
            x = input.nextInt();
            num.add(x);
        }
        System.out.println(num);
        System.out.println("Наименьший элемент в TreeSet: " + num.first());

    }
}
