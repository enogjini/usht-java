//Person te jete klase abstrakte, me funksion abstract ktheKapitale(kthen string), Punonjes eshte zgjerim i Person, rregulloni kodet…. Ushtrim 1.3 Person te jete klase abstrakte, me funksion abstract ktheKapitale(kthen string), Punonjes eshte zgjerim i Person,
public abstract class Person {
    private String emri;
    private String adresa;
    private String nrTel;
    private String email;
    public abstract void kapitalizo ();
    

 Person(String e, String ad, String tel, String mail) {
    emri = e;
    adresa = ad;
    nrTel = tel;
    email = mail;
 }
 public String ktheString() {
    return "Personi eshte: "+emri+"\n adresa eshte: "+adresa+ "\n numer tel: "+nrTel+ "\n email: "+email;
 }
}
class Punonjes extends Person {
    
    private String detyra;
    private int paga;
    private int ditepune;

Punonjes (String e, String ad, String tel, String mail, String det, int p, int dp) {
        super(e, ad, tel, mail);
        detyra = det;
        paga = p;
        ditepune = dp;
    }


    public  String ktheString() {
        return "Punonjes eshte: " +super.ktheString() +"\n"+ "ka profesion " + detyra +"\n paga "+ paga +"\n dite pune "+ ditepune;
    }


    @Override
    public void kapitalizo() {
        // TODO Auto-generated method stub
        System.out.println(super.ktheString().toUpperCase());
        System.out.println("PROFESIONI:  "+detyra.toUpperCase());
    }


    



   
}

class TestPunonjes {
    public static void main(String[] args) {
        Punonjes p1 = new Punonjes("andi", "rruga pal" , "5656-6", "aaa@bbb", "inxhinier", 2400, 24);
        System.out.println("shfaq me germa kapitale: ");
        p1.kapitalizo();
        System.out.println(p1.ktheString());
        
        
    }

    
}
