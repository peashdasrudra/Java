import java.util.Scanner;

public class UpperToLower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string in uppercase: ");
        String uppercaseString = scanner.nextLine();

        // Convert to lowercase
        String lowercaseString = uppercaseString.toLowerCase();

        System.out.println("String in lowercase: " + lowercaseString);
    }
}
