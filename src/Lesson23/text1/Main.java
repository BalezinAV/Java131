package Lesson23.text1;

public class Main { // Переходим в пакет текст1 10.04.24 -1- 0.44
    public static void main(String[] args) {
        Concurrency thread1 = new Concurrency(1);
        Concurrency thread2 = new Concurrency(2);

        thread1.start();// метод старт запустит метод ран
        thread2.start();
//        thread1.run();// при такой записаи многопоточности не будет
//        thread2.run();
    }
}

class Concurrency extends Thread{
    private int num;

    public Concurrency(int num) {
        this.num = num;
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
    } // Переходим в пакет текст 2. 10.04.24 -1- 0.58
}