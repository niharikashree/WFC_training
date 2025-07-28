import java.util.Scanner;
public class ToPrintSecondValueOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int secondDigit = getSecondDigitFromLeft(number);
        
        if (secondDigit != -1) {
            System.out.println("The second digit from the left in " + number + " is: " + secondDigit);
        } else {
            System.out.println("The number does not have a second digit.");
        }
        
        scanner.close();
    }

    public static int getSecondDigitFromLeft(int number) {
        String numStr = String.valueOf(number);
        if (numStr.length() < 2) {
            return -1; // Not enough digits
        }
        return Character.getNumericValue(numStr.charAt(1)); // Get the second character and convert to integer
    }
}
