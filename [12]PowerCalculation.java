import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base (X): ");
        double base = scanner.nextDouble();

        System.out.print("Enter the exponent (n): ");
        int exponent = scanner.nextInt();

        double result = calculatePower(base, exponent);
        System.out.println(base + "^" + exponent + " = " + result);
    }

    private static double calculatePower(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent > 0) {
            return base * calculatePower(base, exponent - 1);
        } else {
            return 1 / (base * calculatePower(base, -exponent - 1));
        }
    }
}
