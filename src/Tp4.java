import java.util.Scanner;

public class Tp4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0;
        System.out.println("entre your num: ");
        num = input.nextInt();

        if (num == 0) {
            System.out.println("num is zero.Il est donc pair. ");
        } else if (num > 0 && num % 2 == 0) {
            System.out.println("the num is positive et pair.");
        } else if (num > 0 && num % 2 != 0) {
            System.out.println("the num is positive et impair.");
        } else if (num < 0 && num % 2 == 0) {
            System.out.println("the num is negative et paire");
        } else if (num < 0 && num % 2 != 0) {
            System.out.println("the num is negative et impaire");
        }
    }
}