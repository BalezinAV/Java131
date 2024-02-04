package lesson5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) { // Это метод.
//        Scanner input = new Scanner(System.in);
        // Создание методов. В Яве только методы. Лекция от 27.12.23 часть 2
        // Полная запись программы (hello).
        // Start main
//        hello("Irina");
//        hello("Igor");
//    } // End main. Start public.
//            public static void hello(String name){ // public - Это модификатор доступа в пределах класса и пакета.
//        // static - позволяет обращаться к имени метода. void - тип возвращаемого значения, используем для вывода на экран.
//                // Сейчас мы обратились к методу hello. String - тип переменной, name - ямя переменной. Это позволяет нам передать значение в метод.
//        System.out.println("Hello," + name + "!"); // Таким образом программа здоровается со всеми значениями переменной (name).
// } // End public.

        // Полная запись программы (getSum).
        // Start main
//        getSum(2, 5); // Вложили значения в метод.(147)
//        int a = 1; // Для работы метода, сперва назначаем переменные, потом указываем метод.
//        int b = 7;
//        getSum(a, b); // Теперь меняем значения переменных и получаем другую сумму.
//        int n1 = 3;
//        int n2 = 7;
//        getSum(n1, n2); // Когда метод создан, мы можем применть его для любых переменных. Ява понимает так: первый параметр записла в (a), второй в (b).
//    } // End main. Start public.
//    public static void  getSum(int a, int b){
//        System.out.println(a + b);
// } // End public.

        // Графика при помощи метода. Поллная запись программы.
        // Start main
//        symbolDraw(9, '+', '-');
//        symbolDraw(7, 'X', '0'); // Вызываем один и тотже метод с разными параметрами.
//} // End main. Start public.
//    public static void symbolDraw(int count, char a, char b) {
//for (int i = 0; i < count; i++){
//    if (i % 2 == 0){
//        System.out.print(a);
//        }else {
//        System.out.print(b);
//    }
//}
//        System.out.println();
//    }
//} // End public.

        // Метод для замены переменных. Палная запись программы.
        // Start main
//        int a = 30;
//        int b = 45;
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
//        swapFunction(a, b); // Это новая функция.
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
//    } // End main. Start public.
//    public static void swapFunction(int n, int m) { // Только в пределах этого метода будет работать наша функция.
//        System.out.println("n = " + n);
//        System.out.println("m = " + m);
//        int c = n;
//        n = m;
//        m = c;
//        System.out.println("-----------------");
//        System.out.println("n = " + n);
//        System.out.println("m = " + m);
//    } // End public.

//    Задача.Найти минимальное значение. Полная запись программы
//        Start main
//        int a = 11; // Передача данные происходит через метод (public static).
//        int b = 16;
//        int c = min(a, b); // Значение сохранится в месте вызова метода. Пересохранится в переменную (с) через (return).
//        System.out.println("Минимальное значение = " + c);
////        System.out.println(min); // Эта переменная за пределами метода не видна. Она не в области видимости. Так не работает.
//    } // End min. Start public
//    public static int min ( int n1, int n2){ // Это метод.
//            int min; // Не видна за его пределами.
//            if (n1 > n2) { // Переменные были инициализированны перед методом (public static).
//                min = n2;
//            } else {
//                min = n1;
//            }
//            return min; // Возвращаем переменную. Но за пределами метода ее не существует. Но ее значение сохранится в (c). Это ключевое слово.
//        }
//    } // End public

        // Задача. Написать функцию нахождения разности при a > b или суммы при a < b - вводится полбзователем.
        // Полная запись программы.
        // Start main.
//        Scanner input = new Scanner(System.in);
//        System.out.print("Введите а: ");
//        int a = input.nextInt();
//        System.out.print("Введите b: ");
//        int b = input.nextInt();
//        int c = func1(a, b);
//        System.out.println("Значение = " + c);
//    } // End main. Start public.
//            public static int func1(int n1, int n2) { // Задаем функцию нашему методу (func1). Тип (int) должент соответствовать типу, который возвращаем в (return).
//        // Внутри метода можно создавать любые переменные, но они видны будут только внудтри этого метода.
//        int res; // Можно без этой переменной.
//        if (n1 > n2) {
//            res = n1 - n2;
//        } else {
//            res = n1 + n2;
//        }
//        return res;
//    } // End public
//         Еще вариант.
//    public static int func1(int n1, int n2) { // Задаем функцию нашему методу (func1).
//    if (n1 > n2) {
//        System.out.println("Hello"); // А здесь вывод возможен.
//        return n1 - n2; // (return) прирывает выполнение программы и ниже нее мы не идем.
////        System.out.println("Hello"); // Здесь не сможем сделать вывод.
//    } else {
//        return n1 + n2; // Два (return) без условий быть не могут.
//    }
//    } // End public

// Задача.(83) Вывести куб всех чисел от 1 до 11. Сделать метод.
// Это в блоке (main).
//        for (int i = 1; i < 11; i++) {
//            System.out.println(i + " в кубе = " + cub(i));
//        }

    // Задача. Ввести треугольник заполненый цифрами. Эта часть блок (main).
//        printLine(1, 1); // Это вызов текущих элементов.
//        printLine(1, 2);
//        printLine(1, 3);
//        printLine(1, 4);
//        printLine(1, 5);
//        printLine(1, 4); // Разворачиваем.
//        printLine(1, 3);
//        printLine(1, 2);
//        printLine(1, 1);

    // Альтернатива
//        int n = 10;
//        for (int i = 1; i <= n; i++) {
//            printLine(1, i);
//        }
//        for (int i = n - 1; i > 0 ; i--) {
//            printLine(1, i);
//        }

    //Лекция от 10.01.2024. Методы.
    // () Методы с несколькими параметрами.
//        sum(1, 2, 3); // по сути это массив.
//        sum(1, 2, 3, 4, 5);
//        sum();
//        sum("Welcome", 20, 10);
//        sum(1, "Welcome", "20"); // // Вариант со тсроковыми значениями.Передать в (nums) не может так как это другой тип данных. Поменяли местами и убрали (...) у int.
////        sum("Hello World", 20, 10, 12); // Можно передать строковое без чисел, но числа без строкового нельзя. Так как у строкового значения мы не указали (...) (Только один раз и тольк у последнего значения.
//        sum(20, "Hello World", "a", "b"); // Вариант со тсроковыми значениями.Передать в (nums) не может так как это другой тип данных.

    //Задача. Написать метод принимающий произвольное количество целых чисел и возвращающий наибольшее положительное из них кратное 13.func_num(2,7,0,3,1,5,-13); // Вызов метода с заданными параметрами.
    // Start main.
    func_num(2,7,0,3,1,5,-13,13);
    func_num(26);
    func_num(99,99,100,34,-93);
    func_num(99,39,99,100,34);
//    func_num(); // При вервом варианте так работать не будет. Мы ничего не передаем, массива с элементами нет.
    } // End main. Start public.
