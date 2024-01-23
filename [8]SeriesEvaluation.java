import java.util.Scanner;

public class SeriesEvaluation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int result = evaluateSeries(n);
        System.out.println("Result of the series: " + result);
    }

    private static int evaluateSeries(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i * (2 * i + 1);
        }

        return sum;
    }
}
