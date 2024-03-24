package homework.DZ_25_Balezin_interface;

public class Main {
    //ДЗ 25 от 26.02.24.
    // Напишите Java-прграмму для создания интерфейса с возможностью изменения размера с помощью методов resize Width (int width)
    // и resixe Height (int height), которые позволяют изменять размер объекта. Создайте класс Reactangle, который реализует
    // интерфейс с возможностью изменения размера и реализует методы изменения размера.
    // Результат Width: 100, Height: 150
    //           Width: 250, Height: 300

    public static void main(String[] args) {
//        Resize.showSize();
        Rectangle rectangle = new Rectangle(100, 150);
        rectangle.reSize();
//        rectangle.setWidth(600);
//        rectangle.setHeight(500);
//        rectangle.reSize();
        rectangle.checkWidth(-800);
        rectangle.checkHeight(600);
        rectangle.reSize();
        rectangle.REsize(170, 370);
        rectangle.reSize();
        rectangle.ReSize(-200, 300);
        rectangle.reSize();
    }
}

interface Resize {
    int WIDTH = 100;
    int HEIGHT = 250;

    static void showSize() {
        System.out.println("Width: " + WIDTH + ", " + "Height: " + HEIGHT);
    }
}

class Rectangle implements Resize {
    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    private boolean resizeWidth(int width) {
        return width > 0;
    }

    private boolean resizeHeight(int height) {
        return height > 0;
    }

//    public void setWidth(int width) {
//        if (resizeWidth(width)) {
//            this.width = width;
//        }
//    }
//
//    public void setHeight(int height) {
//        if (resizeHeight(height)) {
//            this.height = height;
//        }
//    }

    void checkWidth(int width) {
        if (resizeWidth(width)) {
            this.width = width;
        }
    }

    void checkHeight(int height) {
        if (resizeHeight(height)) {
            this.height = height;
        }
    }
    void REsize(int width, int height){
        if (resizeWidth(width) && resizeHeight(height)){
            this.width = width;
            this.height = height;
        }
    }
    void ReSize(int width, int height){
        if (resizeWidth(width) || resizeHeight(height)){
            this.width = width;
            this.height = height;
        }
    }

    public void reSize() {
        System.out.println("Width: " + this.width + ", Height: " + this.height);
    }
}

