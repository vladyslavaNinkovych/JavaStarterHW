import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number from 0 to 100:");
        double number = sc.nextDouble();

        if (number >= 0 && number <= 14) {
            System.out.println("Number is in interval [0 - 14].");
        } else if (number >= 15 && number <= 35) {
            System.out.println("Number is in interval [15 - 35].");
        } else if (number >= 36 && number <= 50) {
            System.out.println("Number is in interval [36 - 50].");
        } else if (number >= 50 && number <= 100) {
            System.out.println("Number is in interval [50 - 100].");
        } else {
            System.err.println("Number is not in range from 0 to 100.");
        }
    }
}
