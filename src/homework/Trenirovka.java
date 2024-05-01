package homework;

public class Trenirovka {
    public static void main(String[] args) {
        TrafficLightSimulator tl = new TrafficLightSimulator(TrafficLightColor.GREEN);
            for (int i=0; i < 9; i++) {
                System.out.println(tl.getColor());
                tl.waitForChange();
            }
            tl.cancel();
        }
    }

    enum TrafficLightColor {
        RED, GREEN, YELLOW
    }

    class TrafficLightSimulator implements Runnable {
        private Thread thrd; // Поток для имитации светофора
        private TrafficLightColor tic; // Текущий цвет светофора
        boolean stop = false; // Остановка имитации, если истинно
        boolean changed = false; // Переключение светофора, если истинно

        TrafficLightSimulator(TrafficLightColor init) {
            tic = init;

            thrd = new Thread(this);
            thrd.start();
        }

        TrafficLightSimulator() {
            tic = TrafficLightColor.RED;

            thrd = new Thread(this);
            thrd.start();
        }


        public void run() {
            while (!stop) {
                try {
                    switch (tic) {
                        case GREEN:
                            Thread.sleep(1000);
                            break;
                        case YELLOW:
                            Thread.sleep(800);
                            break;
                        case RED:
                            Thread.sleep(1200);
                            break;
                    }
                } catch (InterruptedException exc) {
                    System.out.println(exc);
                }
                changeColor();
            }
        }
    synchronized void changeColor() {

        switch(tic) {
            case RED:
                tic = TrafficLightColor.GREEN;
                break;
            case YELLOW:
                tic = TrafficLightColor.RED;
                break;
            case GREEN:
                tic = TrafficLightColor.YELLOW;
        }

        changed = true;
        notify(); // уведомить о переключении цвета светофора
    }
    synchronized void waitForChange() {
        try {
            while(!changed)
                wait(); // ожидать переключения цвета светофора
            changed = false;
        } catch(InterruptedException exc) {
            System.out.println(exc);
        }
    }
    TrafficLightColor getColor() {
        return tic;
    }
    void cancel() {
        stop = true;
    }
}


