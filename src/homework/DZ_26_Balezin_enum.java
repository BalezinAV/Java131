package homework;

public class DZ_26_Balezin_enum {
    // ДЗ 26 от 28.02.2024.
    // С использованием enum выведите скорость транспортных средств:
    // Скорость самолета составляет 600 миль в час.

    // В цикле:
    // Скорость транспортных средств:
    // CAR типичная скорость составляет 65 миль в час.
    // TRUCK типичная скорость составляет 55 миль в час.
    // AIRPLANE типичная скорость составляет 600 миль в час.
    // TRAIN типичная скорость составляет 70 миль в час.
    // BOAT типичная скорость составляет 22 миль в час.

    public static void main(String[] args) {
        System.out.println("Скорость самолета составляет 600 миль в час");
        System.out.println();
        for (SpeedT s1: SpeedT.values()) {
            System.out.println(s1 + " типичная скорость составляет " + s1.toSpeed(s1) + " миль в час.");
        }
    }

    public enum SpeedT{
        C_R("CAR", 65),
        TR_K("TRUCK", 55),
        AIR_PLANE("AIRPLANE", 600),
        TR_N("TRAIN", 70),
        B_T("BOAT", 22);
        String transport;
        int speed;

        SpeedT(String transport, int speed) {
            this.transport = transport;
            this.speed = speed;
        }

        @Override
        public String toString() {
            return transport;
        }

        public int toSpeed(SpeedT inpS){
            return this.speed = inpS.speed;
        }

    }
}
