package hw7;

import java.util.Scanner;

public class Arithmetics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первый операнд:");
        int operand1 = sc.nextInt();
        System.out.println("Введите второй операнд:");
        int operand2 = sc.nextInt();
        System.out.println("Знак арифметической операции:");
        String sign = sc.next();

        switch (sign){
            case "+":
                System.out.println(add(operand1, operand2));
                break;
            case "-":
                System.out.println(sub(operand1, operand2));
                break;
            case "*":
                System.out.println(mul(operand1, operand2));
                break;
            case "/":
                System.out.println(div(operand1, operand2));
                break;

        }
    }

    static int add(int operand1, int operand2) {
        return operand1+operand2;
    }

    static int sub(int operand1, int operand2) {
        return operand1-operand2;
    }

    static int mul(int operand1, int operand2) {
        return operand1*operand2;
    }

    static int div(int operand1, int operand2) {
        if (operand2==0){
            System.out.println("Деление на 0 запрещено.");
            return 0;
        }
        return operand1/operand2;
    }
}
