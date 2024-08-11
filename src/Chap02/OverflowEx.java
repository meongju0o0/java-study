package Chap02;

public class OverflowEx {
    public static void main(String[] args) {
        short sMin = -32768;
        short sMax = 32767;
        char chMin = 0;
        char chMax = 65535;

        System.out.println("sMin = " + sMin);
        System.out.println("sMin-1 = " + (short)(sMin - 1));
        System.out.println("sMax = " + sMax);
        System.out.println("sMax+1 = " + (short)(sMax + 1));
        System.out.println("chMin = " + (int)chMin);
        System.out.println("chMin-1 = " + (int)--chMin);
        System.out.println("chMax = " + (int)chMax);
        System.out.println("chMax+1 = " + (int)++chMax);
    }
}
