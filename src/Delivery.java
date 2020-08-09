public class Delivery {
    public static void main(String[] args) {
        int clients = 5;
        int deliveryVariants = 1;
        int i = 1;
        while (i <= clients) {
            deliveryVariants *= i;
            i++;
        }
        System.out.println("Kоличество возможных вариантов доставки товара: " + deliveryVariants);
    }
}
