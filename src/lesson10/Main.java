package lesson10;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {
    public static void main(String[] args) {
       // Регулярные выражения.
        //String s = "Я ищу совпадения в 2024 году и я их найду в 2 счёта.";
//        String s = "Я ищу совпадения в 2024 году и я их найду в 2 счёта. 198765";
////        String pattern = "ищу"; // Метод find будет искать только такую последовательность.
////        String pattern = "\\d{1,4}"; // Еще шаблон, по которому нужно осуществить поиск. Шаблон регулярного выражения.
////        String pattern = "[204]"; // Это уже шаблон для поиска конкретных элементов в любом порядке, из тех, которые указаны в квадратных скобках.
////        String pattern = "[0-2]"; // Это диапазон, включительно.
//        String pattern = "[12][0-9][0-9][0-9]"; // Ищем и выводим 4-е цифры, на первой позиции бедт стоять либо (1) либо (2). Если идет перечисление, то ищем один из заданных символов, если дефис, то один символ из диапазона.
//        Pattern regex = Pattern.compile(pattern); // Сюда передаем шаблон. Вспомогаьельный элемент, который помогает венуть результат из текущих элементов.
//        Matcher matcher = regex.matcher(s); // true при совпадении строки с шаблоном. Этот метод ищет совападенияв строке по шаблону.
////        System.out.println(matcher.find()); // Если совпадения с шаблоном находятся, то будет значение true.
//        while (matcher.find()){
////            System.out.println("Шаблон совпадений найден с " + matcher.start() + " до " + (matcher.end()-1)); // Возвращает индексы совпадения с текущими элементами. -1 что бы интервал указывал текущее значение. Без этого конец итрервала будте указан не включительно.
////            System.out.println(s.substring(matcher.start(), matcher.end())); // Возвращаем элементы.
//            System.out.println(matcher.group()); // Возвращаем элементы, как в предыдущем. Он короче и его можно использовать в цикле.
//        }
        // ДЗ. от 22.01.2024 На стрингбилдер либо на сринг. В тсроке вставить после каждого символа 'a' символ '!'. Исходная строка - "Java". Измененная - "Ja!va!"

        // Лекция от 24.01.2024.
//        String s = "Я ищу совпадения в 2024 году. И я их найду в 2 счёта. 198765 Ели[-ели]";
////        String pattern = "[А-Яа-яё]"; // Ищеем буквы из биапазона. Один цикл, одлна буква. Регистр имеет значение. Пробельный символ тоже (сейчас он не ищется).
//        // Добавили букву (ё), так как она выходит из диапазона докодв и была вклбчена позже (1105). Добавили буквы в верхнем регистре.
//        // [А-яЁё] - это полный русский алыфавит. [A-za-z] - это полный английский алфавит. Между Строчными и прописными значениями есть сецсимволы. (.)- Это спецсимвол, возвразщает любой следущий символ, и только в [.] она является знаком припянания. Чтобы она не была спецсимволом за пределами [] ее нужно заэкранировать (\\).
////        String pattern = "[-А-Яа-яё\\[\\]\\-]"; // Спецсимволы экранируются (\\). Дефис тоже спецсимвол. Можем задавать диапазон только от кода меньше к коду больше! (-) Лучше ставить в начале , так как не будет восприниматься как диапазон, либо в конце, в квадратных скаобках.
////        String pattern = "[^А-яЁё]"; // (^...) циклумфлекс - ищем все, кроеме тех символов, которые задали (в нашем случае все, кроеме букв). Если указать так [А-я^Ёё], то будем искать и этот символ тоже.
////        String pattern = "[а-я&&[к-н]]"; // Объединение символов. && - логическое пересечение диапазонов.
//        // [а-д[к-н]] - объединение символов => [а-дк-н]
//        // [а-я&&[к-н]] - пересечение символов => [к-н]
//        String pattern = "[а-я&&[^к-н]]"; // Вычитание символов. То есть будут пропущено все, что указано во вторых [^...]. Все, ероме [^...].
//        Pattern regex = Pattern.compile(pattern);
//        Matcher matcher = regex.matcher(s);
//        while (matcher.find()){
//            System.out.println(matcher.group());
//        }
//        String str = "ЁАабяё"; // Буква (ё) по пкоду не входит в алфавит. Её нужно указывать отдельно если нужен полный алфавит.
//        for (int i = 0; i < str.length(); i++) {
//            System.out.println(str.charAt(i) +": " + str.codePointAt(i));
//        }

        // Задача. Найти время в формате: [16:25]. Тест: Час в 24-часовом формате от 00 до 23.2021-06-15T21:42. Минуты, в дипапизоне от 00 до 59. 2021-06-15T01:09 Ответ ['21:45', '01:09']
//        try { // Допустили ошибку (незакрыли скобку) и выводим более подробное описание ошибки.
//            String s = "Час в 24-часовом формате от 00 до 23. 2021-06-15Т21:45. Минуты, в диапазоне от 00 до 59. 2021-06-15Т01:09";
//            String pattern = "[0-9][0-9]:[0-9][0-9";
//            Pattern regex = Pattern.compile(pattern);
//            Matcher matcher = regex.matcher(s);
//            while (matcher.find()) {
//                System.out.println(matcher.group());
//            }
//        }catch (PatternSyntaxException pse){ // Если исклбчений не вознкло, то это оператор не отрабатывает.
//            System.err.println("Неправильное регулярное выражение: " + pse.getMessage()); // Это все описания ошибки.
//            System.err.println("Описание: " + pse.getDescription()); // Это часть описания ошибки.
//            System.err.println("Описание: " + pse.getDescription());
//            System.err.println("Позиция: " + pse.getIndex());
//            System.err.println("Неправильный шаблон: " + pse.getPattern());
//        }

        // Новая задача. 24.01.24 -2- 0.13.
//        String s = "Я ищу совпадения в 2024 году. И я их найду в 2 счёта. 198765 Ели[-ели]. Hello_world";
//        String s = "Цифры: 7, +17, -42, 0013, 0.3";
//        String pattern = "[+-]?[\\d.]+"; // Ищем любую цифру. \\d аналог [0-9]. \\s == [ ] - один пробельный символ. \\w == [A-Za-z0-9_] один символ, но только английский алфавит. Не зависит от регистра. Буквы, цифры, символ подчеркивания. Дефис не входит.
        // \\D == все кроме цифр [^0-9]. \\S == [^" "] (все кроеме пробелов). \\W == все ероме тех что ищет (w) [^A-Za-z0-9_]. \\A == поиск шаблона с началом строки. \\Z == поитск шаблона с конца строки ("World \\Z")
        //  Всего 3 символа (+*?). + == от 1 до бесконечностей.  * == количество повторений от 0 до бесконечности. ? от 0 до 1.
        // 20* - * относится только к последнему числу (0).
//        Pattern regex = Pattern.compile(pattern);
//        Matcher matcher = regex.matcher(s);
//        while (matcher.find()){
//            System.out.print(matcher.group() + "\t\t");
//        }

        //Задача. Регулярное выражение для нахождения всех ключей и значений: author=Пушкин А.С.; title = Евгений Онегин; prise =200; year= 1830
//        String s = "author=Пушкин А.С.; title = Евгений Онегин; prise =200; year= 1830";
////        String pattern = "\\w+\\s*=\\s*[А-я0-9\\s.]+"; // Это длинная запись.
//        String pattern = "\\w+\\s*=\\s*[^;]+"; // Это короткая запись. Ищем до (;) пока не дойдем до (;).
//        Pattern regex = Pattern.compile(pattern);
//        Matcher matcher = regex.matcher(s);
//        while (matcher.find()){
//            System.out.print(matcher.group() + "\t\t");
//        }
// Еще варинат.
//        String s = "12 сентября 2024 года 2345654";
//        String pattern = "\\d{2,4}"; // Две цифры подряд {2}; {4} - четыре цифры подряд . Если нее будет хватать, то не выведет.
//        // {2,} == от двух повторений до бесконечности. Пробела быть не может, ошибка синтаксиса.
//        // {3,} == возьмет от трез чисел и до бесконечности.
//        // {2,4} == от 2х чисел до 4х чисел.
//        Pattern regex = Pattern.compile(pattern);
//        Matcher matcher = regex.matcher(s);
//        while (matcher.find()){
//            System.out.print(matcher.group() + "\t\t");
//        }
        // Задача. Найти номер телефона в формате +7ххххххххххх или 7хххххххххх Тест: +7 499 456-45-78, 74994564578
//        String s = "+7 499 456-45-78, +74994564578, 7 (499) 456 45 78, 74994564578";
//        String pattern = "\\+?7\\d{10}";
//        String s = "I learning Java 02";
//        String s = "I learning Java";
////        String pattern = "\\w+\\s\\w+"; // шаблон на 2е группы символов через пробел.
////        String pattern = "^\\w+\\s\\w+"; // ^ -  от начала строки заданной последовательностью. (заданный шаблон)
////        String pattern = "\\w+\\s\\w+$"; // с конца. $ - работает тольк в конце строки с заданной послодовательностью. (заданный шаблон)
//        String pattern = "^\\w+\\s\\w+\\s\\w+$"; // Нашли все элементы шаблона, при этом если бы в строке было что-то не учтенное шаблоном, ничего бы не нашлось.
//        Pattern regex = Pattern.compile(pattern);
//        Matcher matcher = regex.matcher(s);
//        while (matcher.find()){
//            System.out.print(matcher.group() + "\t\t");
//        }
// Проверка имени пользователя.
//        String s = "Java_123--@master";
//        String pattern = "^[\\w-]{3,16}$"; // буквы, цифры, _, -, от 3 до 16
//        Pattern regex = Pattern.compile(pattern);
//        Matcher matcher = regex.matcher(s);
//        System.out.print(matcher.find());

        // Флаги
//        String s = "Я ищу совпадения в 2024 году и я их найду в 2 счёта. Hello_World";d
//        String pattern = "я";
//        Pattern regex = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE); // Игнорирование регистра символов, но только для Английскомго языка. Добавили второй флаг и теперь находим символы русского алфавита.
//        Matcher matcher = regex.matcher(s);
//        while (matcher.find()) {
//            System.out.print(matcher.group() + "\t\t");
//        } Продолжить 24.01.24 -2- 1.11
//        Scanner input = new Scanner(System.in);
//        System.out.println("Введите текст с цифрами: ");
//        String s = input.nextLine();
//        String pattern = "\\d #поиск цифр"; // При такой зписи пробел после \d не учитывается и ищем все цифры.
//        Pattern regex = Pattern.compile(pattern, Pattern.COMMENTS);
//        Matcher matcher = regex.matcher(s);
//        int count = 0;
//        while (matcher.find()){
//            count ++;
//        }
//        System.out.println("Количество цифр во введенном тексте: " + count);
        // ДЗ. Проверка соответствия пароля. Может состоять из цифр, букв английского алфавита, символов (-), @, (_). Длина пароля от 6 до 18 символов.
// Лекция от 29.01.2024 Флаги
//        String s = "one\ntwo";
////        String pattern = "one.\\w+"; // Планируем найти всю строку. Точка, рядом с переносом на другую строку не работает.
//        String pattern = "one$"; // Ищем в конце строки.
////        Pattern regex = Pattern.compile(pattern, Pattern.DOTALL);
//        Pattern regex = Pattern.compile(pattern, Pattern.MULTILINE); // Флаг, понимает, что есть несколько строк, и есть начало и конец строки.
//        Matcher matcher = regex.matcher(s);
//        while (matcher.find()){
//            System.out.print(matcher.group() + "\t\t");
//        }
//        String s = "Goods - $500";
//        String pattern = "$500"; // Нам нужно искать знак $ как литерал без экранирования.
//        Pattern regex = Pattern.compile(pattern, Pattern.LITERAL);
//        Matcher matcher = regex.matcher(s);
//        while (matcher.find()){
//            System.out.print(matcher.group() + "\t\t");
//        }

//        String s = "Java,\njava,\nJAVA";
//        String pattern = "(?im)^java"; // Сокращенное применеие флагов. m - для многострочного текста и i - для игнорирования регистра символов.
//        Pattern regex = Pattern.compile(pattern);
//        Matcher matcher = regex.matcher(s);
//        while (matcher.find()){
//            System.out.print(matcher.group() + "\t\t");
//        }

        // Задача. Найти адрес электронной почты.
//        String s = "123456@i.ru, 123_456@ru.name.ru, login@i.ru, логин-1@i.ru, login.3@i.ru, 1login@ru.name.ru";
//        String pattern = "[а-я\\w\\.-]+@[\\w.]+.ru";
//        Pattern regex = Pattern.compile(pattern);
//        Matcher matcher = regex.matcher(s);
//        while (matcher.find()){
//            System.out.println(matcher.group());
//        }

        // Жадное соответствие. Теги <>.
//        String s = "<body>Пример жадного вырадения соответствия регулярных выржений</body>";
//        String pattern = "<.*?>"; // * - максимум повторений - жадное соответствие. ? - позволяет изменить параметры поиска.
//        String s = "12 сентября 2024 года 2345654";
//        String pattern = "\\d{2,4}?";
//        String s = "Егорова Алиса Александровна";
//        String pattern = "А.+?а"; // Ищем минимальное количество совпадений, то есть до первого. Ленивое.
//        Pattern regex = Pattern.compile(pattern);
//        Matcher matcher = regex.matcher(s);
//        while (matcher.find()){
//            System.out.println(matcher.group() + "\t");
//    }
        // продолжить -1- 0.35
//        String s = "Word2016, PS6, AI5";
////        String pattern = "[a-z]+\\d*";
//        String pattern = "([a-z]+)(\\d*)"; // Разделили поиск.
//        Pattern regex = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
//        Matcher matcher = regex.matcher(s);
//        while (matcher.find()){
//            System.out.println(matcher.group() + "\t"); // По умолчанию нулевой индекс.
//            System.out.println(matcher.group(1) + "\t"); // Выводим то, что находится в первых ().
//            System.out.println(matcher.group(2) + "\t"); // Выводим то, что находится во торых ().
//        }

//        String s = "abc";
//        String pattern = "(.(.(.)))";
//        Pattern regex = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
//        Matcher matcher = regex.matcher(s);
//        matcher.find();
//        System.out.println(matcher.groupCount() + "\t"); // Возвращает число захватыватываемых груп в шаблоне для сопоставления. Нашел 3 группы. Метод работает, когда используются круглые скобки.
//        for (int i = 0; i <= matcher.groupCount(); i++){ // <= - Чтобы выводился последний элемент. 0 - Это все совпадения без учета скобок, 1- первые круглые скобки; 2- вторые круглые скобки; 3 - третьи круглые скобки.
//            System.out.println(i + ": " + matcher.group(i));
//        }

//        String s = "Ольга и Виталий отлично учатся!";
//        String pattern = "Петр|Ольга|Виталий"; // | - Выбирает любое из заданных имен.
//        String s = "int = 4, float = 4.0f, double = 8.0";
////        String pattern = "\\w+\\s*=\s*\\d\\.?\\d?\\w*";
////        String pattern = "\\w+\\s*=\\s*\\d[.\\w]*"; // Вариант проще.
////        String pattern = "int\\s*=\\s*\\d[.\\w]*|float\\s*=\\s*\\d[.\\w]*"; //
////        String pattern = "(int|float)\\s*=\\s*\\d[.\\w]*"; // Варинат или int || float.
//        String pattern = "(int|float)\\s*=\\s*(\\d[.\\w]*)"; // Варинат или int || float.
//        Pattern regex = Pattern.compile(pattern);
//        Matcher matcher = regex.matcher(s);
//        while (matcher.find()) {
//            System.out.println(matcher.group() + "\t"); // Вывод всего шаблона.
////            System.out.println(matcher.group(1) + "\t"); // Вывод первой скобки
////            System.out.println(matcher.group(2) + "\t"); // Вывод второй скобки.
//        }

//        String s = "127.0.0.1";
//        String s = "127.168.255.255";
////        String pattern = "\\d{1,3}.\\d{1,3}.\\d{1,3}.\\d{1,3}";
//        String pattern = "(\\d{1,3}.){3}\\d{1,3}"; // Вариант проще. Сократили запись для повторяющихся элементов.
//        Pattern regex = Pattern.compile(pattern);
//        Matcher matcher = regex.matcher(s);
//        while (matcher.find()) {
//            System.out.println(matcher.group() + "\t");
//        }
        // Задача. Пользователь вводит текущую дату по заданному шаблону, нужно проверить данные на соответсвие.
//        String s = "18-01-2099"; // Сам шаблон условий миеть не может.
//        String pattern = "(0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[0-2])-(19[0-9][0-9]|20[0-9][0-9])"; // обозначели шаблон для первого чичла (), 3 можно не заключать в [], если это одно число. Оператор (|) работает как логическое ИЛИ.
//        Pattern regex = Pattern.compile(pattern);
//        Matcher matcher = regex.matcher(s);
//        while (matcher.find()) {
//            System.out.println(matcher.group() + "\t");
//        }

        //Рассмотрим методы для шаблонов
//        String s = "Я ищу совпадения в 2024 году. И я их найду в 2 счёта.";
//        String[] arr = s.split("[.2]"); // (.) Нужно заэкранировать. Можно поместить ее в []. Можно поместить шаблон регулярного выражения.
//        for (String temp: arr) {
//            System.out.println(temp);
//        }

//        Pattern p = Pattern.compile(",\\s");
//        String[] arr = p.split("Суворова Виктория, Россия, г. Сочи, +7 999 555-77-33");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

//        String s = "05-03-1987 // Дата рождения";
////        String s2 = s.replaceAll("\\s*//.*",""); // Два параметра.
////        System.out.println("Дата рождения: " + s2); // Дата рождения: 05-03-1987
//        String s2 = s.replaceAll("\\s*//.*","").replaceAll("-","."); // Методы работают с лева на право.
//        System.out.println("Дата рождения: " + s2); // Дата рождения: 05.03.1987
// Конец шаблонов.

        //Побитовые операторы. Работают с битами.
        //Побитовая (И).
//        System.out.println(0b111 & 0b000); // 7 & 0 => 0; Двоичная система.
//        System.out.println(0b111 & 0b001); // 7 & 1 => 1
//        System.out.println(0b111 & 0b010); // 7 & 2 => 2
//
//        System.out.println(7 & 0); // Применяем побиторвые операторы для десятичных чисел и будем получать результат как в доичноий системе.
//        System.out.println(7 & 1);
//        System.out.println(7 & 2);

        // Побитовая (ИЛИ)
//        System.out.println(0b101 | 0b010); // 5 | 2 (0b111) => 7
//        System.out.println(0b011 | 0b100); // 3 | 4 (0b111) => 7
//        System.out.println(0b010 | 0b100); // 2 | 4 (0b110) => 6

        // Побитовое исключающее (ИЛИ)
//        System.out.println(0b110 ^ 0b101); // 6 ^ 5 (0b011) => 3
//        System.out.println(0b101 ^ 0b010); // 5 ^ 2 (0b111) => 7
//        System.out.println(0b100 ^ 0b111); // 4 ^ 7 (0b011) => 3

        // Побитовое (НЕ)
//        System.out.println(~0b0);
//        System.out.println(~0b1);
//        System.out.println(~0);
//        System.out.println(~1);
//        System.out.println(0b11111111111111111111111111111111);

        // Задача. Четное не четное
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Введите число: ");
//        int number = input.nextInt();
//        if ((number & 1) == 0){ // number % 2 == 0; У четного числа последний бит 0, у нечетного 1
//            System.out.println(number + " - четное число");
//        }
//        if ((number & 1) == 1){ // number %2 == 1; Так тоже можно проверить на нечетность.
//            System.out.println(number + " - нечетное число");
//        }

//        int x = 1;
//        double y = 3.1515d;
////        x = x + y;
////        x = (int)(x + y);
////        x = x + (int)y;
//        x += y; // Сокращенный оператор дает возможность преобразования данных.
//        System.out.println(x);

        // Меняем переменые местами
//        int x = 5, y = 7;
//        System.out.println("x = " + x + ", y = " + y);
//
////        x = x ^ y; // x == 2 // 101 ^ 111 = 010
////        y = x ^ y; // y == 5 // 010 ^ 111 = 101
////        x = x ^ y; // x == 7 // 010 ^ 101 = 111
//        // Короткий вариант
//        y ^= (x ^= y);
//        x ^= y;
//        System.out.println(x);
//        System.out.println("x = " + x + ", y = " + y);

        // Побитовый сдвиг
        // Сдвиг в право
//        System.out.println(0b101 >> 1);
//        System.out.println(5 >> 2);
        // ДЗ Зарегистрироваться на гедхаб до 31.01.24 (запомнить логин и пароль).
        // ДЗ Валидация номера телефона. Шаблоны. Найти все номера телефонов.
        // ДЗ Введите количество символов: 5 (Побитовые операторы) чет нечет. По желанию.

        // Лекция 31.01.2024 -1-. ГетХаб.
        //Основные команды.
        // $ git --version // Сначала "git --" потом команду.
        // git init // создание репозитория. Без (--). Только один раз для одного репозитория.
        // git status // Состояние нашего репозитроия.
        // git add -A // Эта комнда позволяет гиду отслеживать измеения наших файлов. Чтобы не вводить команду, модно выбрать стрелками ка клавиатуре предыдущие.
        // git add --all // Отслеживаем все файлы в папках и подпапка. Как (-А).
        // git add Main.Java // Только этот файл.
        // git add . // Отслеживаем все файлы из текущей дериктории (папке).
        // git config --global user.name 'new user' // Позволяет сделать общие настройки для всех репозиториев. Выясняем или устанавливаем нужно имя для ПК.
        // git config --local // Разные настройки для репозиториев.
        // git comfig --global user.email 'balezin_av@mail.ru' // Выясняем или устанавливаем почту для учетной записи.
        // git commit -m "first commit" // Это создание контрольной точки. (-m это флаг, сокращенно massege). "..." - Это наше название, кеоторое мы можем задать сами. Лучше на Английском. Название для нас. Данные сохраняются в служебном хешкоде.
//        System.out.println("Вносим изменения");
        // git branch // Узнаем каки есть директории.
        // git branch test // Создали папку test
        // git branch -D test // Удалили папку test
        // Когда находились на ветке мастер и создали видми, все что было на ветке мстер, перенслось на ветку ридми. И когда мы в вете создаил документ ридме, то он остался на ветке ридми, из мастера он ушел.
        // git merge readme // Соединяем ветку ридми с веткой мастер.
// После сзодания или изменения нужно сделать (git add .) потом git commit -m "..." потом вернуться на мастре. Папка сохраняет состояние той ветки на которой находимся.
        // Удаляем ветку readme // git branch -D readme
        // git log // Для оринетирования в работе. (q) для выхода в курсор доллара.
        // Создаем токен.
        // Заходим на гетхаб -> сеттингс -> ... Сохраняем токен в надежное место, чтобы можно было его взять.
        // Затем W + r -> control -> Учетные записи (Диспетчер)
        System.out.println("Проверка изменений на GitHub");
        //Команды для работы с GitHub по сохранению изменений.
//        0) git status
//        1) git add .
//        2) git commit –m “change Main” – или другое имя
//        3) git status – проверить, что все изменения внесены.
//        4) git push – без дополнительных обозначений. Публикация удаленного репозитория. Переносим комит (контрольную точку с локального репозитория, на удаленный репозиторий).

    }
}
