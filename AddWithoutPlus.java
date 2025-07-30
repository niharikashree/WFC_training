public class AddWithoutPlus {
    public static void main(String[] args) {
        int a = 5, b = 7;
        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        System.out.println("Sum: " + a);
    }
}
