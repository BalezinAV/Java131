package Lesson21;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test5 {// Лекция от 08.04.2024

    public static void main(String[] args) {
//        try (FileWriter writer = new FileWriter("notes5.txt")){
//            String text = "Hello, ";
//            writer.write(text); // Записываем строку
//            writer.append('\n'); // запись символа
//            writer.append("Java!"); // добавляем еще текст или символы
//            writer.flush();// для принудительной записи в целевой поток данных
//        }catch (IOException ex){
//            System.out.println(ex.getMessage());
//        }

        try (FileReader reader = new FileReader("notes5.txt")) {
            int c;
            while ((c = reader.read()) != -1){
                System.out.print((char) c);
            }
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    } // переходим к клас тест 6 08.04.24 -1- 0.11
}
