public class KerkimBinar {
    public static void main (String[] args) {
        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        int i = kerkimBinar(list, 2);
        int j = kerkimBinar(list, 11);
        int k = kerkimBinar(list, 12);
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
    }
    public static int kerkimBinar(int[] list, int kontroll) {
        int poshte = 0;
        int lart = list.length-1;
        while (lart >= poshte) {
            int mes = (poshte+lart)/2;
            if (kontroll<list[mes])
            lart = mes -1;
            else if (kontroll == list[mes])
            return mes;
            else 
             poshte = mes +1;
        }
        return poshte -1;
    }
}
