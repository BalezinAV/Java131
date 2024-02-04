package homework;
// Запрос данных пользователя с выводом на экран

import java.util.Scanner;

public class DZ_3_2_Balezin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your name?:_");
        String name = input.nextLine();
        System.out.print("How old are you?:_");
        int age = input.nextInt();
        input.nextLine(); // без этого код работает не корректно. Не дает ввести город. Пожалуйста, поясните почему так?
        System.out.print("Where are you live?:_");
        String live = input.nextLine();
        System.out.printf("This is %s%nIt is %d%nHe lives in %s", name, age, live);
        input.close();

    }
}
