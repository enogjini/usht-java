public class ShumeMatrice {
    public static void main (String[] args) {
        int[][] m = {
            {1, 2, 4, 5},
            {6, 7, 8, 9},
            {10, 11, 12, 13},
            {14, 15, 16, 17}
        };
        int shuma = 0;
        for (int i = 0; i<m.length; i++)
           for (int j=0; j<m[i].length; j++)
                shuma = shuma + m[i][j];
        System.out.print("Shuma e numrave te matrices eshte " +shuma);
    }
}
