package homework.DZ_36_Balezin_arrStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;
public class Main {// ДЗ от 03.04.2024
    // ИЗ списка (ArrayList) найдите только те элементы, которые кратные четырем.
    // Умножьте каждый этот элемент на два и найдите сумму этих элементов.
    // [11, 20, 33, 45, 52]: 144
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> multipleArr = new ArrayList<>();
        arrayList.addAll(Arrays.asList(11, 20, 33, 45, 52));
//        System.out.println(arrayList);
        int sum = 0;
        int number;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 4 == 0){
//                System.out.print(arrayList.get(i) + " ");
                number =  arrayList.get(i) * 2;
                sum += number;
                multipleArr.add(arrayList.get(i));
            }
        }
//        System.out.println("\n" + arrayList + ": " + sum + "\n================");
//        System.out.println(multipleArr);

        Optional<Integer> numArr = multipleArr.stream().reduce((x, y) -> x*2 + y*2);
        System.out.println("\n" + arrayList + ": " + numArr.get());

    }
}
