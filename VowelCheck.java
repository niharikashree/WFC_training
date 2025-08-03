import java.util.Scanner;
public class VowelCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if ("AEIOUaeiou".indexOf(ch) != -1)
            System.out.println("Vowel");
        else
            System.out.println("Not a vowel");
    }
}
