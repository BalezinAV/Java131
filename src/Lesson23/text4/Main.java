package Lesson23.text4;

public class Main {// Переходим в пакет текст4 10.04.24 -1- 1.10
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() { // Анонимный класс
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    try {
                        Thread.sleep(500); // поток, либо нить
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }
                    System.out.println("Поток 1, Итерация " + i);
                }
            }
        });

        // Анонимный класс
        Thread thread2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                try {
                    Thread.sleep(500); // поток, либо нить
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
                System.out.println("Поток 2, Итерация " + i);
            }
        });

        thread1.start();
        thread2.start();
    } // Переходим в текст5 10.04.24 -1- 1.20
}
