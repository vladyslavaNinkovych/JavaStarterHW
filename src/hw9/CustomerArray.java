package hw9;

public class CustomerArray {
    public static void main(String[] args) {
        int[] numbers = {12, 10, 77, 19, 29};
        System.out.println("Max value:" + maxValue(numbers));
        System.out.println("Min value:" + minValue(numbers));
        System.out.println("Summ: " + summ(numbers));
        System.out.println("Avg value:" + avgValue(numbers));
        System.out.println("Нечетные числа:");
        oddValues(numbers);
    }

    static int maxValue(int[] numbers) {
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    static int minValue(int[] numbers) {
        int min = numbers[0];
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    static int summ(int[] numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }

    static int avgValue(int[] numbers) {
        int total = summ(numbers);
        return total / numbers.length;
    }

    static void oddValues(int[] numbers) {
        for (int num : numbers)
            if (num % 2 != 0) {
                System.out.println(num);
            }
    }
}
