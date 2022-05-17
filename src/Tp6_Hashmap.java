import java.util.HashMap;
import java.util.Scanner;
public class Tp6_Hashmap {
    public static void main(String[] args) {
        HashMap<Integer,String> mois=new HashMap<>();
        String[]moisannee={"janvier","Fevrier","Mars","Avril","Mai","Juin","Juillet",
                "Aout","Septembre","Octobre","Novembre","Decembre"};
        for(int i=0;i<moisannee.length;i++){
            mois.put(i+1,moisannee[i]);
        }
        Scanner input=new Scanner(System.in);
        System.out.println("Entrez un mois : ");
        int valeurMois=input.nextInt();
//        System.out.println(mois);
        System.out.println(mois.get(valeurMois));
    }
}




