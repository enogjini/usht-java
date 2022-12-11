//kerkon numrat n numrat e pare prim(numrat e thjeshte qe plotpjestohen vec me veten dhe me numrin 1). Vlera e numrit n jepet nga perdoruesi
import java.util.Scanner;
public class kerkoprim {
    static boolean prim(int a) {
        boolean rez = true;
        for (int i = 2; i<a; i++)
           if  (a%i==0){
            rez = false;
            break;
           }
           return rez;
        }
    public static void main (String[] args) {
        try (Scanner input = new Scanner (System.in)) {
            System.out.println("jepni numrin n");
            int n = input.nextInt();
            int total = 0;
            int i = 1;
            while (total<n) {
                if (prim(i)) {
                    System.out.println(i);
                    total++;
                }
                i++;
            }
        }

        
        
    }
}
