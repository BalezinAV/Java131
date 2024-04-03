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

//        Supplier<User> userSupplier = () -> { // Создали тип данных User
//            Scanner input = new Scanner(System.in);
//            System.out.print("Введите имя: ");
//            String name = input.nextLine();
//            return new User(name);
//        };
//
//        User user1 = userSupplier.get(); // new User(name) - возвращает значение вместо вызова метода
//        User user2 = userSupplier.get();
//
//        System.out.println("Имя пользователя 1: " + user1.getName());
//        System.out.println("Имя пользователя 2: " + user2.getName());

//        Consumer<Integer> printer = x -> System.out.printf("%d долларов %n", x);
//        printer.accept(700); // Возвращает отформатированном виде текст.
//
//        Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());
//        printUpperCase.accept("Hello");

//        int x = 5;
//        UnaryOperator<Integer> squaer = x -> x * x; // Прминимает и возвращает один тип данных.
//        System.out.println(squaer.apply(5)); // Принял аргумент, произвел дейтвия и вернул измененый элемент.
//    } // переходим в пакет sample5 13.03.24 -1- 0.39
//            }

//class User{
//    private String name;
//    public User(String name){ // Конструктор
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//}