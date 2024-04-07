package Lesson18.compar;

public class Main {// Переходим к пакет compar 18.03.24 -2- 0.16
    // Comparable - Интерфейс. Позваляет выполнить естественную сортировку на основе какого-либо свойства
// Comparator - наследует от Интерфейсас и позваоляет выполнять по любому количеству свойств (полей).
    public static void main(String[] args) {
        Person e1 = new Person("Александр", 25);
        Person e2 = new Person("Светлана", 25);
        int res = e1.compareTo(e2);
        switch (res){
            case -1: {
                System.out.println(e2.getName() + " старше");
                break; // Нужен break иначе будут отрабатывать все кейсы
            }
            case 1: {
                System.out.println(e1.getName() + " старше");
                break;
            }
            default:
                System.out.println("Люди одного возраста");
        }
    }
}

class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override // Метод в классе может быть переопределн только один раз.
    public int compareTo(Person o) {
        if (this.age == o.age)
            return 0;
        else
            return this.age > o.age ? 1: -1;
    }
} // Переходим в класс Program 18.03.24 -2- 0.29
