package homework.DZ_27_Balezin_generic;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    // ДЗ от 04.03.24
    // Напишите одну универсальную функцию с именем printArray. Эта функция должна принимать в качестве параметров массив
    // общих элементов.
    //Результат:
    // Введите количество элементов массива: 3
    // -> 9; -> 5; -> 3
    // Введите количество элементов массива строк: 2
    // -> one; -> two
    // Массив: 9 5 3
    // Массив: one two

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Введите количество элементов числового массива: ");
        n = input.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.print(" -> ");
            array[i] = input.nextInt();
        }

        int s;
        System.out.print("Введите количество элементов массива: ");
        s = input.nextInt();
        String[] sArray = new String[s];
        for (int i = 0; i < sArray.length; i++) {
            System.out.print(" -> ");
            sArray[i] = input.next();
        }


        System.out.print("Массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        System.out.print("Массив: ");
        for (int i = 0; i < sArray.length; i++) {
            System.out.print(sArray[i] + " ");
        }
    }
}

//class Allarr<T>{
//    T[] arr;
//
//    public String printArray(){
//        T c;
//        System.out.print("Массив: ");
//        for (int i = 0; i < arr.length; i++) {
//            c = arr[i];
//        }
//        return c;
//    }
//}
