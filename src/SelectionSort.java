
import java.util.ArrayList;
import java.util.Scanner;

public class SelectionSort {

    private int num;
    private int sizeOfNum;
    ArrayList<Integer> arr = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void sort(){

        System.out.print("How many numbers will you like to input? ");
        this.sizeOfNum = scanner.nextInt();

        for (int i = 0; i < this.sizeOfNum; i++){
            System.out.print("Enter " + (i + 1)+ " number: " );
            arr.add(scanner.nextInt());
        }

        System.out.print("Your unsorted array of numbers are: ");
        for(int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + "\t");
        }

        int less, more;
        for (int i = 0; i < arr.size() - 1; i++){
            for (int j = i + 1; j < arr.size(); j++){
                if (arr.get(j) < arr.get(i)){
                    less = arr.get(j);
                    more = arr.get(i);
                    arr.set(i,less);
                    arr.set(j, more);
                }
            }
        }

        System.out.println();
        System.out.print("Your sorted array of numbers are: ");
        for(int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + "\t");
        }
    }
}