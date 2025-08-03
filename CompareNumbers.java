import java.util.Scanner;
public class CompareNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt(), n2 = sc.nextInt();
        if (n1 > n2)
            System.out.println(n1 + " is greater");
        else if (n2 > n1)
            System.out.println(n2 + " is greater");
        else
            System.out.println("Both are equal");
    }
}
