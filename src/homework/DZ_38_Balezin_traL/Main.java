package homework.DZ_38_Balezin_traL;

public class Main { // ДЗ от 10.04.24
    // Имитация автоматизированного светофора с помощью перечисления, описывающего переключаемые цвета светофора.
    // RED GREEN YELLOW RED GREEN YELLOW RED GREEN YELLOW
    public static void main(String[] args) {
        TrafLigWork trLig = new TrafLigWork(TrafficLight.GREEN);
        for (int i = 0; i < 9; i++){
            System.out.println(trLig.getColor());
            trLig.changWait();
        }
        trLig.cancel();
    }
}
enum TrafficLight{
    RED, GREEN, YELLOW
}
class TrafLigWork implements Runnable{
    private Thread trafLigGo;
    private TrafficLight laightNow;
    boolean stop = false;
    boolean swichLaight = false;

    TrafLigWork(TrafficLight colorGo){
        laightNow = colorGo;
        trafLigGo = new Thread(this);
        trafLigGo.start();
    }
    TrafLigWork(){
        laightNow = TrafficLight.RED;
        trafLigGo = new Thread(this);
        trafLigGo.start();
    }

    public void run(){
        while (!stop){
            try {
                switch (laightNow){
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
            }catch (InterruptedException e){
                System.out.println(e);
            }
            changLight();
        }
    }
    synchronized void changLight(){
        switch (laightNow){
            case RED:
                laightNow = TrafficLight.GREEN;
                break;
            case YELLOW:
                laightNow = TrafficLight.RED;
                break;
            case GREEN:
                laightNow = TrafficLight.YELLOW;
        }
        swichLaight = true;
        notify();
    }

    synchronized void changWait(){
        try {
            while (!swichLaight)
                wait();
            swichLaight = false;
        }catch (InterruptedException e){
            System.out.println(e);
        }
    }
    TrafficLight getColor(){
        return laightNow;
    }
    void cancel(){
        stop = true;
    }

}
