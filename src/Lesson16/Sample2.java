package Lesson16;

public class Sample2 { // Задача 06.03.24 -2- 0.37
    public static void main(String[] args) {
        try {
            String text = "Java";
//            String text = "PHP";
            System.out.println("Исходная строка: " + text);
            checkVowels(text);
        }catch (NoVowelsException e){
            System.out.println("Ошибка: " + e.getMessage());
        }

    }

    public static void checkVowels(String text) throws NoVowelsException{
        boolean containsVowels = false;
        String vowels = "aeiouyAEIOUY";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i); // При каждой итерации берем каждый символ.
            if (vowels.contains(String.valueOf(ch))){
                containsVowels = true;
                break; // Выходим из цикла при первом нужном совпадении.
            }
        }
        if (!containsVowels){ // Если останется значение false, то нам нужно чтобы мы попали в этот if для выдачи исключения.
            throw new NoVowelsException("Строка не содержит гласные буквы");
        }else {
            System.out.println("Строка содержит гласные буквы");
        }
    }
}

class NoVowelsException extends Exception{
    public NoVowelsException(String message) { // Конструктор
        super(message);
    }
}
// Новая тема "Анонимные классы" 06.03.24 -2- 0.58 переходим в пакет Lesson17 -> test
