package Lesson15.generics.semple_9;

public class Circle extends Figure{
    private double radius;

    public Circle(double radius) { // Констркутор
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
