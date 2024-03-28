package Lesson15.generics.semple_8;

public class Main {
    public static void main(String[] args) {
        Point2D<Integer> p1 = new Point2D<>(1, 50, 70); // Дженерики ограничивают по передаче типов данных. Типы данных должны быть одинаковыми.
        Point3D<Float> p2 = new Point3D<>(2f, 10f, 20f, 30f); // Все параметры, на основе которого создаются экземпляры классов, должны быть одного типа данных.
        System.out.println(p1);
        System.out.println(p2);

    }
}

class PointProp<T>{
//class PointProp{ // убрали дженерик, чтобы можно было передать int
    T id;
//    int id;

    public PointProp(T id) { // Конструктор
//    public PointProp(int id) { // Конструктор для передачи другого типа данных

        this.id = id; // Аргумсент Т любого типа данных
    }
}

class Point2D<T2D> extends PointProp<T2D>{
//class Point2D<T2D> extends PointProp{ // убрали дженерик, чтобы можно было передать int
    T2D x, y;

    public Point2D(T2D id, T2D x, T2D y) { // Конструктор
//    public Point2D(int id, T2D x, T2D y) { // Конструктор
        super(id);
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Координаты с id " + this.id + ": (" + this.x + ", " + this.y + ")";
    }
}

class Point3D<T3D> extends PointProp<T3D>{
//class Point3D<T3D> extends PointProp{ // убрали дженерик, чтобы можно было передать int
    T3D x, y, z;

    public Point3D(T3D id, T3D x, T3D y, T3D z) { // Конструктор
//    public Point3D(int id, T3D x, T3D y, T3D z) { // Конструктор
        super(id);
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "Координаты с id " + this.id + ": (" + this.x + ", " + this.y + ", " + this.z + ")";
    }
} // Задача 04.03.24 -2- 0.16. Переходим в пакет semple 9
