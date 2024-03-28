package Lesson16.dog;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Лкусус");
//        dog.putCollar();
        dog.putLeash();
        dog.putMuzzle(); // Если закомментируем, то метод не будет вызван. То есть переменная не поменялась на значение true

        try {
            dog.walk(); // Нужно обработать исключение, то есть поймать его. Так как мы сделали свое исключение, мы должны его обработать.
        }catch (GogIsNotReadyException e){
//            System.out.println(e);
            System.out.println(e.getMessage());
//            e.printStackTrace(); // Так мы сами выбрасываем исключение и останавливаем программу. Это метод класса Exception
            System.out.println("\nПроверяем снаряжениеп!\nОшейник надет: " + dog.isCollarPutOn + "\nПоводок надет: " + dog.isLeashPutOn + "\nНамордник надет: " + dog.isMuzzlePutOn);
        }
    }
}
// Переходим в класс Sample 06.03.24 -2- 0.03