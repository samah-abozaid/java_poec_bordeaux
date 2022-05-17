import java.util.Scanner;

public class Tp3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a=0;
        int b=0;
        int c=0;
        int d;
        System.out.println("entrez le premiere valur:"+a);
        a= input.nextInt();
        System.out.println("entrez le premiere valur:"+b);
        b= input.nextInt();
        System.out.println("entrez le premiere valur:"+c);
        c= input.nextInt();

        d=b;
        b=a;
        a=d;

        System.out.println("a = "+a+". b = "+b+". c = "+c);
        }
    }

