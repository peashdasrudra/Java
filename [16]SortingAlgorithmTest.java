import java.util.Arrays;

public class SortingAlgorithmTest {
    public static void main(String[] args) {
        int[] numbers = {29, 10, 14, 37, 13};

        System.out.println("Original array: " + Arrays.toString(numbers));

        // Testing the sorting algorithm (Bubble Sort in this case)
        bubbleSort(numbers);

        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }

    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            // If no two elements were swapped by inner loop, then the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }
}
