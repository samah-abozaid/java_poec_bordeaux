import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class MainUsers {
    public static void main(String[] args) {
        ArrayList<User> users = GenerateUsers.generateUser();
        Scanner input = new Scanner(System.in);
        String email = null;
        String motdepass = null;
        int triesleft = 3;
        

        while (triesleft > 0 && email == null && motdepass == null) {
            System.out.print("entre your email");
            email = input.nextLine();

            if (!(Validateur.isEmail(email))) {
                email = null;
                continue;
            }


            System.out.print("entre your mot");
            motdepass = input.nextLine();
            if (!(Validateur.isLength(motdepass))) {
                motdepass = null;
                email=null;
                continue;
            }

            boolean isConnected = false;
            for (int i = 0; i < 5; i++) {
                if (email.equals(users.get(i).getEmail()) && motdepass.equals(users.get(i).getMotdepass())) {
                    System.out.println("Bienvenue " + users.get(i).getEmail() + " " + users.get(i).getMotdepass());
                    isConnected = true;
                    break;
                }
            }
            if (isConnected) {
                break;
            } else {
                email = null;
                motdepass = null;
                triesleft--;
                System.out.println("Mot de passe et/ou email incorrect(s).");
            }
        }
        if (triesleft == 0) {
            System.out.println("Plus de tentatives restantes !");
        }
    }


}
         




















        
    
