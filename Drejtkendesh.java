
import java.util.Scanner;

public class Drejtkendesh {
    

    public int gjer;
    public int gjat;
    
   
   

    public Drejtkendesh(int i, int j) { //konstruktori i drejtkendeshit
        setBrinjet(i, j);
     }
 
    public Drejtkendesh(int a) {       //konstruktor me nje parameter per Katrorin
            setBrinjet(a,a);
    }

    

    public void setBrinjet (int i, int j) {
    this.gjer = i;
    this.gjat = j;
   }

   public int s (){
     return (gjer*gjat);
   }

   public int p () {
    return (gjer + gjat);
   }

   public String lloji(){
    if (gjer == gjat)
      return ("Katror");
    else
       return ("drejtkendesh");
   }

}



class DrejtkendeshTest {
    public static void main(String[] args) {
        
    
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Jepni 2 vlera per objektin e pare: ");
            int brinja1 = input.nextInt();
            int brinja2 = input.nextInt();
            kontroll(brinja1, brinja2);
            System.out.println("Jepni 2 vlera per objektin e dyte: ");
            int brinja3 = input.nextInt();
            int brinja4 = input.nextInt();
            kontroll(brinja3, brinja4);
            System.out.println("Jepni 2 vlera per objektin e trete: ");
            int brinja5 = input.nextInt();
            int brinja6 = input.nextInt();
            kontroll(brinja5, brinja6);
            System.out.println("Jepni 2 vlera per objektin e katert: ");
            int brinja7 = input.nextInt();
            int brinja8 = input.nextInt();
            kontroll(brinja7, brinja8);
      
            Drejtkendesh[] vektor = new Drejtkendesh[4]; //deklarimi i nje array per drejtkendeshat


            Drejtkendesh d1 = new Drejtkendesh(brinja1, brinja2);
            System.out.printf("Objekti i pare eshte %s%n Perimetri: %d%n Siperfaqja: %d %n" ,d1.lloji(), d1.p(), d1.s());
            Drejtkendesh d2 = new Drejtkendesh(brinja3, brinja4);
            System.out.printf("Objekti i dyte eshte %s%n Perimetri: %d%n Siperfaqja: %d %n" ,d2.lloji(), d2.p(), d2.s());
            Drejtkendesh d3 = new Drejtkendesh(brinja5, brinja6);
            System.out.printf("Objekti i trete eshte %s%n Perimetri: %d%n Siperfaqja: %d %n" ,d3.lloji(), d3.p(), d3.s()); //nqs kerkohet te krijohet katror mund te fshihet njera na brinjet si psh; Drejtkendesh d3 = new Drejtkendesh(brinja5); 
            Drejtkendesh d4 = new Drejtkendesh(brinja7, brinja8);
            System.out.printf("Objekti i katert eshte %s%n Perimetri: %d%n Siperfaqja: %d %n" ,d4.lloji(), d4.p(), d4.s());

            vektor[0] = d1;
            vektor[1] = d2;
            vektor[2] = d3;
            vektor[3] = d4;

            
            Drejtkendesh ElementFund = vektor[vektor.length-1];
            if (ElementFund.gjat == ElementFund.gjer)
                  System.out.println("Elementi i fundit eshte Katror");
            else 
                  System.out.println("Elementi i fundit eshte Drejtkendesh");
                

                  
       
        } 
    }
 
    
    public static void kontroll(int i, int j){
        if (i <= 0 || j <= 0){
            System.out.print("Vlera negative!");
            System.exit(0);
         }
   
}   
    
    
}
