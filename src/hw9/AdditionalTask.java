package hw9;

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
            System.out.print(i + "."+ names[i] + " ");
        }
        System.out.print("\n");

        // Обьединить массивы
        int[] num1 = {1,2,3};
        int[] num2 = {4,5,6};
        int[] num3 = new int[num1.length+ num2.length];

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
    }
}
