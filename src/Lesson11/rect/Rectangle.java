package Lesson11.rect;

public class Rectangle {
    private int length; // Модификатор доступв peivate обязывает создать геттеры и сеттеры к этим полям.
    private int width;
    // Конструктор
    public Rectangle(int length, int width) {
//        this.length = length; // Что бы исключить отрицательные числа в принципе, делаем инициализацию через сеттер.
//        this.width = width;
        setLength(length);
        setWidth(width);
    }
    // Геттеры и сеттеры, так как у нас есть private.

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setLength(int length) {
        if (length > 0){
            this.length = length;
        }else {
            System.out.println("'" + length +  "' должно быть положительным числом");
        }
    }

    public void setWidth(int width) {
        if (width > 0){
            this.width = width;
        }else {
            System.out.println("'" + width +  "' должно быть положительным числом");
        }
    }
    // Создаем метод для площади.
    public int getArea(){
        return this.length * this.width;
    }
    // Создаем метод для периметра
    public int getPerimeter(){
        return 2 * (this.length + this.width);
    }
    // Метод гипотенузы
    public double getHypotenuse(){ // При такой записи метода не нужно делать явное преобразование типов.
        return Math.sqrt(Math.pow(this.length, 2) + Math.pow(this.width, 2));
    }
    // Метод для рисования
    public void getDraw(){
        for (int i = 0; i < this.length; i++) {
            for (int j = 0; j < this.width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
} // Делаем новую задачу в новом классе Main 07.02.24 -2- 0.35
