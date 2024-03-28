package homework.DZ_27_Balezin_generic;
import java.util.Scanner;

public class DZ27otLectora {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Введите количество элементов числового массива: ");
        int n = input.nextInt();
        Integer[] intArray = new Integer[n];
        for (int i = 0; i < n; i++) {
            System.out.print("-> ");
            intArray[i] = input.nextInt();
        }
        System.out.print("Введите количество элементов массива строк: ");
        n = input.nextInt();
        String[] stringArray = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("-> ");
            stringArray[i] = input.next();
        }
        Printer<Integer> intPrinter = new Printer<>(); // Это экземпляр класса (intPrinter)
        Printer<String> stringPrinter = new Printer<>(); // Это экземпляр класса (stringPrinter)
        intPrinter.printArray(intArray); // У экземпляра класса вызываем метод.
        stringPrinter.printArray(stringArray);
    }

}
class Printer<E>{ // Либо T
    public static <E> void printArray(E[] generic) { // E[] - это массив. E && E[]!!!
        System.out.print("Массив: ");
        for (E element : generic) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
