package hw7;

import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сумму денег в долларах:");
        double usd = sc.nextDouble();
        System.out.println("Введите курс конвертации в гривну:");
        double rate = sc.nextDouble();
        System.out.println(conversion(usd, rate) + " UAH");
    }

    static double conversion(double usd, double rate) {
        return usd * rate;
    }
}
