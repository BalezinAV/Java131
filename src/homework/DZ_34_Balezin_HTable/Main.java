package homework.DZ_34_Balezin_HTable;
import java.util.Map;
import java.util.HashMap;
public class Main { // ДЗ от 27.03.24
    //Написать программу, где ключи и значения поменяны местами.
    // Исходный Map: {X = 1, Y = 2, Z = 3}
    // Измененный Map: {1 = [X], 2 = [Y], 3 = [Z]}
    public static void main(String[] args) {
    Map<String, Integer> origin = new HashMap<>();
    origin.put("X", 1);
    origin.put("Y", 2);
    origin.put("Z", 3);
        System.out.println("Исходный Map: " + origin);
//        System.out.println(origin.values());
//        System.out.println(origin.keySet());
//        System.out.println(origin.get("X"));
//        System.out.println(origin.get(1));
//        System.out.println(origin.entrySet());
//        System.out.println(origin.size());

        HashMap<Integer, String> repOr = new HashMap<>();
        for (Map.Entry<String, Integer> entry : origin.entrySet()) {
            repOr.put(entry.getValue(), entry.getKey());
        }
        System.out.println("Измененный Map: " + repOr);
//        System.out.println(repOr.entrySet());
//        System.out.println(repOr.get(1));
//        System.out.println(repOr.keySet());
//        System.out.println(repOr.values());
    }
}
