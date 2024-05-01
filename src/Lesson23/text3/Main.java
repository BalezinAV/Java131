package Lesson23.text3;

public class Main {// Переходим в паке текст3 10.04.24 -1- 1.05

    public static void main(String[] args) {
        Concurrency thread1 = new Concurrency(1);
        Concurrency thread2 = new Concurrency(2);
        thread1.start();
        thread2.start();
    }
}
class Concurrency extends Thread {
    private int num;
    private Thread t; // Конструктор не меняем

    public Concurrency(int num) {
        this.num = num;
    }

    public void start(){ // Экземпляр класса Thread создастся здесь.
        if (t == null){ // Переопределили метод (start) чтобы Concurrency создал экземпляр класса Thread.
            t = new Thread(this);
            t.start();
        }
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(500); // поток, либо нить
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println("Цикл " + this.num + ", Итерация " + i);
        }
    } // Переходим в пакет текст4 10.04.24 -1- 1.10
}