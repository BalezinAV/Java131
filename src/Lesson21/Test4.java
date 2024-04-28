package Lesson21;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Test4 {// Переходим в класс тест4 03.04.24 -2- 0.57

    public static void main(String[] args) {
//        String text = "Привет мир!";
//        try (FileOutputStream fos = new FileOutputStream("notes3.txt");
//             PrintStream printStream = new PrintStream(fos)){
//            printStream.println(text);
//            System.out.println("Запись в файл была произведена");
//        } catch (IOException ex){
//            System.out.println(ex.getMessage());
//        }

        try (PrintStream printStream = new PrintStream("note4.txt")){
            printStream.print("Hello world!");
            printStream.println("Welcome to Java");
            printStream.printf("Name: %s Age: %d %n", "Сергей", 35);

            String message = "PrintStream";
            byte[] messageToByte = message.getBytes();
            printStream.write(messageToByte);

            System.out.println("Файл был записан");
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    } // ДЗ от 03.04.24 -2- 1.11 поток и стрим первая пара
    // Переходим тест5
}
