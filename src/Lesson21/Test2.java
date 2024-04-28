package Lesson21;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;

public class Test2 {// 03.04.24 Переходим в класс тест2 -2- 0.17
    public static void main(String[] args) {
//        String text = "Hello world!";
//        byte[] buffer = text.getBytes(); // преобразовываем в байт
//        ByteArrayInputStream in = new ByteArrayInputStream(buffer);
//        try (BufferedInputStream bis = new BufferedInputStream(in)){ // Будем считывать данные из этого буфера
//            int c;
//            while ((c = bis.read()) != -1){
//                System.out.print((char) c);
//            }
//        } catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//        System.out.println();

        String text = "Hello Java!";
        try (FileOutputStream out = new FileOutputStream("notes2.txt");
            BufferedOutputStream bos = new BufferedOutputStream(out)){
            byte[] buffer = text.getBytes();
            bos.write(buffer, 0, buffer.length);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    } // возвращаемся в тест1
}
