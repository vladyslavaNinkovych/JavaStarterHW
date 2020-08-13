package hw8;

public class Calculator {
    public static void main(String[] args) {
        int a = 5;
        int b = 15;
        int c = 25;
        calculate(a, b, c);
    }

    static void calculate(int a, int b, int c) {
        System.out.println(div5(a) + ", " + div5(b) + ", " + div5(c));
    }

    static int div5(int number) {
        return number/5;
    }

}
