package hw9;

import java.util.Arrays;

public class AdditionalTask {
    public static void main(String[] args) {
        String[] names = {"Ann", "Roman", "Maria", "Sasha", "Kate"};
        // Вывести имена
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.print("\n");

        // Вывести 0.Name
        for (int i = 0; i < names.length; i++) {
            System.out.print(i + "." + names[i] + " ");
        }
        System.out.print("\n");

        // Обьединить массивы
        int[] num1 = {1, 2, 3};
        int[] num2 = {4, 5, 6};
        int[] num3 = new int[num1.length + num2.length];

        int index = 0;
        for (int j : num1) {
            num3[index] = j;
            index++;
        }

        for (int x : num2) {
            num3[index] = x;
            index++;
        }

        for (int i : num3) {
            System.out.print(i + " ");
        }
        System.out.print("\n");

        // Найти max, min, avg values in array
        int[] numbers = {12, 10, 77, 19, 29};
        System.out.println("Max value:" + maxValue(numbers));
        System.out.println("Min value:" + minValue(numbers));
        System.out.println("Avg value:" + avgValue(numbers));

        // Sort array
        Arrays.sort(numbers);
        System.out.println("Sorted array:" + Arrays.toString(numbers));
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

    static int avgValue(int[] numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total / numbers.length;
    }
}
