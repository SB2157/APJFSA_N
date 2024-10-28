package CoreJava;
public class SwapUsingAdditionSubtraction {
    public static void main(String[] args) {
        int a = 6;
        int b = 8;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swap without using a third variable
        a = a + b;  // a becomes 14 (6 + 8)
        b = a - b;  // b becomes 6 (14 - 8)
        a = a - b;  // a becomes 8 (14 - 6)

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}

