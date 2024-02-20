package homework.DZ_21_squareSM;

public class DZ_21_Balezin_squSM {
    static int count;
    public static double trianGre(int a, int b, int c) {
        count++;
        double per = (a + b + c) / 2;
        double sG = Math.sqrt(per * (per - a) * (per - b) * (per - c));
        return sG;
    }

    public static double triangHs(int a, int b) {
        count++;
        double sHs = (a * b) / 2;
        return (double) sHs;
    }

    public static double square(int a) {
        count++;
        return (double) a * a;
    }

    public static double rect(int a, int b) {
        count++;
        return (double) a * b;
    }
}
