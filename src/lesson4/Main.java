package lesson4;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

//        Методы Math
//        float num = 5,25f;
//
//        System.out.println(Math.round(num)); // 5. round - округляет до целого числа. По законам математики.
//        System.out.println(Math.ceil(num)); // 6.0 ceil - округляет в верхнюю сторону в не зависимости от значения знаков после запятой.
//        System.out.println(Math.floor(num)); // 5.0 floor - Округляет в нижнюю сторону.
//        System.out.println(Math.sqrt(4)); // 2.0
//        System.out.println(Math.pow(4, 2)); // 16.0 Для возведения в степень нужно указать два параметра. Число и степень.

        //Задача. Найти радиус и длину окружности.
//        System.out.print("Ввудите радиус окружности: ");
//        int radius = input.nextInt();
//        System.out.printf("Длинна окружности: %.2f", 2 * Math.PI * radius);

        //Задача. Посчитать гипотенузу по введенным катетам.
//        System.out.print("Введите катет А: ");
//        int a = input.nextInt();
//        System.out.print("Введите катет B: ");
//        int b = input.nextInt();
////        System.out.printf("Гипотенуза: %.1f", Math.hypot(a, b)); // hypot Это метод для расчета гипотенузы.
//        System.out.print("Гипотенуза: " + Math.sqrt(a * a + b * b));

        // Работа с датой и временем. (Появился самым первым).
//        Date current = new Date(); // Если ничего не передаем, то получаем текущую дату.
//        System.out.println(current); // Это мили секунд, с 01.01.1970 - начало цифровой эпохи.
//        Date current = new Date(89, 2, 22, 12, 15, 30); // год, мес(0,1,2,3), день. ЧЧ, Мин, Сек. Для задания 2005г нужно ввести 105. 2123 - 223!
//        System.out.println(current);
//        System.out.println(current.getYear());
//        System.out.println(current.getMonth());
//        current.setMonth(5); // Нумерация месяцев начинается с 0
//        System.out.println(current);

        // ДЗ от 25.12.2023
        // Вычислить площадь фигуры 1 - треугольник; 2 - прямоугольник; 3 - окружность. а=15; б=20; с=6.

//// Лекция от 27.12.2023
//        System.out.println(current.getTime()); // Колличество мили секунд от 1970 г., до текущей даты.
//        System.out.printf("%1$s %2$td %2$tB %2$tY %n", "Дата:", current); // папка 5 подстановочные символы.
//        System.out.printf("%s %te %<tB %<tY %n", "Дата:", current);
//// Преобразование стрки в объект Date
//        current.setTime(Date.parse("Jul 06 12:15:00 2021"));
//        System.out.println(current);

        // Календарь - Делаем импорт календаря из Ява.
//Calendar calendar = new GregorianCalendar(2022, 03, 12); // 2022, 03, 12
//        System.out.println(calendar);
//        System.out.println(calendar.get(Calendar.ERA)); // За счет констант мы получаем любые значения.
//        System.out.println(calendar.get(Calendar.YEAR));
//        System.out.println(calendar.get(Calendar.MONTH));
//        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
//        System.out.println(calendar.get(Calendar.HOUR));
        // Проверка года на высокосный
//        GregorianCalendar calendar1 = new GregorianCalendar(2023, 02, 12); // Здесь можно ввести год, месяц, день, время. Если не указывать, то выдаст текущее. Отсчет месяцев идет с 0.
//        int year = calendar1.get(Calendar.YEAR);
//        System.out.println(calendar1.isLeapYear(year)); // true если год високосный. false если год не высокосный. Работает с Григарианским календарем.
//        System.out.println(calendar1.get(Calendar.MONTH));
//        System.out.println(calendar1.getActualMaximum(Calendar.DAY_OF_MONTH));

        // Задача. Проверить на високосность. Дата: Ноябрь 02 2023 Время: 1:18:1 2023 - не високосный.
//        String[] mounths = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
//
//        GregorianCalendar calendar2 = new GregorianCalendar();
//        calendar2.set(Calendar.YEAR, 2024); // Для примера установили год.
//        calendar2.set(Calendar.MONTH, 0); // Пошагово перезаписываем массив.
//        calendar2.set(Calendar.DAY_OF_MONTH, 15);
//        System.out.print("Дата: " + mounths[calendar2.get(Calendar.MONTH)] + " "); // Получаем номер месяца.
//        System.out.print(calendar2.get(Calendar.DATE) + " ");
//        System.out.println(calendar2.get(Calendar.YEAR) + " ");
//        System.out.print("Время: " + calendar2.get(Calendar.HOUR) + ":");
//        System.out.print(calendar2.get(Calendar.MINUTE) + ":");
//        System.out.println(calendar2.get(Calendar.SECOND));
//        int year = calendar2.get(Calendar.YEAR);
//        System.out.print(year + " - ");
//        System.out.print(calendar2.isLeapYear(year) ? "високосный" : "не високосный"); // Тернарный оператор.

        // Задача. Определить возраст пользователю если он оставит свои данные.
//        Calendar date1 = new GregorianCalendar();
//        Calendar date2 = new GregorianCalendar();
//        date1.set(Calendar.YEAR, 2000);
//        int year1 = date1.get(Calendar.YEAR);
//        int year2 = date2.get(Calendar.YEAR);
//        System.out.println(year2 - year1);

//        Calendar calendar = new GregorianCalendar(2024, Calendar.FEBRUARY, 28);
////        calendar.add(Calendar.DAY_OF_MONTH, 2); // Мы добавили 2 дня к установленной дате.
////        calendar.add(Calendar.DAY_OF_MONTH, -2); // Мы убрали 2 дня от установленной даты.
//        calendar.roll(Calendar.MONTH, -2); // Убрали 2 месяца.
//        System.out.println(calendar.getTime());

//        Calendar calendar = new GregorianCalendar();
//        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, d MMMM yyyy"); // Это наименование дня недели;
//        System.out.println(dateFormat.format(calendar.getTime()));

        // Время исполнения программы.
//        long start = System.currentTimeMillis();
////        System.out.println(start);
//
//        for (int i = 0; i < 1000; i++) {
//            System.out.println("Случайное число: №" + i + ": " + (int) (Math.random() * 10));
//        }
//        long timeWorkProgram = System.currentTimeMillis() - start;
//        System.out.println("Скорость выполнения программы: " + timeWorkProgram + " миллисекунд");

    }
}
