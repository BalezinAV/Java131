package Lesson21;

import java.io.*;

public class Test3 {// переходим в тест 3 03.04.24 -2- 0.29
    public static void main(String[] args) {
        Person per = new Person("Сергей", "Федоров", 35, 1.86, false);
        try (DataOutputStream dos = new DataOutputStream (new FileOutputStream("data.bin"))){
            dos.writeUTF(per.name); // Записывает поток строку в кодировке UTF8
            dos.writeUTF(per.surname); // Записывает поток строку в кодировке UTF8
            dos.writeInt(per.age); // Записывает в поток целочисленные значения int
            dos.writeDouble(per.height); // Записывает в поток значения double
            dos.writeBoolean(per.married); // записывает в поток булево значение.
            System.out.println("Файл был записан");
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }

        // Считываем данные
        try (DataInputStream dis = new DataInputStream(new FileInputStream("data.bin"))){
            String name = dis.readUTF(); // Порядок важен
            String surname = dis.readUTF(); // Порядок важен
            int age = dis.readInt();
            double height = dis.readDouble();
            boolean married = dis.readBoolean();
            System.out.printf("Имя: %s, Фамилия: %s, Возраст: %d, Рост: %.2f, Женат: %b", name, surname, age, height, married);
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}

class Person{
    public String name;
    public String surname;
    public int age;
    public double height;
    public boolean married;

    public Person(String name, String surname, int age, double height, boolean married) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.height = height;
        this.married = married;
    } // Переходим в класс тест4 03.04.24 -2- 0.57
}