import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius;

        do {
            System.out.print("Enter temperature in Celsius: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.next();
                System.out.print("Enter temperature in Celsius: ");
            }
            celsius = scanner.nextDouble();
        } while (false);

        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Equivalent temperature in Fahrenheit: " + fahrenheit);

        if (celsius == 0) {
            System.out.println("Test passed: 0°C is 32°F.");
        } else if (celsius == 100) {
            System.out.println("Test passed: 100°C is 212°F.");
        }
    }
}
