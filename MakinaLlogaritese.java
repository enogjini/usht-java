import java.util.Scanner;
public class MakinaLlogaritese {
    static int veprimi, nr1, nr2, Shuma, Zbr, Pj, Shumz;
    static Scanner input = new Scanner (System.in);
    static void Makina() {
        System.out.println ("Kjo eshte nje makine llogaritese.");
        System.out.println("Zgjidhni veprimin qe doni te kryeni: ");
        System.out.println("1. Mbledhje");
        System.out.println("2. Zbritje");
        System.out.println("3. Shumezim");
        System.out.println("4. Pjestim");
        veprimi = input.nextInt();
        switch (veprimi) {
            case 1:
            {
                System.out.println("Jepni dy numra qe doni te mblidhni: ");
                System.out.println("Jepni numrin e pare: ");
                nr1 = input.nextInt();
                System.out.println("Jepni numrin e dyte: ");
                nr2 = input.nextInt();
                Mbledhje();
            }
            break;
            case 2:
            {
                System.out.println("Jepni dy numra qe doni te zbrisni:");
                System.out.println("Jepni numrin e pare: ");
                nr1 = input.nextInt();
                System.out.println("Jepni numrin e dyte: ");
                nr2 = input.nextInt();
                Zbritje();
            }
            break;
            case 3:
            {
                System.out.println("Jepni dy numra qe doni te shumezoni: ");
                System.out.println("Jepni numrin e pare: ");
                nr1 = input.nextInt();
                System.out.println("Jepni numrin e dyte: ");
                nr2 = input.nextInt();
                Shumezim();
            }
            break;
            case 4:
            {
                System.out.println("Jepni dy numra qe doni te pjestoni: ");
                System.out.println("Jepni numrin e pare: ");
                nr1 = input.nextInt();
                System.out.println("Jepni numrin e dyte: ");
                nr2 = input.nextInt();
                Pjestim();
            }
            break;
            default:
            {
                System.out.println("Ky opsinon nuk ekziston!");
            }
        }
    }
    static void Mbledhje() {
        Shuma = nr1 + nr2;
        System.out.println("Shuma e "+nr1+" dhe "+nr2+" eshte : " +Shuma);
        System.out.println("Shtypni 0 per tu kthyer.");
        veprimi = input.nextInt();
        if (veprimi==0)
        Makina();
    }
    static void Zbritje() {
        Zbr = nr1-nr2;
        System.out.println("Ndryshimi i "+nr1+" dhe "+nr2+" eshte : " +Zbr);
        System.out.println("Shtypni 0 per tu kthyer.");
        veprimi = input.nextInt();
        if (veprimi == 0)
           Makina();
    }
    static void Shumezim () {
        Shumz = nr1*nr2;
        System.out.println("Shumezimi i "+nr1+" dhe "+nr2+" eshte :  " +Shumz);
        System.out.println("Shtypni 0 per tu kthyer. ");
        veprimi = input.nextInt();
        if (veprimi == 0)
        Makina();
    }
    static void Pjestim() {
        Pj = nr1 / nr2;
        System.out.println("Pjestimi i "+nr1+" dhe "+nr2+" eshte : "+Pj);
        System.out.println("Shtypni 0 per tu kthyer.");
        veprimi = input.nextInt();
        if (veprimi == 0 )
          Makina();
    }
    public static void main (String[] args) {
        Makina();
    }
}
