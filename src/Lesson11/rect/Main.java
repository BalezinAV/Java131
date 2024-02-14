package Lesson11.rect;

public class Main {
    public static void main(String[] args) {
// После создания конструктора, геттеров и сеттеров создаем экземпляр класса.
        Rectangle rect1 = new Rectangle(4, 12);
        rect1.setLength(3); // Так мы изменяем значения
        rect1.setWidth(9);
        System.out.printf("Длина прямоугольника: %d%n", rect1.getLength());
        System.out.printf("Ширина прямоугольника : %d%n", rect1.getWidth());
        System.out.printf("Площадь прямоугольника: %d%n", rect1.getArea());
        System.out.printf("Периметр прямоугольника: %d%n", rect1.getPerimeter());
        System.out.printf("Гипотенуза прямоугольника: %.2f%n", rect1.getHypotenuse());
        rect1.getDraw();
    }
} // Делаем новую задачу в новом классе Main 07.02.24 -2- 0.35
