package Lesson16;

public class Sample {
    public static void main(String[] args) throws NegativeWidthException {
        Squaer squaer = new Squaer(-10);
        System.out.println("Ширина квадрата: " + squaer.getWidth());
//        squaer.setWidth(-2);
//        System.out.println("Ширина квадрата: " + squaer.getWidth());
        System.out.println("Площадь: " + squaer.calculateArea(squaer.getWidth()));

    }
}

class NegativeWidthException extends Exception{
    public NegativeWidthException(String massage){ // Конструктор
        super(massage);
    }
}

class Squaer{
    private int width;

    public Squaer(int width) { // Конструктор
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int calculateArea(int width) throws NegativeWidthException{
        if (width > 0){
            return width * width;
        }else {
            throw new  NegativeWidthException("Ширина квардрата: " + width + ". Значение не может быть отрицательным!"); // Нужно использовать (new)
        }
    }
}
 // 06.03.24 -2- 0.20 переходим в класс Test