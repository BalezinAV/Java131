package homework;

public class DZ_3_Balezin {
    public static void main(String[] args) {
        //Сделать табличку с выводом переменных с условным форматированием

        System.out.printf("%-16s%-7s%-9s%-2d%-14s%-3d%-50s%-5d%-3s%-4d%n", "Переменная типа", "byte", "занимает", Byte.BYTES, "байт памяти. (", Byte.SIZE, "бит в памяти) и принимает значение в диапазоне от", Byte.MIN_VALUE, "до", Byte.MAX_VALUE);
        System.out.printf("%-16s%-7s%-9s%-2d%-14s%-3d%-50s%-7d%-3s%-5d%n", "Переменная типа", "short", "занимает", Short.BYTES, "байт памяти. (", Short.SIZE, "бит в памяти) и принимает значение в диапазоне от", Short.MIN_VALUE, "до", Short.MAX_VALUE);
        System.out.printf("%-16s%-7s%-9s%-2d%-14s%-3d%-50s%-12d%-3s%-10d%n", "Переменная типа", "int", "занимает", Integer.BYTES, "байт памяти. (", Integer.SIZE, "бит в памяти) и принимает значение в диапазоне от", Integer.MIN_VALUE, "до", Integer.MAX_VALUE);
        System.out.printf("%-16s%-7s%-9s%-2d%-14s%-3d%-50s%-21d%-3s%-20d%n", "Переменная типа", "long", "занимает", Long.BYTES, "байт памяти. (", Long.SIZE, "бит в памяти) и принимает значение в диапазоне от", Long.MIN_VALUE, "до", Long.MAX_VALUE);
        System.out.println(" ");
        System.out.printf("%-16s%-7s%-9s%-2d%-14s%-3d%-50s%-14e%-3s%e%n", "Переменная типа", "float", "занимает", Float.BYTES, "байт памяти. (", Float.SIZE, "бит в памяти) и принимает значение в диапазоне от", Float.MIN_VALUE, "до", Float.MAX_VALUE);
        System.out.printf("%-16s%-7s%-9s%-2d%-14s%-3d%-50s%-14e%-3s%e%n", "Переменная типа", "double", "занимает", Double.BYTES, "байт памяти. (", Double.SIZE, "бит в памяти) и принимает значение в диапазоне от", Double.MIN_VALUE, "до", Double.MAX_VALUE);





    }
}
