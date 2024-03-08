package homework.DZ_24_Balezin_polmM;

public class Cylinder extends FigureAbs{
    private int radius;
    private int height;

    public Cylinder(int radius, int height, String color) {
        super(color);
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double volumeF() {
        return Math.PI * (Math.pow(this.radius, 2)) * this.height;
    }

    @Override
    public void inFO() {
        System.out.printf("Фигура: %s  | Объем фигуры: %.2f%n", getColor(), volumeF());
    }
}
