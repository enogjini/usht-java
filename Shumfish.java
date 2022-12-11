//merr nga tastiera dy numra   te plote dhe afishon nese keto numra   jane shumefish te njeri-tjetrit
import java.util.Scanner;
public class Shumfish {
    static boolean kontroll (int a, int b) {
        boolean c;
        c = false;
        if (a%b==0)
        c = true;
        return c;
    }
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int nr1, nr2;
        System.out.println("jepni numrin e 1");
        nr1 = input.nextInt();
        System.out.println("jepni numrin e 2");
        nr2 = input.nextInt();

        if (kontroll(nr1, nr2))
            System.out.println("nr1 = "+nr1+" eshte shumfish i nr 2 = "+nr2);
         else
            System.out.println("nr1 = "+nr1+" nuk eshte shumfish i nr 2 = "+nr2);
            
        if (kontroll(nr2, nr1))
            System.out.println("nr2 = "+nr2+" eshte shumfish i nr 1 = "+nr1);
         else
            System.out.println("nr2 = "+nr2+" nuk eshte shumfish i nr 1 = "+nr1);

    }
}
