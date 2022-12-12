// nje program qe nderton nje matrice katrore, si dhe nje matrice te dyte qe merr si vlere elementet e dyfishuar te matrices se pare, kurse elementet siperdiagonales kryesore jane zero.
import java.util.Scanner;
public class MatricaKatrore {
    public static void main (String[] args) {
          try (Scanner input = new Scanner (System.in)) {
            int n;
              System.out.println("jepni  permasat e matrices katrore");
              n = input.nextInt();
              int matric1 [][];
              matric1 = new int [n][n];
              
              for (int i = 0; i<n; i++) {
                for (int j=0; j<n; j++) {
                    matric1 [i][j] = input.nextInt();
                }
              }
              System.out.println("matrica e pare");
              for (int i=0; i<n; i++) {
                for (int j=0; j<n; j++) {
                    System.out.print(matric1[i][j]+"\t");
                    System.out.println();
                }
              }
              int matric2 [][];
              matric2 = new int [n][n];
              System.out.println("matrica e dyte");
              for (int i=0; i<n; i++) {
                for (int j=0; j<n; j++) {
                         matric2 [i][j] = (matric1 [i][j])*2;
                }
              }
              for (int i = 0; i<n; i++){
                for (int j = i; j<n; j++) {
                        matric2 [i][j] = 0;
                }
              }

              for (int i=0; i<n; i++){
                for (int j=0; j<n; j++)
                 System.out.print(matric2[i][j]+"\t");
                 System.out.println();
              }
        }
    }
}
