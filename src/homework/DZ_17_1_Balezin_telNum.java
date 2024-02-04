package homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class DZ_17_1_Balezin_telNum {
    public static void main(String[] args) {
        // Домашнее задание. Валидация номера телефона. +7 499 456-45-78; +74994654578; 7 (499) 456 45 75; 7 (499) 456-45-78
        String s = "+7 499 456-45-78, +74994654578, 7 (499) 456 45 75, 7 (499) 456-45-78";
        String pattern = "\\+?7\\d{10}|\\+?7\\W+\\d+\\D+\\d+\\D\\d+\\W\\d+";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(s);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
