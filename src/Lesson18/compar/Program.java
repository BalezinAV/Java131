package Lesson18.compar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Program {
    // Переходим в класс Program 18.03.24 -2- 0.29
    public static void main(String[] args) {
        University un1 = new University("Университет", 300);
        University un2 = new University("Начальная школа", 150);
        University un3 = new University("Средняя школа", 357);
        University un4 = new University("Высшая школа", 246);
        University un5 = new University("Музыкальная школа", 789);
        SortUniversity sortUniversity = new SortUniversity();
        int res = sortUniversity.compare(un1, un2);
        switch (res){
            case  -1:{
                System.out.println(un2.getName() + " больше");
                break;
            }
            case 1:{
                System.out.println(un1.getName() + " больше");
                break;
            }
            default:
                System.out.println("Два учебных заведения одинаковые");
        }
        System.out.println("\nСортировка по имени:");
        SortNameUniversity nameUniversity = new SortNameUniversity();
        ArrayList<University> list = new ArrayList<>();
        list.add(un1);
        list.add(un2);
        list.add(un3);
        list.add(un4);
        list.add(un5);
        Collections.sort(list, nameUniversity); // Нужно указывать несколько параметров сортировки
        for (University name: list) {
            System.out.println(name.getName() + " " + name.getNum_of_students());
        }

        System.out.println("\nСортировка по количеству:");
        Collections.sort(list, sortUniversity);
        for (University name: list) {
            System.out.println(name.getName() + " " + name.getNum_of_students());
        }

    }
}

class University{ // Класс остается без имплементирования какого-то интерфейса. Но для сортировки нужно создать еще один класс, который будет использовать Comparator
    private String name;
    private int num_of_students;

    public University(String name, int num_of_students) {
        this.name = name;
        this.num_of_students = num_of_students;
    }

    public String getName() {
        return name;
    }

    public int getNum_of_students() {
        return num_of_students;
    }
}

class SortUniversity implements Comparator<University>{ // Нужно создать отдельный класс.
    // Сортировка по количеству
    @Override // Переопределить нужно именно его
    public int compare(University o1, University o2) {
        if (o1.getNum_of_students() == o2.getNum_of_students())
            return 0;
        else
            return o1.getNum_of_students() > o2.getNum_of_students() ? 1 : -1;
    }
}

class SortNameUniversity implements Comparator<University>{ // Сортировка по названию
    @Override
    public int compare(University o1, University o2) {
        return o1.getName().compareTo(o2.getName());
    } // Таких классво по сортировке можно написать сколько угодно. Но это делать нужно по каждому свойству.
} // 18.03.24 -2- 1.10 переходим пакет collection5