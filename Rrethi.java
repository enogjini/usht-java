// llogarit siperfaqen dhe perimetrin e rrethit, duke mar  re te dhenat nga perdoruesi.
import java.util.Scanner;
public class Rrethi {
    public static void main (String[] args) {
        float rreze;
        float pi = 3.14f;
        float s, p;
        try (Scanner input = new Scanner (System.in)) {
            System.out.println("jepni rrezen e rrethit: ");
            rreze = input.nextFloat();
        }
        s = pi*rreze*rreze;
        p = 2*pi*rreze;
        System.out.println("Siperfaqja e rrethit eshte : "+s);
        System.out.println("Perimetri i rrethit eshte : "+p);
    }
}
