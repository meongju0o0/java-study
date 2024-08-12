package Chap03;

public class OperatorEx9 {
    public static void main(String[] args) {
        long a = 1_000_000 * 1_000_000; //overflow occurs. without literal, operator's return type is still 'int'
        long b = 1_000_000 * 1_000_000L;

        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
