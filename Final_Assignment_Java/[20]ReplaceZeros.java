import java.util.Scanner;

public class ReplaceZeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int result = replaceZerosWithOnes(number);

        System.out.println("Number after replacing 0's with 1's: " + result);
    }

    private static int replaceZerosWithOnes(int num) {
        String numStr = Integer.toString(num);
        numStr = numStr.replace('0', '1');
        return Integer.parseInt(numStr);
    }
}
