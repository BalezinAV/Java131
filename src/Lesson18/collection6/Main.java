package Lesson18.collection6;

import java.util.*;

public class Main { // Переходим в пакет collection6 20.03.24 -1- 0.46
    public static void main(String[] args) {
        try {
            List<Integer> numbers = readNumbers();
//        System.out.println(numbers);
            checkDuplicates(numbers);
            System.out.println("Нет дубликатов");
            }catch (Dublicate_Number_Exception e){
            System.out.println("Ошибка. " + e.getMessage());
        }
    }

    public static List<Integer> readNumbers(){ // будет возвращать Лист в Лист Интеджер в мейне
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.print("Кол-во чисел: ");
        int count = input.nextInt();

        System.out.println("Введите целые числа: ");
        for (int i = 0; i < count; i++){
            System.out.print("-> ");
            int num = input.nextInt();
            numbers.add(num);
        }
        return numbers;
    }

    public static void checkDuplicates(List<Integer> numbers) throws Dublicate_Number_Exception{
        Set<Integer> uniqueNumbers = new HashSet<>();

        for (int num : numbers){
            if (uniqueNumbers.contains(num)){
                throw new Dublicate_Number_Exception("Обнаружен повторяющийся номер: " + num);
            }
            uniqueNumbers.add(num);
        }
    }
} // Перехолдим в пакет collection7 20.03.24 -1- 1.13
