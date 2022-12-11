import java.util.Scanner;
public class Krahasim {
 public static void main (String[] args)  {
    int a, b, c, d, e;
    boolean rezultati;
    try (Scanner input = new Scanner(System.in)) {
        System.out.println("jepni numri e plote");
        a = input.nextInt();
        System.out.println("jepni numrin e dyte te plote");
        b = input.nextInt();
        System.out.println("jepi numrin e trete te plote");
        c = input.nextInt();
        System.out.println("jepni numrin e katert te plote");
        d = input.nextInt();
        System.out.println("jepni numrin e peste te plote");
        e = input.nextInt();
    }
    rezultati = (a<b) && (a<c) && (a<d) && (a<e);
    System.out.println("Minimumi eshte "+a+" "+rezultati);
    rezultati = (b<a) && (b<d) && (b<c) && (b<e);
    System.out.println("Minimumi eshte "+b+" "+rezultati);
    rezultati = (c<a) && (c<b) && (c<d) && (c<e);
    System.out.println("Minimumi eshte "+c+" "+rezultati);
    rezultati = (d<a) && (d<b) && (d<c) && (d<e);
    System.out.println("Minimumi eshte "+d+" "+rezultati);
    rezultati = (e<a) && (e<b) && (e<c) && (e<d);
    System.out.println("Minimumi eshte "+e+" "+rezultati);
    rezultati = (a>b) && (a>c) && (a>d) && (a>e);
    System.out.println("Maksimumi eshte "+a+" "+rezultati);
    rezultati = (b>a) && (b>c) && (b>e) && (b>d);
    System.out.println("Maksimumi eshte "+b+" "+rezultati);
    rezultati = (c>a) && (c>b) && (c>e) && (c>d);
    System.out.println("Maksimumi eshte "+c+" "+rezultati);
    rezultati = (d>a) && (d>b) && (d>c) && (d>e);
    System.out.println("Maksimumi eshte "+d+" "+rezultati);
    rezultati = (e>a) && (e>b) && (e>c) && (e>d);
    System.out.println("Maksimumi eshte "+e+" "+rezultati);
 }  
}
