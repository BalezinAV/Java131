package lesson9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Работа со строками
//        String str1 = "Hello";
//        String str2 = "Work";
//        String massage = str1 +  " " + str2;
//        System.out.println(massage);
//
//        char[] helloArray = {'П', 'р', 'и' , 'в', 'е', 'т', '.'};
//        String helloString = new String(helloArray);
//        System.out.println(helloString);
//
//        String str = "2"; //"Hello";
//        int a = 5;
//        String newStr = str + a; // Можем только складывать, другие математические действия не возможно. Здесь (5) стала строковым элементом. Происходит конкатенация. Переменные можно поменять местами.
//        System.out.println(newStr); // Произошло неявное преобразование типов.
//
//        int b = 3;
//        String st = b + ""; // Когда мы ставим (+) между строковым и числовым значениям происходит не явное преобразование типа.
//        System.out.println(st);

        //Обратное преобразование.
//        String str = "2";
////       int a = (int) str; // Явное преобразование типов работать не будет.
//       int a = Integer.parseInt(str); // Это метод для преобразования типов.
//        System.out.println(a);
//
//        int b = Integer.parseInt("789"); // Если добавить буквы или (.), то преобазовать не получится.
//        System.out.println(b);

//        String name = "Hello"; // Строка воспринимаетая как массив. Строки это неизменяемый тип данных.
//        name = "Hi";
//        System.out.println(name);
//        int count = name.length(); // длинна строки.
//        System.out.println(count); // 5
//        int count = (name + 57).length();
//        System.out.println(count); // "Hello57" - произошла конкатенация и получилась новая строка 7 символов.
//        int count1 = "".length();
//        System.out.println(count1); // 0

        // Перевод из ничжнего регистра в верхний
//        String name = "Nikita";
////        String name2 = name.toLowerCase(); // Преобразование символов в строке в нижний регистр.
////        System.out.println(name2);
//        String name2 = name.toUpperCase(); // Перевод в верхний регистр.
////        System.out.println(name2);
//        System.out.println(name.toUpperCase());
//        System.out.println(name);
//        char res = name.charAt(2); // 0,1,2. Возвращает символ, расположенный по указанному индексу строки.
////        System.out.println(name[2]); // Так обратиться к индексу мы не можем.
//        System.out.println(res); // k

        // Задача. Частотный словарь букв русского алфавита.
//        String text = "Частотный словарь букв русского алфавита. Создадим массив нужной длинны, и будем хранить в соответствующих позициях количества вхождений символов.";
//        String text = "Привет";
//        System.out.println(text);
//        text = text.toLowerCase();
//        int[] result = new int['я' - 'а' + 1];
////        System.out.println(result);
//        for (int i = 0; i < text.length(); i++) {
//            char ch = text.charAt(i);
//            if (ch >= 'а' && ch <= 'я'){ // Регистр имеет значение.
//                result[ch - 'а']++;
//            }
//        }
//        for (int i = 0; i < result.length; i++) {
//            System.out.println((char) (i + 'а') + " = " + result[i]);
//        }

        // Метод проверки пустой строки.
//        String s1 = "";
//        if (s1.isEmpty()){ // s1.length() == 0 // Проверка что строка пустая.
//            System.out.println("Пустая строка");
//        }

// Преобразование символов в массив.
//        String str = "ABC";
//        char[] res = str.toCharArray(); // Преобразование строки в массив символов.
//
//        for (int i = 0; i < res.length; i++){
//            System.out.println("Элемент [" + i + "]: " + res[i]);
//        }

        // Пример для чего это нужно.
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Введите адрес сайта: ");
//        String path = input.nextLine();
//
//        char[] chars = path.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            if (chars[i] == '/'){
//                chars[i] = '\\';
//            }
//        }
//        String res = new String(chars);
//        System.out.println(res);

        // Поиск символа в строке.
//        String str = "I learning Java";
//        System.out.println(str);
//        System.out.println(str.indexOf('a')); // Ищет первое значение символа или подстроки, или возвращает (-1) если совпадение не найдено.
////        System.out.println(str.indexOf("Java"));
////        System.out.println(str.indexOf("Java1"));
//        System.out.println(str.indexOf('a', 5)); // С каого сисвола будет производится поиск.
//        System.out.println(str.lastIndexOf('a')); // Ищет с конца, но индекссация идет с леава на право.
//        System.out.println(str.lastIndexOf('a', 5)); // Ищет с конца, но индекссация идет с леава на право от индекса 5.

        // Удаление пробельного символа.
//        System.out.println("   Hello World     ".trim()); // Убирает пробельные символы и слева и справа. С начала и конца строки.

        // Получение подстроки из строки.
//        String str = "I learning Java";
//        System.out.println(str.substring(2)); // Получение подстроки из строки.
//        System.out.println(str.substring(2, 10)); // от 2 до 10, 10 не включается.
        // Разбиваем на подстроки.
