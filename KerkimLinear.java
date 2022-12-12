public class KerkimLinear {
    public static void main (String[] args) {
        int[] list = {1, 4, 4, 2, 5, -3, 6, 2};
        int i = kerkimLinear(list, 4); //kthen 1 per x=4
        int j = kerkimLinear(list, -4); //kthen -1 per x=-4
        int k = kerkimLinear(list, -3); //kthen 5 per x=-3
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
    }
    public static int kerkimLinear(int[] list, int x) {
        for (int i = 0; i< list.length; i++)
        if (x==list[i])
        return i;
      return -1;
    }
}
