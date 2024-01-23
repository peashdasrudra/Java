import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int[] numbers = {23, 11, 56, 34, 9};

        // Sorting the array
        Arrays.sort(numbers);

        // Displaying sorted array
        System.out.println("Sorted array: " + Arrays.toString(numbers));

        // Finding max and min value
        int maxValue = numbers[numbers.length - 1];
        int minValue = numbers[0];

        System.out.println("Maximum value: " + maxValue);
        System.out.println("Minimum value: " + minValue);
    }
}
