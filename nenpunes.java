interface nenpunes {
    void pension();
}
interface mesues extends nenpunes{
    int vite = 30;
    void femra (int vite);
    void meshkuj (int vite);
}
class AktivitetMesues implements mesues {
       double pensionbaze;
       char gjinia;

       AktivitetMesues (double pb, char p) {
        pensionbaze = pb/12;
        gjinia = p;
       }
       public void femra (int vitemeshume) {
        pensionbaze = pensionbaze + pensionbaze * 0.01 * (vitemeshume - vite);
       };

       public void meshkuj (int vitemeshume) {
        pensionbaze = pensionbaze + pensionbaze * 0.01 * (vitemeshume - (vite + 7));

       };

       public void pension () {
        if (gjinia == 'M' )
        meshkuj(vite);
        else if (gjinia == 'F')
        femra(vite);
        

       }


}
class gf {
    public static void main(String[] args) {
        //afishim pagash te mesuesve
        AktivitetMesues a1 = new AktivitetMesues(420, 'F');
        System.out.println(a1.pensionbaze);
        AktivitetMesues a2 = new AktivitetMesues(401, 'M');
        System.out.println(a2.pensionbaze);
    }
}
