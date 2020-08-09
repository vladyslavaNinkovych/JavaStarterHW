import java.util.Scanner;

public class Translator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слово:");
        String weather = sc.next();

        switch (weather.toLowerCase()) {
            case "солнечно":{
                System.out.println("sunny");
                break;
        }
            case "дождливо":{
                System.out.println("rainy");
                break;
            }
            case "снежно":{
                System.out.println("snowy");
                break;
            }
            case "туманно":{
                System.out.println("foggy");
                break;
            }
            case "ветренно":{
                System.out.println("windy");
                break;
            }
            default:
                System.err.println("No translation for a word.");
        }
    }
}
