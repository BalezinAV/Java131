package homework;

public class DZ_7_Balezin_treug {
    public static void main(String[] args){
        //Построить треугольник зи (*) при помощи while.
        int i = 0, n = 5;
        while (i < n){
            int j = 0;
            while (j < i){
                if (j == 0 || i == j || i == n - 1){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
                j ++;
                }
            System.out.println("*");
            i ++;
        }
    }
}
