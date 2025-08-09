import java.util.Scanner;

public class AdditionUsingStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number as string:");
        String num1 = sc.nextLine();

        System.out.println("Enter second number as string:");
        String num2 = sc.nextLine();

        // Convert strings to integers
        int number1 = Integer.parseInt(num1);
        int number2 = Integer.parseInt(num2);

        int sum = number1 + number2;

        System.out.println("Sum: " + sum);

        sc.close();
    }
}
