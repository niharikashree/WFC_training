import java.util.Scanner;

public class OnesComplement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int onesComp = ~num;
        System.out.println("One's Complement: " + onesComp);
    }
}