//    public static void func_num(int... args) { // Это метод. Переменная (args) которая может принимать любое количество значений.
//        int max = args[0]; // Не нужно ссылаться на элемент массива, так как в случае если мы не передадим ничего, то будет ошибка.
//        for (int i : args) {
//            if (i % 13 == 0 && i > 0) {
//                max = i;
//            }
//        }
//        if (args[0] % 13 != 0 && max == args[0]) {
//            System.out.println("Число не найдено.");
//        } else {
//            System.out.println(max);
//        }
//    }
            // Еще вариант. Корректный.
    public static void func_num(int... args) { // Это метод. Переменная (args) которая может принимать любое количество значений.
    int max = -1; // По факту мы могли бы взять луюбое отрицательное число типа MinVolium.
    for (int i : args) {
        if (i % 13 == 0 && i > 0) {
            max = i;
        }
    }
    if (max != -1) { // Чтобы (-1) не выводился или любое другое значение его не перезаписало.
        System.out.println(max);
    } else {
        System.out.println("Число не найдено.");
    }
} // End public.

        // Задача. Метод, принимает произвольное значение чисел, вычисляет их среднее арифметическое и возвращает только те числа, которые меньше среднего арифметического.
        // Используем Arraylist.
//        System.out.println(bigrThanAvrg(1, 2, 3, 4, 5, 6, 7, 8, 9)); // Вариант от студента.
//        System.out.println(ch(1, 2, 3, 4, 5, 6, 7, 8, 9));
//        System.out.println(ch(3, 6, 1, 9, 5));

//    } // Заканчивается блок (main). Начинается блок метод.

    // Задача. Ввести треугольник заполненый цифрами. Эта часть пишется после блока (main).
//    public static void printLine(int start, int end){
//        for (int i = start; i <= end; i++) {
//            System.out.print(i + "_"); // Для отображения пробелов, можно без него.
//        }
//        System.out.println();
//    }

    //Задача.(48) Вывести куб всех чисел от 1 до 11. Сделать метод. После блока (main).
//    public static int cub(int a){
//        return a * a * a;
//    }

// ДЗ от 27.12.2023 Найти площадь фигуры. Написать метод. 1-прямоугольник, 2-треугольник, 3-круг. На каждую площадь сделать отдельный метод.
// Выбор фигуры будет в (main). Преусмотреть ошибку ввода если фигуры не существует.

// Лекция от 10.01.2024. Методы.
// Методы с несколькими параметрами. (75)
//    public static void sum(String massage, int...nums){ // (...) - 3 точки (только один раз и не важно для какого типа данных, позволяет не передавать количество значений. Можем передавать скольок угодно. Считаем сумму любого количества элементов.
//    public static void sum(int nums, String... massage){ // Вариант со тсроковыми значениями.
//        System.out.println(massage); // Это массив. и выведится индекс памяти. Типа что-то недоделано. Нужен другой способ вывода.
//        int res = 0;
//    for(int n: nums){
//        res += n;
//    }
//        for (String s: massage){ // Чтобы было понятно, что хранится в методе.
//            System.out.println(s);
//        }
//        System.out.println(res); // Так как нам ничего не нужно возвращать, делаем вывод здесь. Посчитался как суммы массивов.
//    }


// (92) Задача. Метод, принимает произвольное значение чисел, вычисляет их среднее арифметическое и возвращает только те числа, которые меньше среднего арифметического.
    // Используем Arraylist.
//    public static ArrayList ch(int... args){
//        ArrayList<Integer> mas = new ArrayList<>();
//        int sum = 0; // Либо указать сразу (double).
//        int count = 0;
//        double averege = 0;
//        for (int i: args) {
//            sum += i;
//            count += 1;
//        }
//        averege =  sum / (double) count; // Явное преобразование типов.
//        System.out.println("Среднее арифметическое: " + averege);
//        for (int i : args) {
//            if (i < averege){
//                mas.add(i);
//            }
//        }
//        return mas;
//    }
    // Еще вариант. (от судента)
//    public static ArrayList bigrThanAvrg(int... arr) {
//        double avrg = 0;
//        ArrayList arr2 = new ArrayList<>();
//        for (int i : arr) {
//            avrg += i;
//        }
//        avrg /= arr.length; // Это вместо подсчета количества значений.
//        for (int i : arr) {
//            if (i < avrg) arr2.add(i);
//        }
//            System.out.println(avrg);
//            return arr2;
//        }

    } // End public class Main
