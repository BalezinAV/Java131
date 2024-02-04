package homework;
import java.util.Scanner;
import java.util.Arrays;
public class DZ_8_Balezin_mass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Данн массив чисел (вводится пользователем). Выведите все элементы массива и элементы,
        // которые больше предыдущего.
        int n;
        System.out.print("Enter the length of the array, n = ");
        n = input.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Index " + i + " -> ");
            array[i] = input.nextInt();
                    }
        System.out.println("Input array " + Arrays.toString(array));
        System.out.print("Next maximum index ");
        int maxNext = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                maxNext = array[i];
                System.out.print(maxNext + "; ");
            }
         }

    }
}