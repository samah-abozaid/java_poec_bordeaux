import java.util.Scanner;
public class Tp1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double diametre=0;
        double rayon=0;
        double area=0;
      // final double  PI=3.14;
        System.out.println("entre your diametre");
        diametre= input.nextDouble();
       rayon=diametre/2;
        System.out.println(rayon);
     //   area=rayon*rayon*PI;
        area=rayon*rayon*Math.PI;
        System.out.println(area);
    }
}
