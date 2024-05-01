package Lesson23.text5;

public class Main { // Переходим в текст5 10.04.24 -1- 1.20
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Concurrency());

        Thread thread2 = new Thread(() -> {
            try {
                thread1.join(); // Это метод остановит поток 2 пока не выполнится поток 1
            }catch (InterruptedException e){
                System.out.println("Я не мог дождаться, мня прервали: " + e);
            }
            for (int i = 1; i <= 5; i++) {
                try {
                    Thread.sleep(500); // поток, либо нить
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
                System.out.println("Поток 2 , Итерация " + i);
            }
        });

        thread1.start();
        thread2.start();
    }
}

class Concurrency implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(500); // поток, либо нить
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println("Поток 1 , Итерация " + i);
        }
    } // Переходим в пакет текст6 10.04.24 -2- 0.15
}