package homework;
import java.util.Arrays;
public class DZ_10_Balezin_mass_2D {
    public static void main(String[] args) {
        //ДЗ от 20.12.2023. Случайным образом заполнить двумерный массив, размером 6х6 цифрами от 0 до 11 и одинарный массив 6 чисел.
        //Нужно четные строки двумерного массива заменить одномерным.
        int n = 6;
        int[] even = new int[6];
        for (int i = 0; i < n; i++) {
            even[i] = (int) (Math.random() * 11);
        }
        int[][] mas = new int[n][n];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                mas[i][j] = (int) (Math.random() * 11);
            }
            System.out.print(Arrays.toString(mas[i]) + "\n");
        }
        System.out.println();
        System.out.println("Массив на замену четных строк:\n" + Arrays.toString(even));
        System.out.println();
        for (int i = 0; i < 6; i++){
            if (i %2 != 0) {
                mas[i] = even;
            }
            for (int j = 0; j < 6; j++){
            }
            System.out.print(Arrays.toString(mas[i])+ "\n");
        }
    }
}
