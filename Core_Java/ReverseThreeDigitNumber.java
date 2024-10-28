package CoreJava;
import java.util.Scanner;
public class ReverseThreeDigitNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a three-digit number: ");
        int number = scanner.nextInt();

        // Check if the number is a three-digit number
        if (number < 100 || number > 999) {
            System.out.println("Please enter a valid three-digit number.");
        } else {
            int hundreds = number / 100;      // Get the hundreds place
            int tens = (number / 10) % 10;    // Get the tens place
            int units = number % 10;          // Get the units place

            // Reverse the number
            int reversedNumber = (units * 100) + (tens * 10) + hundreds;

            System.out.println("Reversed number: " + reversedNumber);
        }
        scanner.close();
    }
}
