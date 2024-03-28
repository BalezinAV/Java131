package Lesson15.generics.sample_7;

public class Main {
    public static void main(String[] args) {
        Point <Float> pt = new Point<>(); // Так как нет конструктора , то () пустые.
        pt.setCoord(10f, 20f);

        System.out.println(pt.getCoord(TypeCoord.COORD_X));
        System.out.println(pt.getCoord(TypeCoord.COORD_Y));
    }
}

enum TypeCoord{
    COORD_X, COORD_Y;
}
interface GeomInterface<T>{
    void setCoord(T x, T y);
    T getCoord(TypeCoord type);
}

class Point <TT> implements GeomInterface<TT>{ // Нужно реализовать методы гет и сет. Назвали ТТ чтобы модно было отличить.
    private TT x, y;
    @Override
    public void setCoord(TT x, TT y) { // Реализуем метод
        this.x = x;
        this.y = y;
    }
    @Override
    public TT getCoord(TypeCoord type) {
        return (type == TypeCoord.COORD_X) ? x : y; // Тернарный оператор
    }
}// Продолжить 04.03.24 -2- 0.
