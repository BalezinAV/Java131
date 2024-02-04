package homework;
import java.util.Arrays;
public class DZ_13_Balezin_meth_mas_max {
    public static void main(String[] args) {
        // Напишите метод нахождения максимального числа из массива. Тестовые значения [3, 8, 9, 4, 1, 2, 5], [1, 2, 5].
        arrayMax(3, 8, 9, 4, 1, 2, 5);
        arrayMax(1, 2, 5);
    }
    public static void arrayMax(int... num){
                int max = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        System.out.println(num.length);
        System.out.println(Arrays.toString(num));
        System.out.println("Максимальный элемент массива: " + max);
    }
}
