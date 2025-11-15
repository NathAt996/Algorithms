import java.util.Arrays;

public class Insertion_Key {

    public static void main(String[] args) {

        int[] myArray = {-9,-101,55,897,23,51};

        System.out.println("Original array : " + Arrays.toString(myArray));

        insertionSort(myArray);

        System.out.println("Updated array : " + Arrays.toString(myArray));

    }

    public static void insertionSort (int[] array) {


        //Define n as array length
        int n = array.length;


        //for loop iterating length of array (n)
        for(int i = 1; i < n; i++) {

            //Within forLoop, define key and the j variable (j has to be i - 1)
            int key = array[i];
            int j = (i - 1);

            //While loop, condition met when j >= 0 AND array[j] (pointer for swapping) is greater than our key (array[i])
            while (j >= 0 && array[j] > key) {

                //the array[j + 1] pointer = array[j] so they swap & small int moves to the left (j--)


                array[j + 1] = array[j];
                j--;
            }

            //Define outside the while loop but within the forLoop that array[j + 1] is our key insertion

            array[j + 1] = key;
        }
    }
}
