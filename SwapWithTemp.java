public class SwapWithTemp {
    public static void main(String[] args) {
        int a = 10, b = 20, temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("After Swap: a = " + a + ", b = " + b);
    }
}
