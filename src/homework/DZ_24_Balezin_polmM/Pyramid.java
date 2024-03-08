package homework.DZ_24_Balezin_polmM;

public class Pyramid extends FigureAbs{
    private int height;
    private int side;
    public Pyramid(int height, int side, String color){
        super(color);
        this.height = height;
        this.side = side;
    }

    @Override
    public double volumeF() {
        return (Math.pow(this.side, 2) * this.height) / 3;
    }

    @Override
    public void inFO() {
        System.out.printf("Фигура: %s | Объем фигуры: %.2f%n", getColor(), volumeF());
    }
}
