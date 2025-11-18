public class Selection_Sorting {

    public static void selectionSort (int[] array) {

        int n = array.length;

        for(int i = 0; i < n - 1; i++) {

            int minimum = i;

            for(int j = i + 1; j < n; j++) {

                if (array[j] < array[minimum]) {

                    minimum = j;
                }
            }

            if (minimum != i) {
            int temp = array[i];
            array[i] = array[minimum];
            array[minimum] = temp;

            }
        }
    }

    public static void printArr (int[] array) {
        for (int values : array) {
            System.out.print(values + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int[] myArray = {11, 3, -9, 77, 68, 202, 38};

        System.out.println("Original array : ");
        printArr(myArray);

        selectionSort(myArray);

        System.out.println("Sorted array : ");
        printArr(myArray);
    }
}
