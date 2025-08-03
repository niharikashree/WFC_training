import java.util.Scanner;
public class PerfectSquareCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sqrt = (int)Math.sqrt(num);
        if (sqrt * sqrt == num)
            System.out.println("Perfect square");
        else
            System.out.println("Not a perfect square");
    }
}
