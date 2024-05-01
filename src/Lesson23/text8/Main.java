package Lesson23.text8;

public class Main { // Задача 10.04.24 -2- 1.00 пакет текст8
    public static void main(String[] args) {
        Store store = new Store();
        Thread produser = new Thread(new Produser(store));
        Thread consumer = new Thread(new Consumer(store));
        produser.start();
        consumer.start();
    } // ДЗ от 10.04.24 -2- 1.20 на метод слип.
}

class Store {
    private int product = 0;

    public synchronized void get() {
        while (product < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Поток прерван: " + e);
            }
        }
        product--;
        System.out.println("Покупатель купил 1 товар");
        System.out.println("Товаров на складе: " + product);
        notify();
    }

    public synchronized void put(){
        while (product >= 3){
            try {
                wait();
            }catch (InterruptedException e){
                System.out.println("Поток прерван: " + e);
            }
        }
        product++;
        System.out.println("Производитель добавил 1 товар");
        System.out.println("Товаров на складе: " + product);
        notify();
    }
}

class Produser implements Runnable{
    Store store;

    public Produser(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            store.put(); // Будем добавлять товары
        }
    }
}
class Consumer implements Runnable{
    Store store;

    public Consumer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            store.get(); // Будем покупать товары из магазина.
        }
    }
}