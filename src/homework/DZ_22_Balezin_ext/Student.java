package homework.DZ_22_Balezin_ext;

public class Student {
    private int averGraStu;
    private double rewardSt;

    public Student(int averGraStu) {
        this.averGraStu = averGraStu;
    }

    public int getAverGraStu() {
        return averGraStu;
    }

    public void setAverGraStu(int averGraStu) {
        this.averGraStu = averGraStu;
    }
    public double getRewardSt() {
        if (averGraStu >= 5) {
            rewardSt = 1000.0;
        } else {
            rewardSt = 800.0;
        }
        System.out.print("Виктор Вербов, группа Gr111, сумма стипендии: ");
        return rewardSt;
    }
}
