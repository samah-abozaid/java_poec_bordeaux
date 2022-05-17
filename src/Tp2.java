
import java.util.Scanner;
public class Tp2  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        String prenom;
        int age=0;
        System.out.print("my second name: ");
        nome= input.next();
        System.out.print("my first name : ");
        prenom= input.next();
        System.out.print("my age : " );
age= input.nextInt();
System.out.println("vous vous appelez " +prenom+" "+ nome +",et vous avez "+age+ " ans " );
    }
}
