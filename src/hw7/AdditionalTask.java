package hw7;

import java.util.Scanner;

//    1) Напишите метод, который принимает число и возвращает сумму цифр данного числа
//    2) Напишите метод, который принимает число, которое не сожержит нулей и возвращает
//    цифры в обратном порядке.
//    На вход: 789 на выход: 987
public class AdditionalTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        String number = sc.next();
        System.out.println("Cуммa цифр данного числа: " + calcSum(number));
        reverseNumber(number);
    }

    static int calcSum(String num) {
        char[] charArray = num.toCharArray();
        int a = 0;
        for (char i : charArray) {
            int b = Character.getNumericValue(i);
            a += b;
        }
        return a;
    }

    static void reverseNumber(String num) {
        char[] charArray = num.toCharArray();
        System.out.print("Цифры в обратном порядке: ");
        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.print(charArray[i]);
        }
    }
}
