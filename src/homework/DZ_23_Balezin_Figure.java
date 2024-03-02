package homework;

public class DZ_23_Balezin_Figure {
    public static void main(String[] args) {
        // ДЗ 23 от 19.02.24
        // Создайте класс Figure, описывающий фигуру и класс наследник Triangle и Rectangle. Найдите площадь всех фигур. Исходные данные при проверке площади фигур (10, 20).
        // Результат: Площадь фигуры не определена: 0.0; Площадь прямоугольника: 200.0; Площадь треугольника: 100.0
        Figure f1 = new Figure();
        Rectangle t1 = new Rectangle();
        Triangle t3 = new Triangle();
        System.out.println(f1.sqFigure());
//        f1.sqFigure();
        System.out.println(t1.areaRectangle());
//        t1.areaRectangle();
        System.out.println(t3.sqFigure());
//        System.out.println(t3.sqTriangle());


    }
}

class Figure {
    int side1 = 10, side2 = 20;

    public double sqFigure() {
        System.out.print("Площадь фигуры не определена: ");
        return 0;
    }
}

class Rectangle extends Figure {
    public Rectangle() {
    }

    public double areaRectangle() {
        System.out.print("Площадь прямоугольника: ");
        return (double) side1 * side2;
    }
}

class Triangle extends Figure {
    public Triangle() {
    }

    @Override
    public double sqFigure() {
        System.out.print("Площадь треугольника: ");
        return (double) side1 * side2 / 2;
    }
//    public double sqTriangle() {
//        System.out.print("Площадь треугольника: ");
//        return (double) side1 * side2 / 2;
//    }
}
