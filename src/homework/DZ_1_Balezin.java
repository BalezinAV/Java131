package homework;

public class DZ_1_Balezin {
    public static void main(String[] args) {
        int a = 1, b = 2;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println();
        b = a;
        a = a + b; //работает только с этими числами.
        
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        }
}
