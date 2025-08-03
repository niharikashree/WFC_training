import java.util.Scanner;
public class ExamResultSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        switch (marks / 10) {
            case 10:
            case 9: System.out.println("Excellent"); break;
            case 8: System.out.println("Very Good"); break;
            case 7: System.out.println("Good"); break;
            case 6: System.out.println("Average"); break;
            case 5: System.out.println("Pass"); break;
            default: System.out.println("Fail");
        }
    }
}
