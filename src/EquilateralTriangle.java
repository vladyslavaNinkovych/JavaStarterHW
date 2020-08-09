public class EquilateralTriangle {
    public static void main(String[] args) {
        int height = 5;
        int width = 6;

        for (int i = 1; i <= height; i++) {
            for (int spaces = 1; spaces <= width; spaces++) {
                System.out.print(" ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
            width -= 1;
        }
    }
}
