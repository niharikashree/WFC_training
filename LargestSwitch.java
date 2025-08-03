import java.util.Scanner;
public class LargestSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        switch (max) {
            case 1: System.out.println("A is largest"); break;
            case 2: System.out.println("B is largest"); break;
            case 3: System.out.println("C is largest"); break;
            default: System.out.println("Largest: " + max);
        }
    }
}
