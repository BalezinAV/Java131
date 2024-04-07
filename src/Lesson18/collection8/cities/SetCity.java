package Lesson18.collection8.cities;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

public class SetCity { //Для разделения даннх для городов. Тип данных
    private Set<City> hash = new  HashSet<>();
    private Set<City> tree = new TreeSet<>();

    public int size(){
        return hash.size() + tree.size();
    }

    private boolean isEven(int code){
        return code % 2 == 0; // Проверка на четность
    }

    public boolean addCity(String name, int code){
        boolean result = name != null && name.length() > 0; //Если есть хотябы есть один символ
        if (result){
            if (isEven(code)){
                hash.add(new City(name, code));
            } else {
                tree.add(new City(name, code));
            }
        }
        return result;
    }

    public void printReversSort(){
        TreeSet<City> treeSet = new TreeSet<>(this.tree); // Здесь элементы хранятся по возрастанию
        treeSet.addAll(this.hash);
        Iterator<City> iterator = treeSet.descendingIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public void removeCityFilter(int minSymbol, int maxSymbol){
        hash.removeIf(x -> x.getName().length()< minSymbol || x.getName().length() > maxSymbol);
        tree.removeIf(x -> x.getName().length()< minSymbol || x.getName().length() > maxSymbol);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Список городов с четным кодом (HashSet):\n");
        for (City city: hash) {
            sb.append(city).append("\n");
        }
        sb.append("\n").append("Список городов с нечетным кодом (Treeset):\n");
        for (City city: tree) {
            sb.append(city).append("\n");
        }
        return sb.toString();
    }
}
