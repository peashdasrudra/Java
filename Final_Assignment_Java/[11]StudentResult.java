import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks for subject 1: ");
        int subject1 = scanner.nextInt();

        System.out.print("Enter marks for subject 2: ");
        int subject2 = scanner.nextInt();

        System.out.print("Enter marks for subject 3: ");
        int subject3 = scanner.nextInt();

        // Calculate total, average, and GPA
        int totalMarks = subject1 + subject2 + subject3;
        double averageMarks = totalMarks / 3.0;
        double gpa = calculateGPA(averageMarks);

        System.out.println("Total marks: " + totalMarks);
        System.out.println("Average marks: " + averageMarks);
        System.out.println("GPA: " + gpa);
    }

    private static double calculateGPA(double averageMarks) {
        if (averageMarks >= 90) {
            return 4.0;
        } else if (averageMarks >= 80) {
            return 3.5;
        } else if (averageMarks >= 70) {
            return 3.0;
        } else if (averageMarks >= 60) {
            return 2.5;
        } else {
            return 2.0;
        }
    }
}
