package Lesson17.sample2;

public class Main {// 11.03.24 -2- 0.06 переходим в пакет sample2

    public static void main(String[] args) {
        String inStr = "Лямбда выражение в Java";
        System.out.println("Исходная тсрока: " + inStr);
        String outStr = stringOp(str -> str.toUpperCase(), inStr); // В переменную (sf) попадает лямбда выражение (str -> str.toUpperCase())
        System.out.println("Строка в верхнем регистре: " + outStr);

        outStr = stringOp(str -> { // Хотим убрать пробелы
            String res = ""; // res = "Л" и далее до Лямбда
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != ' '){ // При наступлении пробела, мы в  if не попадаем и идем на следующую итерацию.
                    res  += str.charAt(i);
                }
            }
            return res;
        }, inStr);
        System.out.println("Строка с удаленными пробелами: " + outStr);

        // Разворот строки
        outStr = stringOp(str -> { // Хотим убрать пробелы
            String res = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                res  += str.charAt(i);
            }
            return res;
        }, inStr);
        System.out.println("Перевернутая строка: " + outStr);
    }


    static String stringOp(StringFuncs sf, String s){ // Два параметра. Возвращает StringFuncs sf, принимает String s

        return sf.func(s);
    }
}

interface StringFuncs{
    String func(String n); // Метод. Строку принимаем и строку возвращаем
}
 // Переходим в пакет sample3 11.03.24 -2- 0.33
