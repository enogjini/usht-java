// llogarit nese tre numra te dhene mund te formoj  ne nje trekendesh.
import java.util.Scanner;
public class Trekendesh {
   public static void main (String[] args) {
    int a, b, c;
    try (Scanner input = new Scanner (System.in)) {
        System.out.println("jep brinjen e pare");
        a = input.nextInt();
        System.out.println("jep brinjen e dyte");
        b = input.nextInt();
        System.out.println("jep brinjen e trete");
        c = input.nextInt();
    }
    if ((a+b>c)&&(a+c>b)&&(b+c>a))
    System.out.println("numrat e dhene, formojne trekendesh");
    else
    System.out.println("nuk formohet trekendesh");
   }    
}
