package homework.DZ_24_Balezin_polmM;

public class Main {
    // ДЗ 24 от 21.02.24 Абстракт и полиморфизм
    // Реализуйте иерархию классов, описывающую трехмерные фигуры. Родительский класс должен иметь абстрактный метод нахождения
    // объема фигур. С помощью полиморфизма реализуйте вывод даннх.
    // Результат:
    // Фигура: шар      | Объем фигуры: 381,70
    // Фигура: цилиндр  | Объем фигуры: 25,13
    // Фигура: пирамида | Объем фигуры: 2000,00

    public static void main(String[] args) {
        final int N = 3;
        FigureAbs[] figure = new FigureAbs[N];
        figure[0] = new Ball(3, "ШАР");
        figure[1] = new Cylinder(5, 6, "ЦИЛИНДР");
        figure[2] = new Pyramid(40, 10, "ПИРАМИДА");
        for (FigureAbs vol: figure) {
            vol.inFO();
        }
    }

}
