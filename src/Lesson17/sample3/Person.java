package Lesson17.sample3;

import java.util.ArrayList;

public class Person { // Переходим в пакет sample3 11.03.24 -2- 0.33
    private String name;
    private int age;
    private boolean extravert;
    private PetPreferense petPreferense;
    private ArrayList<String> hobbies;

    public Person(String name, int age, boolean extravert, PetPreferense petPreferense, ArrayList<String> hobbies) { // Конструктор
        this.name = name;
        this.age = age;
        this.extravert = extravert;
        this.petPreferense = petPreferense;
        this.hobbies = hobbies;
    }

    public String getName() {
        return name;
    }

    public boolean isExtravert() { // Так создется геттер для булевого значения
        return extravert;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person(name='" + this.name + "', age='" + age + "', extravert='" + extravert + "', petPreference='" + petPreferense + "', hobbies='" + hobbies + "')";
    }
}
