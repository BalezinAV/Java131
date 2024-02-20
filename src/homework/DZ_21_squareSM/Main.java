package homework.DZ_21_squareSM;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Площадь треугольника по формуле Герона: %.1f%n", DZ_21_Balezin_squSM.trianGre(3, 4, 5));
        System.out.printf("Площадь треугольника через основание и высоту: %.1f%n", DZ_21_Balezin_squSM.triangHs(6, 7));
        System.out.printf("Площадь квадрата: %.1f%n", DZ_21_Balezin_squSM.square(7));
        System.out.printf("Площадь прямоугольника: %.1f%n", DZ_21_Balezin_squSM.rect(2, 6));
        System.out.println("Количестов подсчетов площали: " + DZ_21_Balezin_squSM.count);

    }
}
