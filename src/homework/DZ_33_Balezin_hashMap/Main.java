package homework.DZ_33_Balezin_hashMap;

import java.util.HashMap;
import java.util.Map;


public class Main { // ДЗ 33 от 25.03.24
    // Из массива цветов создать коллекцию HashMap<String, Color>. Ключом должна быть строка (название цвета), а значением класс Color
    // с полем имя (name, String), тот же цвет в верхнем регистре. Вывести результат на экран, каждый элемент с новой строки.
    // Результат:
    // 1) red : RED; 2) orange : ORANGE; 3) aqua : AQUA; 4) pink : PINK; 5) gray : GRAY; 6) blue : BLUE; 7) white : WHITE; 8) black : BLACK; 9) yellow : YELLOW; 10) brown : BROWN
    public static void main(String[] args) {
        String[] colorArr = new String[]{"red", "orange", "aqua", "pink", "grey", "blue", "white", "black", "yellow", "brown"};
        Color cR = new Color(colorArr[0]);
        Color cR1 = new Color(colorArr[1]);
        Color cR2 = new Color(colorArr[2]);
        Color cR3 = new Color(colorArr[3]);
        Color cR4 = new Color(colorArr[4]);
        Color cR5 = new Color(colorArr[5]);
        Color cR6 = new Color(colorArr[6]);
        Color cR7 = new Color(colorArr[7]);
        Color cR8 = new Color(colorArr[8]);
        Color cR9 = new Color(colorArr[9]);
        Map<String, Color> map = new HashMap<>();
        map.put(colorArr[0], cR);
        map.put(colorArr[1], cR1);
        map.put(colorArr[2], cR2);
        map.put(colorArr[3], cR3);
        map.put(colorArr[4], cR4);
        map.put(colorArr[5], cR5);
        map.put(colorArr[6], cR6);
        map.put(colorArr[7], cR7);
        map.put(colorArr[8], cR8);
        map.put(colorArr[9], cR9);
        System.out.println();
        int i = 0;
        for (Map.Entry<String,Color> entry : map.entrySet()) {
            i++;
            System.out.println(i + ") " + entry.getKey() + " : " + entry.getValue());
        }
    }
}

class Color{
    String rainbow;

    public Color(String rainbow) {
        this.rainbow = rainbow;
    }

    @Override
    public String toString() {
        return rainbow.toUpperCase();
    }
}


