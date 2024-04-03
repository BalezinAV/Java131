package homework.DZ_31_Balezin_LinkList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    //ДЗ 31 от 18.03.24 LinkedList.
    // Создайте LinkedList, наполните его цветами радуги. Получите индексы следующего и предыдущего элемента через ListIterator
    // Список: [Красный, Оранжевый, Желтый, Зеленый, Голубой, Синий, Фиолетовый]
    // Результат: Список итераторов в прямом направлении: Список итераторов в обратном направлении:

    public static void main(String[] args) {
        Colors coloR1 = new Colors("Красный");
        Colors coloR2 = new Colors("Оранжевый");
        Colors coloR3 = new Colors("Желтый");
        Colors coloR4 = new Colors("Зеленый");
        Colors coloR5 = new Colors("Голубой");
        Colors coloR6 = new Colors("Синий");
        Colors coloR7 = new Colors("Фиолетовый");
        LinkedList<Colors> crR = new LinkedList<>();
        crR.add(coloR1);
        crR.add(coloR2);
        crR.add(coloR3);
        crR.add(coloR4);
        crR.add(coloR5);
        crR.add(coloR6);
        crR.add(coloR7);
        System.out.print("Список: ");
        System.out.println(crR);
        ListIterator<Colors> listIterator = crR.listIterator();
        System.out.println("Список итераторов в прямом направлении:");
        while (listIterator.hasNext()){
            System.out.println("Индекс = " + listIterator.nextIndex() + ", Элемент = " + listIterator.next());
        }
        System.out.println("Список итераторов в обратном направлении:");
        while (listIterator.hasPrevious()){
            System.out.println("Индекс = " + listIterator.previousIndex() + ", Элемент = " + listIterator.previous());
        }

    }
}

class Colors{
    String color;

    public Colors(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return this.color;
    }
}
