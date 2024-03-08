package homework.DZ_24_Balezin_polmM;

public class Ball extends FigureAbs{
    private int radius;
    public Ball(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double volumeF() {
        return (4 / 3) * (Math.PI * (Math.pow(this.radius, 2)));
    }

    @Override
    public void inFO() {
        System.out.printf("Фигура: %s      | Объем фигуры: %.2f%n", getColor(), volumeF());
    }
}
