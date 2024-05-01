package Lesson23;

public class Main {// Лекция от 10.04.24 -1- 0.28
    // Главный поток запускается через блок main. Есть многопоточность. Это разделение потоков для выполнения нескольких задачь. Параллельное выполнение кодов.
    // У потока есть жизненный цикл.
    // Есть знчение приоритетов потоков min = 1; max = 10. По умолчанию всем присваиваетется 5.
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(500); // поток, либо нить
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println("Цикл 1, Итерация " + i);
        }

        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(500); // поток, либо нить
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println("Цикл 2, Итерация " + i);
        }
    } // Переходим в пакет текст1 10.04.24 -1- 0.44
}

