package Lesson18.collection8.cities;

public class Cities {
    public static void main(String[] args) {
        SetCity cites = new SetCity();
        cites.addCity("Москва", 495);
        cites.addCity("Санкт-Петербург", 812);
        cites.addCity("Омск", 183);
        cites.addCity("Томск", 712);
        cites.addCity("Пенза", 312);
        cites.addCity("Новосибирск", 955);
        cites.addCity("Новгород", 554);

        System.out.println("Кол-во городов: " + cites.size() + "\n");
        System.out.println(cites);
        System.out.println("#########################");
        System.out.println("Удалим города с количеством больше 5: ");
        cites.removeCityFilter(0, 5);
        System.out.println("Количество городов: " + cites.size() + "\n");
        System.out.println(cites);
        System.out.println("#########################");
        System.out.println("Печать городов в порядке убывания");
        cites.printReversSort();

    }
}// ДЗ 32 от 20.03.24 -2- 1.16
