package Chap02;

public class CharToCode {
    public static void main(String[] args) {
        char ch = 'A';

        System.out.printf("%c=%d(%#X)%n", ch, (int)ch, (int)ch);

        char hch = '가';
        System.out.printf("%c=%d(%#X)%n", hch, (int)hch, (int)hch);
    }
}