//        String[] words = str.split(" "); // Разбили по пробельному символу. Можно разбить по любому символу. Продолжить от 17.01.24 часть 2 (1.00)
//        for (String word: words){
//            System.out.println(word);
//        }

        // Задача. Разделяем ФИО.
//        Scanner input = new Scanner(System.in);
//        System.out.print("Введите ФИО: ");
//        String name = input.nextLine(); // Никонов Валерий Анатольевич.
//        String[] res = name.split(" "); // ["Никонов", "Валерий", "Анатольевич"] Преобразовали строку в массив.
//        System.out.println(res[0] + " " + res[1].charAt(0) + "." + res[2].charAt(0) + "."); // charAt() - возвращает символ элемента массива.

        // Метод Join - обратный методу split. Позволяет вставлять символы для отделения элементов друг от друга.
//        String res = String.join(":", "00", "23", "30"); // Первый символ, это то чем будет ставиться между элементами. Именно в первом символе задаем знак разделения.
//        System.out.println(res);
//
//        String[] text = new String[]{"Hello", "World"};
//        String str = String.join(" ", text);
//        System.out.println(str);

        // Упражнение
//        String text = "Я изучаю C++. Мне нравится C++.";
//        System.out.println(text);
////        String tx = text.replace("C++", "Java"); // Что бы переменная не перезаписалась. Прописали целевой элемент и чем заменяем.
////        System.out.println(tx);
//        //Другой вариант решения.
//        String[] array = text.split("C\\+\\+"); // (++) это спецсимвол, шаблон регулярных выражений. Нужно его скрыть.
//        String res = String.join("Java", array);
//        System.out.println(res);
//ДЗ. от 17.01.2024 (часть 2 (1.23)). Два слова чрез пробел. Переставить эти слова местами. Введите два слова через пробел: один два => два один
        // еще ДЗ. Заменить все проявления буквы "о" на букву "О", кроме первого и последнего вхождения. Введите строку: Замените в этой строке все проявления буквы "о" на букву "О", кроме первого и последнего вхождения.

        // Лекция от 22.01.2024 Разбор ДЗ от 15 и 17.01.2024.
        // После ДЗ.

//        String s1 = "Hello";
//        String s2 = "Hello1";
//        String s3 = "HELLO";
//        System.out.println(s1 == s2);
//        System.out.println(s1.equals(s2)); // Оператор сравнения.
//        System.out.println(s1.equals(s3)); // Оператор сравнения.
//        System.out.println(s1.equalsIgnoreCase(s3)); // Оператор сравнения с игнорированием регистра.
//        System.out.println("I learning Java".endsWith("Java")); // Проверяем каким словом (подстрокой) заканчивается наша строка. Возвращает true / false.
//        System.out.println("I learning Java".startsWith("I")); // Проверяем каким словом (подстрокой) начинается наша строка. Возвращает true / false.
//        System.out.println("I learning Java".contains("I")); // Проверяем содержит ли тсрока заданное слово (подстрока). Возвращает true / false. Можно указать просто символы.
        // Как применить
//        Scanner input = new Scanner(System.in);
//        System.out.print("Введите название документа: ");
//        String path = input.nextLine();
//        if (path.endsWith(".jpg") || path.endsWith(".jpeg") || path.endsWith(".png")){
//            System.out.println("Это изображение");
//        } else if (path.endsWith(".docx") || path.endsWith(".doc")){
//            System.out.println("Это документ Word");
//        }else {
//            System.out.println("Неизветсный документ");
//        }

        // Кодировка символов. 1960г таблица кодировки символов ASCII. Сейчас используют Юникод.
//        String s = "I learning Java";
//        int n;
//        n = s.codePointAt(5); // Этот метод возвращает код символа по его индексу строки.
//        System.out.println(n);
//        n = s.codePointBefore(5); // Этот метод возвращает код символа элемента перед указанным индексом.
//        System.out.println(n);

        // Число в виде строкового представления.
//        String s;
////        double d = 3.8567;
////        int d = -3902;
////        char d = '+'; // Меняем типы данных.
//        boolean d = true;
//        s = String.valueOf(d); // Метод, позволяющий преобразовать разные типы данных в строку.
//        System.out.println(s);

//        String str = "1"; // 49
//        System.out.println("1 > 2 : " + str.compareTo("2")); // -1 (false) Идет лексикографическое сравнение строк.
//        str = "2"; // 50
//        System.out.println("2 > 1 : " + str.compareTo("1")); // 1 (true) Алфавитный порядок сравнения элементов.
//        System.out.println("2 == 2 : " + str.compareTo("2")); // 0

//        String str = "a";
//        System.out.println("a > m : " + str.compareTo("m")); // -12 (false) разница значений кодов с отрицательным знаком.
//        str = "m";
//        System.out.println("m > a : " + str.compareTo("a")); // 12 (true) разница значений кодов с положительная.
//        System.out.println("m == m : " + str.compareTo("m")); // 0 элементы равны.

        //Игнорирование регистра
