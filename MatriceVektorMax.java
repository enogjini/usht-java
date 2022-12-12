//mat  rica me n rreshta dhe m shtylla, dhe matricat max[n] per maksimumin e rreshtave dhe min[m] per minimumin e shtyllave
import java.util.Scanner;
public class MatriceVektorMax {
    public static void main (String[] args) {
           try (Scanner input = new Scanner(System.in)) {
            int n;
               int m;
               System.out.println("jepni numrin e rreshtave");
               n = input.nextInt();
               System.out.println("jepni numrin e shtyllave");
               m = input.nextInt();

               int matrice1[] [];
               matrice1 = new int [n] [m];

               System.out.println ("jepni elementet e matrices");
               for(int i=0; i<n; i++)
                   for(int j=0; j<m; j++)
                       matrice1 [i] [j] = input.nextInt();

                System.out.println("matrica e pare");
                for(int i = 0; i<n; i++){
                    for(int j = 0; j<m; j++)
                        System.out.print(matrice1[i][j] + "\t");
                    System.out.println();

                }


                int max[];
                max = new int[n];
                for (int i=0; i<n; i++){
                    max[i] = matrice1[i][1];
                    for(int j=0; j<m; j++){
                        if (max[i] < matrice1[i][j])
                        max[i] = matrice1[i][j];
                    }
                }

                int min[];
                min = new int [m];
                for(int i=0; i<m; i++) {
                    min[i] = matrice1[1][i];
                    for (int j=0; j<n; j++){
                        if (min[i]> matrice1[j][i])
                             min[i] = matrice1 [j][i];
                    }
                }
                System.out.println("vektore maximumet per rreshtat");
                for (int i=0; i<m; i++) {
                    System.out.print(max[i]+"\t");
                    System.out.println();
                }
                System.out.println("vektore minimumet per shtyllat");
                for (int i=0; i<m; i++) {
                    System.out.print(min[i]+"\t");
                }
        }
 
        }
}