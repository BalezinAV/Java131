package homework;

public class DZ_17_2_Balezin_d {
    public static void main(String[] args) {
        // ДЗ Введите количество символов: 5 (Побитовые операторы) чет нечет.
        int[] number = {5, 2, 3, 4, 5};
        for (int i = 0; i < number.length; i++) {
            if ((number[i] & 1) == 0) { // number % 2 == 0; У четного числа последний бит 0, у нечетного 1
                System.out.print(0 + "\t");
            }
            if ((number[i] & 1) == 1) { // number %2 == 1; Так тоже можно проверить на нечетность.
                System.out.print("X" + "\t");
            }
        }
    }
}
