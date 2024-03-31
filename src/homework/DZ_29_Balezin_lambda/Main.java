package homework.DZ_29_Balezin_lambda;

import java.math.BigInteger;
import java.util.function.Predicate;

public class Main {
    // ДЗ 29 от 11.03.24
    // Создайте программу для реализации лямбда-выражения, чтобы создать лямбда-выражение, проверяющее, является ли число простым.
    // Результат:
    // 7 является простым числом: true
    // 12 является простым числом: false

    public static void main(String[] args) {
//        Predicate<Integer> isSimple = num -> num % 2 == 0;
//        System.out.println(isSimple.test(12));

//        int num = 8;
//        boolean check = num % 2 > 0;
//        System.out.println(check);


        Predicate<Integer> isSimple = num -> {
//            boolean check = num % 2 == 0;
//            return check;
            BigInteger bigInteger;
            bigInteger = BigInteger.valueOf(num);
            boolean check = bigInteger.isProbablePrime((int) Math.log(num));
            return check;
        };
        int isCheck = 73;
        boolean now = isSimple.test(isCheck);
        System.out.println(isCheck + " простое число: " + now);

//        Integer integer = 13;
//        BigInteger bigInteger;
//        bigInteger = BigInteger.valueOf(integer);
//        boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(integer));
//        System.out.println(probablePrime);

//        System.out.println(8 % 2);

    }
}
