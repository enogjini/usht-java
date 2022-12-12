public class MesVektor {
    public static void main(String[] args) {
        int[] list1 = {1, 2, 3, 4, 5, 6};
        double[] list2 = {5.0, 4.4, 1.9, 2.9, 3.4, 3.5};
        System.out.println(mesatarja(list1));
        System.out.println(mesatarja(list2));
    }
    public static double mesatarja (int[] array) {
        int shuma = 0;
        for (int i=0; i<array.length; i++)
            shuma =  shuma + array[i];
        return shuma/array.length;
    }
    public static double mesatarja (double[] array) {
        double shuma = 0;
        for (int i=0; i < array.length; i++)
          shuma += array[i];
        return shuma / array.length;
    }
}
