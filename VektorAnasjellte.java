public class VektorAnasjellte {
    public static void main (String[] args) {
        int[] myList = {1, 2, 3, 4, 5, 6, 7, 8};
        anasjelltas(myList);
        for (int i=0; i< myList.length; i++)
        System.out.print(myList[i] + " ");
    }
    public static int[] anasjelltas (int[] list) {
        for (int i=0; i<list.length/2; i++) {
            int temp = list[i];
            list[i] = list[list.length-1-i];
            list[list.length-1-i] = temp;
        }
        return list;
    }
}
