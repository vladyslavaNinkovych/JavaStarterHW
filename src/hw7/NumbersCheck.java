package hw7;

import java.util.Scanner;

public class NumbersCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = sc.nextInt();
        // Является ли введенное число положительным или отрицательным.
        checkNumber(number);
        // Является ли число простым
        System.out.println(isPrime(number)
                ? "Простое число"
                : "Составное число");
        // Делится ли на 2, 5, 3, 6, 9 без остатка.
        int[] array = {2, 5, 3, 6, 9};
        for (int divisor : array) {
            System.out.println(checkReminder(number, divisor));
        }
    }

    static void checkNumber(int number) {
        if (number == 0) {
            System.out.println("Число 0");
        } else if (number < 0) {
            System.out.println("Негативное число");
        } else {
            System.out.println("Позитивное число");
        }
    }

    static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    static String checkReminder(int dividend, int divisor) {
        return (dividend % divisor == 0)
                ? "Число делится на " + divisor + " без остатка."
                : "Число делится на " + divisor + " с остатком.";
    }
}
