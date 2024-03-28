package Lesson15.generics.semple_9;

public class Rectangle extends Figure{
    private double with, height;

    public Rectangle(double with, double height) { // Конструктор
        this.with = with;
        this.height = height;
    }

    @Override
    public double getArea() { // Нужно переопределить абстрактный метод (getArea)
        return this.with * this.height;
    }
}
