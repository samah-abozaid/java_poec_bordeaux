import java.util.Scanner;
import java.util.Scanner;
public class Tp7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String email;
        String password;
        String emailcheck;
        String passwordcheck;
        int tentative = 5;
        int i = 0;
        System.out.println("entre email");
        email = input.next();
        System.out.println("entre password");
        password = input.next();
        while (i < 5) {
            System.out.println("entre email: ");
            emailcheck = input.next();
            System.out.println("entre password: ");
            passwordcheck = input.next();
            if (email != emailcheck || password != passwordcheck) {

                System.out.println("incorrects");
            }else{
                System.out.println("Bienvenu dans votre space client");

            }

                
        }
    }
}