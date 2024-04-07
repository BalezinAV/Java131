package Lesson18.collection8.cities;

public class City implements Comparable<City>{// Задача. Продолжить 20.03.24 -2- 0.25 пакет cities
    private String name;
    private int codeCity;

    public City(String name, int codeCity) {
        this.name = name;
        this.codeCity = codeCity;
    }

    public String getName() {
        return name;
    }

    public int getCodeCity() {
        return codeCity;
    }

    @Override
    public String toString() {
        return "name: " + this.name + "; code: " + this.codeCity + ";";
    }

    @Override // Реализуем интерфейс Comparable
    public int compareTo(City o) { // Обычная сортировка по возрастанию
        return o != null ? name.compareTo(o.name) : 0;
    }
}
