import java.util.Arrays;

public class SecondHighestLowest {
    public static void main(String[] args) {
        int[] array = {12, 5, 7, 1, 9, 3};

        // Sorting the array
        Arrays.sort(array);

        int secondLowest = array[1];
        int secondHighest = array[array.length - 2];

        System.out.println("Second Lowest Element: " + secondLowest);
        System.out.println("Second Highest Element: " + secondHighest);
    }
}
