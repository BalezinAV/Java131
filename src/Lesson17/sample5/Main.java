package Lesson17.sample5;

public class Main { // переходим в пакет sample5 13.03.24 -1- 0.39
    public static void main(String[] args) {
        // Ссылки на метод как параметр метода. Аналог лямбда-выражения
//        Convert<String, Integer> converter = (from) -> Integer.valueOf(from);
//        Convert<String, Integer> converter = Integer::valueOf; // Это ссылка на метод.
//        Integer converted = converter.convert1("123");
//        System.out.println(converted);
//        int d = converted;
//        System.out.println("Умножим 'd' на 2: " + d * 2);
//    }
//    }

//interface Convert<F, T>{ // Принимает F, возвращает T. Это позволяет автоматически определить что приходит и что нужно возвращать.
//    T convert1(F from);
//}

//        HumanFactory<Human> humanFactory = Human::new; // new - создает экземпляр класса, параметрами которого являются имя и фамилия
////        HumanFactory<Human> humanFactory = (x, y) -> new Human(x, y); // Это вариант с лямбда
//        Human human = humanFactory.create("Olga", "Pavlova");
//        System.out.println(human);// Метод принимает два аргумента они нужны для создания экземпляра класса HumanFactory
//    }
//}

//interface HumanFactory<P extends Human>{
//    P create(String firstName, String lastName);
//}
//
//class Human {
//    String firstName;
//    String lastName;
//
//    public Human(String firstName, String lastName) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//    }
//
//    @Override
//    public String toString() {
//        return "Human(firstName='" + firstName + ", lastName=" + lastName;
//    }
//}



        Operation func = action(1); // выбираем вариант case
        int a = func.execute(6, 5); // int так как (int execute)
        System.out.println(a);
        int b = action(2).execute(6, 5);
        System.out.println(b);
        int c = action(3).execute(6, 5);
        System.out.println(c);
    }
    private static Operation action (int number){
        switch (number){
            case 1: return (x, y) -> x + y;
            case 2: return (x, y) -> x - y;
            case 3: return (x, y) -> x * y;
            default: return (x, y) -> 0;
        }
    }
}

@FunctionalInterface
interface Operation{
    int execute (int x, int y); // При использовании лямбда, можно использовать только один метод.

//    String apply(String t); // Добавили в качестве примера. Метод должен быть только один.
} // 13.03.24 -2- 0.0 переходим в новый пакет Lesson 18. Динамические структуры данных