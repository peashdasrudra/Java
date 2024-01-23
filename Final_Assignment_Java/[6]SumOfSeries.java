public class SumOfSeries {
    public static void main(String[] args) {
        int n = 5; // Change n to the desired value

        double result = calculateSeriesSum(n);
        System.out.println("Sum of the series: " + result);
    }

    private static double calculateSeriesSum(int n) {
        double sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                sum += Math.pow(-2, (i - 1) / 2) * i;
            }
        }

        return sum;
    }
}
