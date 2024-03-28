package homework;
import java.util.Scanner;
public class DZ_28_Balezin_anonimMet {
    // ДЗ 28 от 06.03.24
    // Создайте реализацию интерфейса через анонимный класс с методом, котрый принимает два аргумента (два слова) и возвращает самое короткое из двух слов.
    // Первое слово: Собака; Второе слово: Кот
    // Самое короткое слово: Кот
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите наименование животного номер 1: ");
        String animal1 = input.next();
        System.out.print("Введите наименование животного номер 2: ");
        String animal2 = input.next();

//        Scanner input = new Scanner(System.in);
//        System.out.print("Введите наименование животного номер 1: ");
//        String animal1 = input.next();
//        System.out.print("Введите наименование животного номер 2: ");
//        String animal2 = input.next();
//        int lengthAnimal1 = animal1.length();
//        int lengthAnimal2 = animal2.length();

//        String[] animal1 = {"С", "о", "б", "а", "к", "а"};
//        String[] animal2 = {"К", "о", "т"};
//        String animal1 = "Собака";
//        String animal2 = "Кот";
//        System.out.println(animal1.length);
//        System.out.println(animal1.length());
//        System.out.println(animal2.length());
        // Реализация интерфеса
//        Comparelength compL = new Comparelength();

        // Анонимный класс
        ComparelengthInter compL = new ComparelengthInter() {
            @Override
            public void compare(String lA1, String lA2) {
                System.out.println("Длинна первого слова: " + lA1.length());
                System.out.println("Длинна второго слова: " + lA2.length());
                System.out.print("Самое короткое слово: ");
                if (lA1.length() >= lA2.length()) {
                    System.out.println(lA2);
                } else {
                    System.out.println(lA1);
                }
            }
        };
        compL.compare(animal1, animal2);
    }
}

interface ComparelengthInter{
    void compare(String lA1, String lA2);
}

//class Comparelength implements ComparelengthInter {
//    @Override
//    public void compare(String lA1, String lA2) {
//        System.out.println("Длинна первого слова: " + lA1.length());
//        System.out.println("Длинна второго слова: " + lA2.length());
//        System.out.print("Самое короткое слово: ");
//        if (lA1.length() >= lA2.length()) {
//            System.out.println(lA2);
//        } else {
//            System.out.println(lA1);
//        }
//    }
//}

