import java.util.Scanner;

public class WhileInputDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter an integer (0 to quit): ");
        int number = scanner.nextInt();

        while (number != 0) {
            System.out.println("You entered: " + number);
            System.out.print("Please enter next integer (0 to quit): ");
            number = scanner.nextInt();
        }

        System.out.println("Detected 0, loop ended!");
        scanner.close();
    }
}