package homework.DZ_20_Balezin_car;

public class Автомобиль {
    private String model;
    private String yarOI;
    private String manufacturer;
    private int power;
    private  String color;
    private int price;

    public Автомобиль(String model, String yarOI, String manufacturer, int power, String color, int price) {
        this.model = model;
        this.yarOI = yarOI;
        this.manufacturer = manufacturer;
        this.power = power;
        this.color = color;
        this.price = price;
    }
    void setModel(String model) {
        this.model = model;
    }
    void setYarOI(String yarOI) {
        this.yarOI = yarOI;
    }
    void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    void setPower(int power) {
        this.power = power;
    }
    void setColor(String color) {
        this.color = color;
    }
    void setPrice(int price) {
        this.price = price;
    }
    public String getModel() {
        return model;
    }
    public String getYarOI() {
        return yarOI;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public int getPower() {
        return power;
    }
    public String getColor() {
        return color;
    }
    public double getPrice() {
        return price;
    }
    void printAuto() {
        System.out.println("***** Данные автомобиля *****");
        System.out.printf("Название модели: %s%n", this.model);
        System.out.printf("Год выпуска: %s%n", this.yarOI);
        System.out.printf("Производитель: %s%n", this.manufacturer);
        System.out.printf("Мощность двигателя: %d%s%n", this.power, " л.с.");
        System.out.printf("Цвет машины: %s%n", this.color);
        System.out.printf("Цена: %d%s%n", this.price, " рублей");
        System.out.println("=============================");
    }
}
