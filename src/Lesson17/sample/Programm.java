package Lesson17.sample;

public class Programm {// 11.03.24 -1- 0.19 Задача по лябда-выражению
    public static void main(String[] args) {
        String text = "Лямбда выражение";
        System.out.println("Исходная строка: " + text);
        WordCounter wordCounter = (s) -> s.split("\\s+").length; // s можно без скобок, так как один аргумент
        int ctr = wordCounter.countWords(text);
        System.out.println("Кличество слов: " + ctr);

//        text = "Программа, которая подсчитывает количество слов в предложении"; // мы перезаписали переменную
        text = "Программа, которая подсчитывает количество букв в предложении";
        wordCounter = (s) -> s.split("о+").length - 1; // Перезаписали метод, на нахождение букв "о". Без (-1) будет выводиться число отрезков от "о" до "о".
        System.out.println("\nИсходная строка: " + text);
        ctr = wordCounter.countWords(text);
        System.out.println("Кличество слов: " + ctr);
    }
}

interface WordCounter{
    int countWords(String tx);
} // 11.03.24 -1- 0.40 переходим в Main

