package homework.DZ_24_Balezin_polmM;

public abstract class FigureAbs {
    private String color;
    public FigureAbs (String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public abstract double volumeF();
    public abstract void inFO();
}