//        String str = "A";
//        System.out.println("A > m : " + str.compareTo("m"));
//        System.out.println("a > M : " + str.compareToIgnoreCase("M"));
//        System.out.println("a > M : " + str.compareTo("M"));
//        str = "m";
//        System.out.println("m > a : " + str.compareTo("a"));
//        System.out.println("m == m : " + str.compareTo("m"));
        // Продолжить часть 2 22.01.24
//        StringBuilder sb = new StringBuilder();
//        sb.append('a'); // Это строковое представление каждого элемента, которые объединяются по принципу конкатенации.
//        sb.append(10);
//        sb.append(123456l);
//        sb.append(12.34);
//        sb.append(12.34f);
//        sb.append("Hello").append("_").append("World"); // Можно прописать в одну строку, либо можно разными.
//        sb.append("Hello")
//                .append("_")
//                .append("World"); // Можно прописать в одну строку, либо можно разными. Между элементами не нужно ставить (;).
//        System.out.println(sb);
//        sb.insert(5, "_!"); // 0-5 индекс. До индекса 5 вставится нужный элемент. Или в пятый индекс встанет элемент, а все сдвитентся в право.
//        System.out.println(sb);
//        sb.delete(5, 7); // Удалить с 5 до 7, 7 не включается.
//        System.out.println(sb);
//        sb.replace(5, 10, "Java"); // Заменить с 5 по 10 индекс не включая 10.
//        System.out.println(sb);
//        String st = sb.substring(5, 9); // Сохраним от 5 индекса до 9 не включая 9. Если не указываеть предел, то получим все индексы от заданного до конца строки.
//        System.out.println(st);
//        sb.reverse(); // Разворачивает строку.
//        System.out.println(sb);
//        System.out.println(sb.indexOf("l")); // Возвращает идекс символа.
//        System.out.println(sb.indexOf("a", 3)); //

//        StringBuilder sb1 = createStr(5, 3);
////        modifyStr(sb1);
//        modifyStr(sb1, "=", "равно"); // Для того чтобы заменять символы словами.
//        modifyStr(sb1, "+", "плюс"); // Для того чтобы заменять символы словами.
//        modifyStr(sb1, "-", "минус"); // Для того чтобы заменять символы словами.
//        modifyStr(sb1, "*", "умножить"); // Для того чтобы заменять символы словами.
//        System.out.println(sb1);
//    } // End main. Start public
//    public static StringBuilder createStr (int a, int b) {
//        StringBuilder res = new StringBuilder();
//        res.append(a).append(" + ").append(b).append(" = ").append(a + b).append("\n"); // 8
//        res.append(a).append(" - ").append(b).append(" = ").append(a - b).append("\n"); // 2
//        res.append(a).append(" * ").append(b).append(" = ").append(a * b).append("\n"); // 15
//        return res;
//    } // End public
////    public static StringBuilder modifyStr(StringBuilder stBuild){
//    public static StringBuilder modifyStr(StringBuilder stBuild, String oldStr, String newStr){ // Новый метод для замены знаков словами.
////        int pos = stBuild.indexOf("="); // В переменную попадает индекс вхождения (=). Если нет такого значения, то возвращается (-1).
//        int pos; // Вариант с циклом на все знаки (=).
////        while ((pos = stBuild.indexOf("=")) != -1){
////        stBuild.deleteCharAt(pos); // Удалаем символ по индексу (=).
////        stBuild.insert(pos, "равно"); // Заменяем символ по индексу на нужное значение.
////        } // Для while
//        while ((pos = stBuild.indexOf(oldStr)) != -1){ // Для новых методов замены знаков словами.
//        stBuild.replace(pos, pos + 1, newStr); // Удалаем символ по индексу (=).
//         // Заменяем символ по индексу на нужное значение.
//        } // Для while
//            return stBuild;
//    }

        //Задача. Удалить из строки повторяющиеся символы и все пробелы.
        //Start main
//        StringBuilder modStr = getStringBuilder();
//        System.out.println("Измененная строка - \"" + modStr + "\"");
//    }
//    public static StringBuilder getStringBuilder() {
//        System.out.print("Исходная строка = \"");
//        String str = "  Текст  с   повторяющимися   символами ";
//        System.out.println(str + "\"");
//        StringBuilder modify = new StringBuilder(str.replace(" ", ""));
//        for (int i = 0; i < modify.length(); i++) { // с первого индекса и к концу.
//            for (int j = modify.length() - 1; j > i; j--) { // с последнего индекса к началу.
//                if (modify.charAt(i) == modify.charAt(j)){ // при одной итерации наружного цикла выполняются все итерации вложенного цикла.
//                    modify.deleteCharAt(j);
//                }
//            }
//        }
//        return modify;
//    }

    }
} // Перешли в пакет 10.