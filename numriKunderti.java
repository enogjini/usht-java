// llogarit numrin e kundert te nje numri te plote. Psh numrin 1234 e kthen ne 4321.
public class numriKunderti {
    public static void main (String[] args) {
        int nr = 1234;
        int kunder = 0;
        int temp = 0;
        while (nr > 0) {
            temp = nr%10;
            kunder = kunder*10+temp;
            nr = nr/10;
        }
System.out.println("e kunderta " + kunder);        
    }
}
