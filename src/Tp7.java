import java.util.Scanner;
import java.util.Scanner;
public class Tp7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String email = "email1";
        String mot = "saa52";
        int fois = 0;
        System.out.println("entre email");
        email = input.next();
        System.out.println("entre mot de pass");
        mot = input.next();

        while (true) {
            if (email != "email1" && mot != "saa52") {
                System.out.println(" le message incorrect ");
                break;
            } else {


                System.out.println("Veuillez saisir email");
                System.out.println("Veuillez saisir mot");
            }

            {

            }
            for (fois = 0; fois <= 5; fois++) {
                System.out.println("“Vous avez saisi des mauvais identifiants x fois, votre compte est bloqué");
            }


        }
    }
}
