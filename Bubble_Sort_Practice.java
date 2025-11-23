import java.util.Arrays;
import java.util.Scanner;

public class Bubble_Sort_Practice {

    public static void main(String[] args) {

        Scanner userInput = new Scanner (System.in);

        System.out.println("How many numbers are you putting into your array? ");

        int elements = userInput.nextInt();

        System.out.println("Enter " + elements + " numbers");

        double[] array = new double [elements];

        for (int i = 0; i < array.length; i++) {

            System.out.println("\nEnter number " + (i + 1) + ":");
            array[i] = userInput.nextDouble();
        }

        System.out.println("\nOriginal array : " + Arrays.toString(array));

        bubbleSort(array);

        System.out.println("\nSorted array : " + Arrays.toString(array));

    }

    public static void bubbleSort (double[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    double temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
