package Lesson21;
import java.io.*;
import java.util.ArrayList;
public class Test6 {// переходим к клас тест 6 08.04.24 -1- 0.11

    public static void main(String[] args) {
        ArrayList<Persons> people = new ArrayList<>();
        people.add(new Persons("Александр", 37, 187, true));
        people.add(new Persons("Михаил", 30, 175, false));

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.txt"))) {
//            Persons p = new Persons("Александр", 37, 187, true);
//            oos.writeObject(p);
            oos.writeObject(people);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        ArrayList<Persons> newPeople = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.txt"))) {
            newPeople = (ArrayList<Persons>) ois.readObject();
//            Persons p1 = (Persons) ois.readObject();
//            System.out.printf("Name: %s \t Age: %d %n", p1.getName(), p1.getAge());
        } catch (Exception ex) {
            System.out.println(ex.getMessage()); // Получили данные из нечитаемого файла
        }
        for (Persons p1 : newPeople) {
            System.out.printf("Name: %s \t Age: %d %n", p1.getName(), p1.getAge());
        }
    }
}

class Persons implements Serializable {
    private String name;
    private transient int age; // transient это ключевое слово позволяет исключить использовать этот объект.
    //        private int age;
    private double height;
    private boolean married;

    public Persons(String name, int age, double height, boolean married) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.married = married;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public boolean isMarried() {
        return married;
    } // Продолжить 08.04.24 -1- 0.28
    // Новая тема MVC. 08.04.24 пакет лессон 22
}
