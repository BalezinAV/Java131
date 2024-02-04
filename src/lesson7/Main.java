package lesson7;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // Рекурсия. Лекция от 15.01.2024
        // Start main
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("На каком Вы этаже: ");
//        int n1 = input.nextInt(); // 5 4 3 2 1
//        elevator(n1); // После ввода номера этажа вызывается метод. // после 5 будет 4 и до 1 (n - 1).
//    } //End main. Start public.
//    public static void elevator(int n){
//        if (n == 0){ // Идет проверка (5 == 0? НЕТ). Это базовый случай работы с рекурсией.
//            System.out.println("Вы в подвале");
//            return; // Так как тип возвращаемого значения void, то мы ничего не возвращаем. Эта функция прирывает работу метода и мы попадаем в последний println. Выходим из рекурсии.
//        }
//        System.out.println("=> " + n); // Если этаж != 0, то метод запускается снова и снова.
//        elevator(n - 1); // Вызов той же функции (Рекурсия). Это переменнаая в которую вносим изменения.
//        System.out.print(n + " "); // Сюда мы придем толлько после того как дойдем до "0". Выведятся 1,2,3,4,5. Потому что данные сохранились в "стеке" (условно они сохраняются с верху в низ (в столбик), то есть если первая была 5, а последняя 1, то выводиться они будут в обратном порядке.
//    } //End public.

        // Продолжить часть 1 (0.19) Задача.
// Задача. Массив.
//        int[] mas = {1, 3, 5, 7, 9};
//        System.out.println(sumList(mas)); // Что бысюда осуществлялся вывод, нудно чтобы это было возвращаемое значение, то есть нужен retern.
//    } //End main. Start public.
//    public static int sumList(int[] arr){
//        int sum = 0;
//        for (int i: arr) {
//            sum += i;
//        }
//        return sum;
//    } //End public.

        // Тот же метод с рекурсией.
//        int[] mas = {1, 3, 5, 7, 9};
//        System.out.println(sumList(0, mas)); // 0 будет попадать в каку-то переменную и мы его будем использовать чтобы уменьшать наши элементы.
//    } //End main. Start public.
//    public static int sumList(int i, int[] arr) { // (i=0,1,2,3 []=1, 3, 5, 7, 9)
//        if (i == (arr.length - 1)){ // 0 == 4, 1 == 4, 2 == 4, 3 == 4, 4 == 4 - заходим в if. (arr.length - 1) - это всегда длинна массива в индексах (от 0 до 4 = 5 индексов).
//            return arr[i]; // i - это индекс. Когда зашли в if, то arr[i] = 9 оно тоже попадает в стек.
//        }
//        return arr[i] + sumList(i + 1, arr); // arr[i] = 1[0] + 3[1] + 5[2] + 7[3] + 9[4]
//    } //End public.

        // Задача. Конвертация чисел с одним методм. Рекрсия.
//        System.out.println(toStr(254, 2)); // 254, 16
//    } //End main. Start public.
//    public static String toStr(int n, int base){ // (25, 10), (2, 10); (254, 16) (15 , 16)
//        String[] convert = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
//        if (n < base) { // n(254) < base(10) false, 25 < 10 false, 2<10 true; 254 < 16 false 15 < 16 true
//            return convert[n]; // convert[2]="2"; convert[15]="F",
//        } else {
//            return toStr(n / base, base) + convert[n % base]; // convert[4]="4" строка, convert[5]="5", "4" + "5" + "2" - конкатенация. convert[14]="E" => "F" + "E".
//        }
//    } //End public.

        // ДЗ (1.06 часть 1)С использованием рекурсии. Вычислить количество отрицательных чисел в массиве. [-2, 3, 8, -11, -4, 6] (n=3).

        //Задача. Программа. Пункты меню.
        // Start main
        int size;
        System.out.print("Введите размер массива: ");
        size = input.nextInt();
        int[] list = new int[size];
        int option;
        do {
            System.out.println("Меню:");
            System.out.println("1. Ввод элементов массива");
            System.out.println("2. Отображение массива");
            System.out.println("3. Поиск элемента в массиве");
            System.out.println("4. Сортировка массива");
            System.out.println("5. Выход");
            System.out.print("Сделайте свой выбор: ");
            option = input.nextInt();

            switch (option) {
                case 1: // Вывод элементов массива
                    readArray(list);
                    break;
                case 2: // Отображение массива
                    displayArray(list);
                    break;
                case  3: // Поиск элементов в массиве (ищем индекс)
                    System.out.print("Введите элемент, который вы хотите найти: ");
                    int item = input.nextInt();
                    int index = searchArray(list, item); // Cюда приходит индекс.
                    if (index == -1) {
                        System.out.println("Элемент не найден");
                    }else {
                        System.out.println("Элемент найден на позиции " + index);
                    }
                    break;
                case 4: // Сортировка массива. Пузырьковая - обмен местами слева на право рядом стоящие объекты.
                    System.out.println("Отсортированный массив: ");
                    sortArray(list);
                    displayArray(list);
                    break;
            }
        } while (option != 5); // Пока не != 5 цикл будет идти по кругу.
    }

    public static void readArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("-> ");
            array[i] = input.nextInt();
        }
    }//End public.

    public static void displayArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }//End public.
    public static int searchArray(int [] array, int data){ // Возвращаем индекс
        for (int i = 0; i < array.length; i++) {
            if (array[i] == data){ // 9 == 7 false...7==7 true
                return i; // Это индекс [3]
            }
        }
        return  -1; // Если ни разу не сработает for.
    }//End public.
    public static void sortArray(int [] array){
        for (int i = 0; i < array.length - 1; i++) { // [8, 6, 7] i=0, i<3=> [6,8,7]=>[6,7,8]; i < array.length - 1=> i<2
            for (int j = 0; j < array.length - i - 1; j++) { // j=0, j<3; j=1; j=2; j < array.length - i - 1=> j<2
                if (array[j] > array[j + 1]){ //
                    int temp = array[j]; // 8
                    array[j] = array[j + 1]; // 6, 7
                    array[j + 1] = temp; // 8
                }
            }
        }
    }//End public.
} // Часть 2 15.01.24. (0.35 - пузырьковая сортировка)

