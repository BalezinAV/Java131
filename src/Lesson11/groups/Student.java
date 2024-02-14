package Lesson11.groups;

public class Student {
    // Задача. Создать массив из 10 элементов. Поля ФИО, номер группы, успеваемость. Предусаотреть ввод ФИО и группу. Оценить от 7 до 12 баллов включительно.
    private String name;
    private String initials;
    private int group;
    private int marks[];

    // Конструкторы
    public Student(String name, String initials, int group){
        this.name = name;
        this.initials = initials;
        this.group = group;
        this.marks = new int[5];
    }

    public void print(){ // Метод для вывода.
        System.out.printf("%-16s %-8s", this.name, this.initials);
        System.out.printf("Группа: %-4d Оценки: ", this.group);
        for (int i = 0; i < this.marks.length; i++) {
            System.out.print( this.marks[i] + " ");
        }
        System.out.println();
    }
}
