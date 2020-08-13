package hw8;

public class Delivery {
    public static void main(String[] args) {
        int n = 4;
        System.out.println("Kоличество возможных вариантов доставки товара: " + factorial(n));
    }

    static int factorial(int n) {
        if (n > 1) {
            return n * factorial(--n);
        } else {
            return 1;
        }
    }
}
