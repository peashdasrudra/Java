import java.util.Scanner;

public class SeriesSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        double result = calculateSeriesSum(n);
        System.out.println("Sum of the series: " + result);
    }

    private static double calculateSeriesSum(int n) {
        double sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }

        return sum;
    }
}
