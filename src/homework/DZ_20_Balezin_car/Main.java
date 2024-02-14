package homework.DZ_20_Balezin_car;

public class Main {
    public static void main(String[] args) {
        Автомобиль auto1 = new Автомобиль("X7 M50i", "2021", "BMW", 530, "white", 10790000);
        auto1.printAuto();
        auto1.setPrice(20000000);
        auto1.getPrice();
        auto1.printAuto();
    }
}
