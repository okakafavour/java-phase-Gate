import java.util.Arrays;

public class ArrayAddition {
    public static void main(String[] args) {
        // Example arrays
        int[] array1 = {3, 5, 7, 9};
        int[] array2 = {1, 2, 6, 8};

        // Call the function
        int[] result = addArrays(array1, array2);

        // Find the largest and smallest values
        int largest = findLargest(result);
        int smallest = findSmallest(result);

        // Print the results
        System.out.println("Resulting array: " + Arrays.toString(result));
        System.out.println("Largest value: " + largest);
        System.out.println("Smallest value: " + smallest);
    }

    // Function to add two arrays
    public static int[] addArrays(int[] array1, int[] array2) {
        // Determine the length of the resulting array (shorter of the two arrays)
        int length = Math.min(array1.length, array2.length);
        int[] result = new int[length];

        // Perform element-wise addition
        for (int i = 0; i < length; i++) {
            result[i] = array1[i] + array2[i];
        }
        return result;
    }

    // Function to find the largest value in an array
    public static int findLargest(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Function to find the smallest value in an array
    public static int findSmallest(int[] array) {
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}
