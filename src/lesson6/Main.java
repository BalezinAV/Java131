package lesson6;

import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in); // Вынесли из локальной видимости. Для использования повторно в разных методах. При добавления (public) - это модификатор доступа, который дает возможность видеть элемент из других пакетов. Но пока можно без него. Мы сделали глобальную переменную.
    public static void main(String[] args) { // Начало блока main
// Перегрузка методов. Методы с одинаковым названием и разными принимаемыми аргументами. Будет неявным образом вызываться правильный метод.
//        int a = 7;
//        int b = 3;
//        double c = 5.1;
//        double d = 7.2;
//        int res1 = min(a, b); // Когда мы передаем параметры с типом (int) min вызывется с соответствующим типом данных.
//        System.out.println(res1);
//        double res2 = min(c, d);// Когда мы передаем параметры с типом (double) min вызывется с соответствующим типом данных.
//        System.out.println(res2);

//    } // Заканчивается блок (main). Начинается блок метод.

        //(5)
//    public static int min(int n1, int n2){
//        int min; // Можно не использовать эту переменную.
//        if (n1 > n2) {
//            min = n2; // Можно сюда return n2
//        }else {
//            min = n1; // Можно сюда return n1
//        }
//        return min; // Мложно без этого return
//    }
//    public static double min(double n1, double n2){
//        double min;
//        if (n1 > n2) {
//            min = n2;
//        }else {
//            min = n1;
//        }
//        return min;
//    } //Конец блока метод.

        // Запись задач полная с блоком main и public.

        // Еще задачка.
//    int num = 4;
//    String str = "2 x 2 =";
//    print(str);
//    print(num);
//    print(str, num);
//
//}// Заканчивается блок (main). Начинается блок метод.
//    public static void print(String text){ // Текс может быть какой угодно.
//        System.out.println(text);
//    }
//    public static void print(int number) {
//        System.out.println(number);
//    }
//    public static void print(String text, int number) { // Объединяем строку и число. В методе разные типы данных и разное количество принимаемых аргументов.
//        System.out.println(text + " " + number);
//    } //Конец блока метод.

        //Задача. Перегрузка метода для нахождения суммы двух и трех целых чисел. При передаем переменные с разными названиями, но с одинаковыми типами данных, написать повторно функцию с таким же названием не можем.
//        int a = 7;
//        int b = 3;
//        int c = 5;
//        int res1 = sum(a, b); // Нужно явным ообразом указывать количество данных. По умолчанию данне задавться не могут.
//        int res2 = sum(a, b, c);
//        System.out.println("Сумма двух чисел: " + res1);
//        System.out.println("Сумма трех чисел: " + res2);
//    }//End main. Start public.
//    public static int sum(int n1, int n2){ // Если нет void, то нужен retern.
//        int sum = n1 + n2;
//        return sum;
//    }
//    public static int sum(int n1, int n2, int n3){
//        int sum = n1 + n2 + n3;
//        return sum;
//    } // End public.

        //Задача. Калькулятор.
    double num1 = getnumber(); // При такой записи целое проебразуется в вещественное.
//        System.out.println("num: " + num1); // Хотим посмотреть что выведится.
    double num2 = getnumber();
//        System.out.println("num: " + num1);
        char opereration = getOperation();
//        System.out.println(opereration);
        double result = calc(num1, num2, opereration);
        System.out.println("Результат: " + result);
    } //End main. Start public.
    public static double getnumber() {
//        Scanner input = new Scanner(System.in);
        System.out.print("Ведите число: ");
        if (input.hasNextDouble()) { // Сделали проверку обойих вводов за счет одного и тогоже метода.
            return input.nextDouble();
        } else {
            System.out.println("Ошибка при вводе, повторите ввод.");
            return getnumber(); // Функция вызывает сама себя. Рекурсия.
        }
    }
    public static char getOperation(){
//        Scanner input = new Scanner(System.in);
        System.out.print("1 - сумма\n2 - разность\n3 - произведение\n4 - частное\nВведите номер операции: ");
        int operationNumber = 0;
        if (input.hasNextInt()){
            operationNumber = input.nextInt();
        }else {
            System.out.println("Вы ввели не число, повторите ввод.");
            return getOperation();
        }
        switch (operationNumber){
            case 1: return '+';
            case 2: return '-';
            case 3: return '*';
            case 4: return '/'; // brake не нужен, так как retern прирвет работу самого метода.
            default:
                System.out.println("Неправильная операция. Повторите ввод.");
                return getOperation();
        }
    }
    public static double calc(double num1, double num2, char operation){ // Так как переменных и методов много, можно указат как в main.
    switch (operation){
        case '+':
        return add(num1, num2);
        case '-':
        return sub(num1, num2);
        case '*':
        return nul(num1, num2);
        case '/':
        return div(num1, num2);
        default:
            return Double.NaN;
    }
    }
    public static double add(double num1, double num2) {
        return num1 + num2;
    }
    public static double sub(double num1, double num2) {
            return num1 - num2;
    }
    public static double nul(double num1, double num2){
        return num1 * num2;
    }
    public static double div(double num1, double num2){
        if (num2 != 0.0){
            return num1 / num2;
        }else {
            System.out.println("На 0 делить нельзя");
            return Double.NaN; // Так как тип данных double мы не можем вернутьт текст, по этому (Not a Number). Сделано для того чтобы можно было вернуть описание проблемы.
        }
    }
    //ДЗ. Написать метод нахождения максимального числа из массива. Разное колечество принимаемых аргументов (...).
}// Конец класса "Main" ("Имя файла").
