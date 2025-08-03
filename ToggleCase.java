import java.util.Scanner;
public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if (Character.isUpperCase(ch))
            System.out.println(Character.toLowerCase(ch));
        else if (Character.isLowerCase(ch))
            System.out.println(Character.toUpperCase(ch));
        else
            System.out.println("Not an alphabet");
    }
}
