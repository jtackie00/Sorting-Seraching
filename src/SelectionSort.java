import java.util.Scanner;

public class SelectionSort {

    protected void sort(int[] array) {

//        System.out.print("Your unsorted array of numbers are: ");
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + "\t");
//        }

        int less, more;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    less = array[j];
                    more = array[i];
                    array[i] = less;
                    array[j] = more;
                }
            }
        }

//        System.out.println();
//        System.out.print("Your sorted array of numbers are: ");
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + "\t");
//        }
    }
}