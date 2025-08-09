import java.util.Scanner;

public class FindString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the main string:");
        String mainString = sc.nextLine();

        System.out.println("Enter the string to find:");
        String findString = sc.nextLine();

        if (mainString.contains(findString)) {
            System.out.println("String found!");
        } else {
            System.out.println("String not found!");
        }

        sc.close();
    }
}
