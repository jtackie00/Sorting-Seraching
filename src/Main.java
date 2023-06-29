import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SelectionSort selectionSort = new SelectionSort();
        BinarySearch binarySearch = new BinarySearch();
        LinearSearch linearSearch = new LinearSearch();

        System.out.print("How many numbers will you input? ");
        int sizeOfNum = scanner.nextInt();
        int[] array = new int[sizeOfNum];

        System.out.println("Input the numbers");

        for (int i = 0; i < sizeOfNum; i++) {
            System.out.print("Number: ");
            array[i] = scanner.nextInt();
        }

        char Yes = 'y';

        while (Yes == 'y') {
            System.out.println("What search meathod would you like to use? ");
            System.out.println("1. Binary search");
            System.out.println("2. Linear search");
            System.out.print("The ball lies in your court: ");
            int num = scanner.nextInt();

            if (num == 1) {
                System.out.print("What number would you like to search in the array? ");
                int key = scanner.nextInt();

                int foundOrNot = binarySearch.BinSearch(array, key);

                if (foundOrNot == -1) {
                    System.out.println("Sorry my dear! Nothing was found, Better luck next time🥲");
                } else {
                    System.out.println("Voila!!! We found your number for you");
                }
            } else if (num == 2){
                System.out.print("What number would you like to search in the array? ");
                int key = scanner.nextInt();

                int foundOrNot = linearSearch.LinSearch(array, key);

                if (foundOrNot == -1){
                    System.out.println("Sorry my dear! Nothing was found, Better luck next time🥲");
                }else {
                    System.out.println("Voila!!! We found your number for you");
                }
            }else {
                System.out.println("Invalid input");
            }
            System.out.print("Would you like to try again? ");
            Yes = scanner.next().charAt(0);
        }
    }
}