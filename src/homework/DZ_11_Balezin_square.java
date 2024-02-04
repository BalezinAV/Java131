package homework;
import java.util.Scanner;

public class DZ_11_Balezin_square {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //ДЗ от 25.12.2023
        //Вычислить площадь фигур. Пользователь выбирает фигуры. 1 - треугольник, 2 - прямоугольник, 3 - круг. После выбора фигуры, пользователь должен ввести стороны или радиус.

        System.out.print("Выберите фигуру для ввода данных и расчета площади.\nТреугольник -> 1\nПрямоугольник -> 2\nКруг-> 3\nВведите число: ");
        int enter = input.nextInt();
                if (enter == 1) {
                System.out.print("Считаем треугольник по методу Герона.\nВведите сторону А: ");
                int a = input.nextInt();
                System.out.print("Введите сторону B: ");
                int b = input.nextInt();
                System.out.print("Введите сторону C: ");
                int c = input.nextInt();
                int per = (a + b + c) / 2;
                System.out.printf("Площадь треугольника = %.1f", Math.sqrt(per * (per - a) * (per - b) * (per - c)));
            } else if (enter == 2) {
                System.out.print("Считаем прямоугольник.\nУкажите сторону A: ");
                int a = input.nextInt();
                System.out.print("Укажите сторону B: ");
                int b = input.nextInt();
                System.out.println("Площадь прямоугольника = " + (a * b));
            } else if (enter == 3) {
                System.out.print("Считаем площадь круга\nЗадайте радиус R: ");
                int r = input.nextInt();
                System.out.printf("Площадь круга = %.1f", Math.PI * (Math.pow(r, 2)));
            } else {
                System.out.println("Извините, нет такой фигуры. Читаем условия еще раз.");
            }

    }
}
