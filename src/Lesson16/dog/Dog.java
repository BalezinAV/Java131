package Lesson16.dog;

public class Dog {
    String name;
    boolean isCollarPutOn; // Ошейник
    boolean isLeashPutOn; // Поводок
    boolean isMuzzlePutOn; // Намордник

    public Dog(String name) {
        this.name = name;
    }
    // Создаем методы
    public void putCollar(){
        System.out.println("Ошейник надет!");
        this.isCollarPutOn = true; // Изменяем значение переменной на true
    }

    public void putLeash(){
        System.out.println("Поводок надет!");
        this.isLeashPutOn = true;
    }

    public void putMuzzle(){
        System.out.println("Намордник надет!");
        this.isMuzzlePutOn = true;
    }

    public void walk() throws GogIsNotReadyException{
        System.out.println("Собираемся на прогулку!");
        if (isCollarPutOn && isLeashPutOn && isMuzzlePutOn){
            System.out.println("Ура идем гулять! " + this.name + " очень рад!");
        }else {
            throw new GogIsNotReadyException("Собака " + this.name + " не готова к прогулке! Проверьте экипировку!");
        }
    }
}
