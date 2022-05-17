import java.util.HashMap;
import java.util.Scanner;

public class Tp6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

int mois=input.nextInt();
if(mois<0 || mois>12){
    System.out.printf("%d n'est pas un mois valide.",mois);
    System.exit(1);
}
        switch (mois){
            case 1:
                System.out.println("Janvier");
                break;
            case 2:
                System.out.println("Février");
                break;
            case 3:
                System.out.println("Mars");
                break;
            case 4:
                System.out.println("Avril");
                break;
            case 5:
                System.out.println("Mai");
                break;
            case 6:
                System.out.println("Juin");
                break;
            case 7:
                System.out.println("Juillet");
                break;
            case 8:
                System.out.println("Août");
                break;
            case 9:
                System.out.println("Septembre");
                break;
            case 10:
                System.out.println("Octobre");
                break;
            case 11:
                System.out.println("Novembre");
                break;
            case 12:
                System.out.println("Decembre");
                break;
}

        }
    }

