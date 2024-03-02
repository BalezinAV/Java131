package homework.DZ_22_Balezin_ext;

public class Aspirant extends Student{
        private int averGradAsp;
        private int averGradAsp1;
        private double rewardAsp;


        public Aspirant(int averGraStu, int averGradAsp, int averGradAsp1) {
            super(averGraStu);
            this.averGradAsp = averGradAsp;
            this.averGradAsp1 = averGradAsp1;
        }

        public int getAverGradAsp() {
            return averGradAsp;
        }

        public int getAveGradAsp1() {
            return averGradAsp1;
        }

        public void setAverGraAsp(int averGraAsp) {
            this.averGradAsp = averGradAsp;
        }

        public void setAveGradAsp1(int aveGradAsp1) {
            this.averGradAsp1 = aveGradAsp1;
        }

        public double getRewardAsp(){
            if (averGradAsp >= 5) {
                rewardAsp = 2000.0;
            } else {
                rewardAsp = 1800.0;
            }
            System.out.print("Александр Невзоров, группа Gr222, тема рабты: 'Work1', сумма стипендии: ");
            return rewardAsp;
        }
        public double getRewardAsp1() {
            if (averGradAsp1 >= 5) {
                rewardAsp = 2000.0;
            } else {
                rewardAsp = 1800.0;
            }
            System.out.print("Антон Бобров, группа Gr333, тема работы: 'Work2', сумма стипендии:");
            return rewardAsp;
        }
}
