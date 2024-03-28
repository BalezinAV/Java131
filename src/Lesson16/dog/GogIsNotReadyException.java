package Lesson16.dog;

public class GogIsNotReadyException extends Exception{ // (Exception) так указывать чтобы было понятно. Всегда нужно наследоваться от класса (Exception) для обработки исключений.
    public GogIsNotReadyException (String message){ // Конструктор
        super(message); // От родительского класса получаем доступ к переменной (messege)
    }
}
