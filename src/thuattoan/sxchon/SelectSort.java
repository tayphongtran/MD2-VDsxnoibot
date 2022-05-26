package thuattoan.sxchon;

public class SelectSort {
    static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};

    public static void selectionSort(double[] list) {
        for (int i = 0; i <= list.length -1; i++) {
            /* Find the minimum in the list[i..list.length-1] */

            for (int j = i + 1; j < list.length; j++) {
                if (list[i] >= list[j]){
                double temp = list[i];
                list[i] = list[j];
                list[j] = temp;
                }
            }
        System.out.println(list[i]);

        }
//        for (Double item :
//                list) {
//            System.out.println(item);
//        }
    }

    public static void main(String[] args) {
        selectionSort(list);
//        for (Double item :
//                list) {
//            System.out.println(list);
//        }
    }
}
