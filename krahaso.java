//Te jepen dy numra   te plote, dhe aplikacioni te krahasoje keto dy numra.
import java.util.Scanner;
public class krahaso {
    public static void main (String[] args) {
        int a, b;
        boolean rezultati;
        try (Scanner input = new Scanner (System.in)) {
            System.out.println("jep nje numer te plote");
            a = input.nextInt();
            System.out.println("jep numrin e dyte te plote");
            b = input.nextInt();
        }
        rezultati=a==b;
        System.out.println("a e barabarte me b? " +rezultati);
        rezultati=a!=b; 
        System.out.println("a e ndryshme nga b? " +rezultati);
        rezultati=a<b;
        System.out.println("a me e vogel se b? " +rezultati);
        rezultati=a>b;
        System.out.println("a me e madhe se b? " +rezultati);
    }
}
