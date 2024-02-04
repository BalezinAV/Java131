package homework;

public class DZ_2_Balezin {
    public static void main(String[] args) {
    //число разложить на отдельные цифры, затем найти произведение цифр 97531, затем найти среднее арифметическое
        // суммы этих цифр.
        int num = 97531; // 5 цифр
        int a, b, c, d, e, multNum, sumNum, averagNum;
        a = num % 10; //получили переменную (а - 1) из набора цифр
        System.out.println("a = " + a);
        num = num / 10; // отбрасываем крайний символ из переменной (1)
        System.out.println("num = " + num); // num = 9753
        b = num % 10; //получили переменную (б - 3) из набора цифр
        System.out.println("b = " + b);
        num = num / 10; //отбрасываем крайний символ из новой переменной (3)
        System.out.println("num = " + num); // num = 975
        c = num % 10; //получили переменную (с - 5) из набора цифр
        System.out.println("c = " + c);
        num = num / 10; //отбрасываем крайний символ из новой переменной (5)
        System.out.println("num = " + num); //num = 97
        d = num % 10; //получили переменную (д - 7) из набора цифр
        System.out.println("d = " + d);
        num = num / 10; //отбрасываем крайний символ из новой переменной (7)
        System.out.println("num = " + num); // nam = 9
        e = num % 10; // получаем переменную (с - 9) из набора цифр
        System.out.println("e = " + e);
        multNum = a * b * c * d * e;
        System.out.println("multNum = " + multNum + " (это произведение цифр исходного числа)");
        sumNum = a + b + c + d + e;
        System.out.println("sumNum = " + sumNum + " (это сумма цифр исходного числа)"); // сумма цифр из которых состоит исходное число
        averagNum = sumNum / 5;
        System.out.println("averagNum = " + averagNum + " (это среднее арифметическое)"); // среднее арифметическое

    }
}
