package Lesson17.sample4;
import java.util.function.Predicate; // Мы вызываем готовый интерфейс с методом. Чтобы вызвать - ктрл + лкм
public class Main { // Переходим в пакет sample4 11.03.24 -2- 1.06
    // Функциональные интерфейсы
    public static void main(String[] args) {
//        Predicate<Integer> isPositive = x -> x > 0;
//        System.out.println(isPositive.test(5)); // Это готовый метод интерфейса.
//        System.out.println(isPositive.test(-5));

        Predicate<String> isPalindrom = str -> {
            String reversed = new StringBuilder(str).reverse().toString();
            return str.equals(reversed);
        };

//        String word1 = "Мадам";
        String word1 = "мадам";
        boolean res = isPalindrom.test(word1);
        System.out.println(word1 + " Это палиндром: " + res);

        String word2 = "радар";
        res = isPalindrom.test(word2);
        System.out.println(word2 + " это палинтром: " + res);
    }
} // ДЗ 29 от 11.03.24 -2- 1.24 на функциональный интерфейс Predicate. Найти что такое простое число.