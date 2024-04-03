package homework.DZ_30_Balezin_ArrList;
import java.util.ArrayList;
public class Main {
    // ДЗ 30 от 13.03.24.
    // Написать программу, которая сгенерирует целочисленный список ArrayList на 10 элементов, состоящий из случайных значений от 0 до 100.
    // Найи минимальное, максимальное и среднее арифметическое значение из этого списка.
    // Для решения каждой из поставленных задач написать статические методы
    // Результат:
    //[53, 78, 40, 88, 13, 73, 92, 31, 43, 84]
    // Максимальный элемент: 92
    // Минимальный элемент: 13
    // Среднее арифметическое: 59,5

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add((int) (Math.random() * 100));
        }
        System.out.println(arrayList);

//        System.out.println("Длинна массива: " + arrayList.size());
        int maxArr = arrayList.get(0);
//        System.out.println(arrayList.get(0));
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) > maxArr){
                maxArr = arrayList.get(i);
            }
        }
//        System.out.println("Максимальный элемент: " + maxArr);

        int minArr = arrayList.get(0);
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) < minArr){
                minArr = arrayList.get(i);
            }
        }
//        System.out.println("Минимальный элемент: " + minArr + "\n");
//        System.out.println("Работа методов");

        System.out.println(MaxFind(arrayList));
        System.out.println(MinFind(arrayList));
        System.out.println(AvRg(arrayList));
    }

    public static int MaxFind (ArrayList<Integer> array){
        int maxArr = array.get(0);
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) > maxArr){
                maxArr = array.get(i);
            }
        }
        System.out.print("Максимальный элемент: ");
        return maxArr;
    }

    public static int MinFind(ArrayList<Integer> array){
        int minArr = array.get(0);
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) < minArr){
                minArr = array.get(i);
            }
        }
        System.out.print("Минимальный элемент: ");
        return minArr;
    }

    public static double AvRg(ArrayList<Integer> array){
        int sum = 0;
        double avereg;
        for (int i: array) {
            sum += i;
        }
        avereg = sum / (double) array.size();
        System.out.print("Среднее арифметическое: ");
        return  avereg;
    }
}
