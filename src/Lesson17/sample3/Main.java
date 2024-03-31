package Lesson17.sample3;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Роман", 35, true, PetPreferense.DOG, new ArrayList<>(Arrays.asList("изучение языков", "чтение")));
        Person p2 = new Person("Мария", 26, true, PetPreferense.CAT, new ArrayList<>(Arrays.asList("туризм", "путешествия")));
        Person p3 = new Person("Александр", 15, false, PetPreferense.DOG, new ArrayList<>(Arrays.asList("анатомия", "биология", "туризм")));
        Person p4 = new Person("Михаил", 24, true, PetPreferense.SNAKE, new ArrayList<>(Arrays.asList("туризм")));
        Person p5 = new Person("Ольга", 55, false, PetPreferense.CAT, new ArrayList<>(Arrays.asList("путешествие", "плавание")));

        ArrayList<Person> people = new ArrayList<>(Arrays.asList(p1, p2, p3, p4, p5));
        System.out.println(filter(people, p -> p.isExtravert()));
    }
    public static ArrayList<Person> filter(ArrayList<Person> people, Bias bias){
        ArrayList<Person> filteredPeople = new ArrayList<>();
        for (Person p : people) {
            if (bias.test(p)){
                filteredPeople.add(p);
            }
        }
        return filteredPeople;
    }
}
 // Переходим в пакет sample4 11.03.24 -2- 1.06