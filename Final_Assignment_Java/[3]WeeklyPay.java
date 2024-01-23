import java.util.Scanner;

public class WeeklyPay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter hourly wage: ");
        double hourlyWage = scanner.nextDouble();

        System.out.print("Enter total regular hours: ");
        double totalRegularHours = scanner.nextDouble();

        System.out.print("Enter total overtime hours: ");
        double totalOvertimeHours = scanner.nextDouble();

        // Calculate total weekly pay
        double totalPay = calculateWeeklyPay(hourlyWage, totalRegularHours, totalOvertimeHours);

        System.out.println("Employee's total weekly pay: $" + totalPay);
    }

    private static double calculateWeeklyPay(double hourlyWage, double totalRegularHours, double totalOvertimeHours) {
        double regularPay = hourlyWage * totalRegularHours;
        double overtimePay = totalOvertimeHours * 1.5 * hourlyWage;
        return regularPay + overtimePay;
    }
}
