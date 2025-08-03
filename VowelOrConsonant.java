import java.util.Scanner;
public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if (Character.isLetter(ch)) {
            if ("AEIOUaeiou".indexOf(ch) != -1)
                System.out.println("Vowel");
            else
                System.out.println("Consonant");
        } else {
            System.out.println("Not a letter");
        }
    }
}
