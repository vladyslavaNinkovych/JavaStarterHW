public class SumMin {
    public static void main(String[] args) {
        int a = 3;
        int b = 6;
        int sum = 0;

        for (int i = a; i < b; i++) {
            sum += i;
        }
        System.out.println("Сумма: " + sum);

        for (int i = a; i < b; i++) {
            Integer reminder = i % 2;
            boolean isEven = reminder.equals(0);
            if (!isEven)
                System.out.println(i);
        }
    }
}
