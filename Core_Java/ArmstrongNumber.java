package CoreJava;
import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int originalNumber = number;
        int sum = 0;

        // Count the number of digits
        int numberOfDigits = String.valueOf(number).length();

        // Calculate the sum of each digit raised to the power of numberOfDigits
        while (number > 0) {
            int digit = number % 10;  // Get the last digit
            sum += Math.pow(digit, numberOfDigits);  // Raise it to the power of numberOfDigits and add to sum
            number /= 10;  // Remove the last digit
        }

        // Check if the calculated sum matches the original number
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }

        scanner.close();
    }
}

