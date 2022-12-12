// rekomandon numrin e kalorive një person duhet të haje ne ditë. 
import java.util.Scanner;
public class Kalori {
     public static void main (String[] args) {
        float kalorite, pesha;
        int aktiviteti;
        Scanner input = new Scanner (System.in);
        System.out.println("jepni peshen tuaj");
        pesha = input.nextFloat();
        System.out.println ("shkruani 1 nqs jeni aktiv, 2 nqs jeni pasiv");
        aktiviteti = input.nextInt();
        switch (aktiviteti) {
            case 1: kalorite = 13*pesha;
            System.out.println("ju konsumoni "+kalorite+" kalori ne dite");
            break;
            case 2: kalorite = 15*pesha;
            System.out.println("ju konsumoni "+kalorite+" kalori ne dite");
            
        }
     }    
}
