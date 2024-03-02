package homework.DZ_22_Balezin_ext;

public class Main {
    //ДЗ 22 от 14.02.24 Создать класс Student, от него будет унаследован класс Aspirant. Необходимо найти сумму стипендии,
    // котрая зависит от полученного балла. Если средняя оценка студента == 5, то сумма 1000, иначе 800. Если средняя
    // оценка аспиранта равна 5,то самма 2000, иначе 1800.
    // Результат
    // Виктор Вербов, группа Gr111, сумма стипендии: 1000.0
    // Александр Невзоров, группа Gr222, тема рабты: 'Work1', сумма стипендии: 1800.0
    // Антон Бобров, группа Gr333, тема работы: 'Work2', сумма стипендии: 2000.0
    public static void main(String[] args) {
        Aspirant aspirant = new Aspirant(6,4, 7);
        System.out.println(aspirant.getRewardSt());
        System.out.println(aspirant.getRewardAsp());
        System.out.println(aspirant.getRewardAsp1());

    }
}
