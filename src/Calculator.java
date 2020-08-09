import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int operand1 = 15;
        int operand2 = 5;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите знак арифметической операции:");
        String sign = sc.next();

        switch (sign) {
            case "+":
                System.out.println(operand1 + operand2);
                break;
            case "-":
                System.out.println(operand1 - operand2);
                break;
            case "*":
                System.out.println(operand1 * operand2);
                break;
            case "/":
                if (operand2==0){
                    System.out.println("Ошибка: деление на 0.");
                } else {
                    System.out.println(operand1 / operand2);
                }
                break;
            case "%":
                System.out.println(operand1 % operand2);
                break;
            default:
                System.err.println("Введите один из знаков: +, -, *, /, %");
        }
    }
}
