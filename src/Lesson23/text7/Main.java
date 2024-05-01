package Lesson23.text7;

public class Main {// Задача с методами wait - состояние ожидание; notify - продолжает работу потока, который был остановлен; notifyAll - возобновляет работу всех потоков.
    // 10.04.24 -2- 0.27. Пакет текст7
    public static void main(String[] args) {
        Custumer custumer = new Custumer();

        new Thread(() -> custumer.withdraw(1500)).start();
        new Thread(() -> custumer.deposit(1000)).start();
//        new Thread(() -> custumer.withdraw(2500)).start(); // Когда одинаковых потоков несколько, то они отрабатывают не предсказуемо.
//        new Thread(() -> custumer.deposit(2000)).start();
    }
}

class Custumer{
    int amount = 1000;

    public synchronized void withdraw(int amount){
//    public void withdraw(int amount){
        System.out.println("Попытка снятия ($" + amount + ") денежных средств...");

        if (this.amount < amount){
            System.out.println("На вашем счету: $" + this.amount + ". Балланс слишком мал, ожидание депозита (вклада)");

            try {
                wait();
            }catch (InterruptedException e){
                System.out.println("Поторк прерван: " + e);
            }
        }

        this.amount -= amount;
        System.out.println("Деньги сняты. На счету осталось: $" + this.amount);
    }

    public synchronized void deposit(int amount){
//    public void deposit(int amount){
        System.out.println("Попытка внести деньги ($" + amount + ") на депозит...");

        this.amount += amount;

        System.out.println("Деньги на депозит положены. Всего на счету: $" + this.amount);
//         notifyAll();
         notify();
    } // Задача 10.04.24 -2- 1.00 пакет текст8
}