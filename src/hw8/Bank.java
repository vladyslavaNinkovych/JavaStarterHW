package hw8;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        int sum = 400;
        int credit = 700;
        pay(sum, credit);
    }

    static void pay(int sum, int credit) {
        if (sum == credit) {
            System.out.println("Кредит погашен.");
        } else if (sum > credit){
            System.out.println("Кредит погашен. Остаток на счету: "+ (sum-credit));
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.println("Чтобы погасить кредит внесите " + (credit-sum) + " грн. Введите сумму для зачисления на счет:");
            int addedSum = sc.nextInt();
            pay(sum+addedSum, credit);
        }

    }
}
