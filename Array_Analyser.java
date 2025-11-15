import java.util.Arrays;
import java.util.Scanner;

public class Array_Analyser {

        public static void bubbleSort (double[] arr) {

            int n = arr.length;

            for(int i = 0; i < n - 1; i++) {

                for(int j = 0; j < n - i - 1; j++) {

                    if(arr[j] < arr[j + 1]) {

                        double temp = arr[j + 1];
                        arr[j + 1] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }

        public static double mean (double sum, double amount) {

            return sum / amount;
        }

        public static void main(String[] args) {

            Scanner userInput = new Scanner (System.in);

            System.out.println("How many numbers are you going to be entering?");
            int elements = userInput.nextInt();

            double[] array = new double [elements];

            int isPositive = 0;
            int isNegative = 0;
            int sum = 0;

            for(int i = 0; i < array.length; i++) {

                System.out.println("Enter number");
                array[i] = userInput.nextDouble();

                sum += array[i];

                if(array[i] < 0) {
                    isNegative++;
                }

                else {
                    isPositive++;
                }
            }


            System.out.println("\nORIGINAL ARRAY");
            System.out.println(Arrays.toString(array));
            double arrayMean = mean(sum, elements);
            System.out.println();

            System.out.println("Number of positives: " + isPositive);
            System.out.println("Number of negatives: " + isNegative);
            System.out.println();
            System.out.println("Sum total of elements: " + sum);
            System.out.println("Mean of array: " + arrayMean);

            System.out.println("------------------");
            System.out.println("------------------");
            System.out.println("\nSORTED ARRAY");
            bubbleSort(array);
            System.out.println(Arrays.toString(array));
            System.out.println("Sum total of elements: " + sum);
            System.out.println("Mean of array: " + arrayMean);

        }
    }

