public class InsertionSort {
    public static void main(String[] args) {
        int[] numbers = {12, 11, 13, 5, 6};

        // Sorting using insertion sort
        for (int i = 1; i < numbers.length; i++) {
            int key = numbers[i];
            int j = i - 1;

            while (j >= 0 && numbers[j] > key) {
                numbers[j + 1] = numbers[j];
                j = j - 1;
            }
            numbers[j + 1] = key;
        }

        // Display sorted array
        System.out.println("Sorted array using Insertion Sort:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
