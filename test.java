//nje aplikacion qe lexon 2 nr te plote, dhe vendos nese nr i dyte eshte shumefish i nr te pare dhe kontrollon nese nr i trete eshte tek apo cift
import java.util.Scanner;
public class test {
    public static void main (String[] args) {
        int a, b, c;
        int rezultati;
        boolean tekcift, plotpjes;
        try (Scanner input = new Scanner (System.in)) {
            System.out.println("jep nje numer te plote ");
            a = input.nextInt();
            System.out.println("jep numrin e dyte te plote");
            b = input.nextInt();
            rezultati = (b%a);
            plotpjes = rezultati == 0;
            System.out.println("numri i dyte eshte shumfish i te parit "+plotpjes);
            System.out.println("mbetja eshte "+rezultati);
            System.out.println("mbetja eshte "+rezultati);
            System.out.println("jepni numrin e trete");
            c = input.nextInt();
        }
        rezultati = (c%2);
        tekcift = rezultati == 0;
        System.out.println("numri i dhene eshte cift "+tekcift);
        tekcift = rezultati == 1;
        System.out.println("numri i dhene eshte tek "+tekcift);
    }
}
