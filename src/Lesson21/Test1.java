package Lesson21;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {// Переходим в пакет лессон 21. Работа с файлами, потоки ввода и вывода.
    // Работа либо с байтовыми, либо с символьными потоками данных.
    public static void main(String[] args) {
//        String text = "Hello world";
//        try (FileOutputStream fos = new FileOutputStream("notes.txt", true)){ // Создали экземпляр класса и сохранили в переменную. При относительном пути фал создастся в корне проекта или прописать абсолютный путь. true - дозапись в файл, без true файл перезапишется.
////        try (FileOutputStream fos = new FileOutputStream("D:\\Документы рабочие\\ТОП Академия\\Уроки\\files\\notes.txt")){
//            byte[] buffer = text.getBytes();
//            fos.write(buffer, 0, buffer.length);
//        }catch (IOException ex){
//            System.out.println(ex.getMessage());
//        }
//        System.out.println("Файл был записан");

        // С читаем данные
//        try (FileInputStream fis = new FileInputStream("notes.txt")){
//            System.out.printf("Размер файла: %d байт %n", fis.available()); // размер файла
//            int i;
//            while ((i = fis.read()) != -1){ // пока данные есть, выполняется цикл и вывод. Как только данные закончатся цикл прекратится.
//                System.out.print((char) i); // преобразовали в чар
//            } // Сам метод возвращает значение (-1)
//        } catch (IOException ex){
//            System.out.println("Ошибка: " + ex.getMessage());
//        }
        System.out.println();
        // считываем из файла и записываем в другой
        try (FileInputStream fis = new FileInputStream("notes.txt");
        FileOutputStream fos = new FileOutputStream("notes_new.txt")){
        byte[] buffer = new byte[fis.available()]; // задаем размер буфера
            fis.read(buffer, 0, buffer.length);
            fos.write(buffer, 0, buffer.length);
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        // 03.04.24 Переходим в класс тест2 -2- 0.17
    } // переходим в тест 3 03.04.24 -2- 0.29
}
