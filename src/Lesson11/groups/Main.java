package Lesson11.groups;

public class Main {
    public static void main(String[] args) {
        // Задача. Создать массив из 10 элементов. Поля ФИО, номер группы, успеваемость. Предусаотреть ввод ФИО и группу. Оценить от 7 до 12 баллов включительно.
        int n = 10;
        Student students[] = new Student[n];
        students[0] = new Student("Петров", "А.В.", 1);
        students[1] = new Student("Петров", "В.И.", 1);
        students[2] = new Student("Иванов", "А.К.", 1);
        students[3] = new Student("Вербов", "А.В.", 2);
        students[4] = new Student("Долгих", "В.А.", 2);
        students[5] = new Student("Шишкин", "А.И.", 3);
        students[6] = new Student("Репков", "Л.Ф.", 3);
        students[7] = new Student("Матрешкина", "И.В.", 3);
        students[8] = new Student("Волков", "А.В.", 3);
        students[9] = new Student("Колганов", "А.В.", 3);

        System.out.println("Все студенты: ");
        for (int s = 0; s < students.length; s++) {
            students[0].print();
        }
    }
}
// ДЗ 07.02.24 -2- 1.19
// Реализовать класс "Автомобиль". В полях класса: Название модели, год выпуска, производитель, мощность двигателя, цве машины, цена. Реализовать методы класса для вывода данных, реаизовать доступ к отдельным полям через методы класса.
// Контсрукторы, геторы и сеторы, закрытые поля. Мощность число, "л.с." можно дописать при выводе. Можно добавить условие проверки в сетторе?