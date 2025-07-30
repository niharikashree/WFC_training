public class reverse {
    public static void main(String[] args) {
        String str = "madam";
        String reversedStr = reverseString(str);
        
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversedStr);
    }

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }
}
//use string compare to check if the string is palindrome
public class palindromeCheck {
    public static void main(String[] args) {
        String str = "madam";
        boolean isPalindrome = isPalindrome(str);
        
        if (isPalindrome) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        String reversedStr = new StringBuilder(str).reverse().toString();
        return str.equals(reversedStr);
    }
}
//odd even output in the same line
public class OddEven {
    public static void main(String[] args) {
        int number = 10;
        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number " + number + " is: " + result);
    }
}
